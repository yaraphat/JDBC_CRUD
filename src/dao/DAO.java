package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Employee;

public class DAO {

    private DBConnection dbc = DBConnection.getInstance();

    public synchronized String add(Employee employee) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int affectedRows = 0;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement("select * from Employee where employee_id = ?");
            stmt.setString(1, employee.empID);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return "employee ID already exists";
            }
            stmt = con.prepareStatement("insert into Employee (employee_name, designation, department, mgr_id, salary, benefits, hire_date, employee_id) values(?,?,?,?,?,?,?,?)");
            Date sqlDate = reverseDate(employee.hireDate);
            stmt.setString(1, employee.empName);
            stmt.setString(2, employee.designation);
            stmt.setString(3, employee.department);
            stmt.setString(4, employee.mgrId);
            stmt.setDouble(5, employee.salary);
            stmt.setDouble(6, employee.benefits);
            stmt.setDate(7, sqlDate);
            stmt.setString(8, employee.empID);
            affectedRows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbc.closeConnection(con, stmt, rs);
        }
        return (affectedRows > 0) ? "Successfully done" : "Operation failed";
    }

    public List<Employee> listEmployee(List<Employee> list) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement("select employee_id, employee_name, designation, department, mgr_id, salary, benefits, hire_date from Employee");
            rs = stmt.executeQuery();
            collectSQLData(list, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbc.closeConnection(con, stmt, rs);
        }
        return list;
    }

    public Employee getDesignation(String id, String password) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Employee emp = new Employee();
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement("select * from employee where  employee_id = ? and password = ?");
            stmt.setString(1, id);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                emp.empName = rs.getString("employee_name");
                emp.designation = rs.getString("designation");
            }
        } catch (SQLException e) {
        } finally {
            dbc.closeConnection(con, stmt, rs);
        }

        return emp;
    }
//
//    public List<Employee> search(List<Employee> list, int designation, String value) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        try {
//            con = dbc.getConnection("emp_mgt");
//            String preparedCommand = getCommandFordesignation(designation);
//            if (preparedCommand == null) {
//                return list;
//            }
//            stmt = con.prepareStatement(preparedCommand);
//            if (designation == 3) {
//                stmt.setDouble(1, Double.parseDouble(value));
//            } else {
//                stmt.setString(1, value);
//            }
//            rs = stmt.executeQuery();
//            collectSQLData(list, rs);
//
//        } catch (NumberFormatException | SQLException e) {
//        } finally {
//            dbc.closeConnection(con, stmt, rs);
//        }
//        return list;
//    }

    private void collectSQLData(List<Employee> list, ResultSet result) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            while (result.next()) {
                Employee employee = new Employee();
                employee.empID = result.getString("employee_id");
                employee.empName = result.getString("employee_name");
                employee.designation = result.getString("designation");
                employee.department = result.getString("department");
                employee.mgrId = result.getString("mgr_id");
                employee.salary = result.getDouble("salary");
                employee.benefits = result.getDouble("benefits");
                employee.hireDate = sdf.format(result.getDate("hire_date"));
                list.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
//
//    private String getCommandFordesignation(int designation) {
//        switch (designation) {
//            case 1:
//                return "select * from Employee where  employee_id = ?";
//            case 2:
//                return "select * from Employee where  employee_name = ?";
//            case 3:
//                return "select * from Employee where  purchasing_price = ?";
//            case 4:
//                return "select * from Employee where  manufacturing_date = ?";
//            case 5:
//                return "select * from Employee where  expiry_date = ?";
//            default:
//                return null;
//        }
//    }

    public synchronized String update(Employee employee) {
        Connection con = null;
        PreparedStatement stmt = null;
        int affectedRows = 0;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement(
                    "UPDATE Employee \n"
                    + "SET \n"
                    + "employee_name = ?, \n"
                    + "designation = ?, \n"
                    + "department = ?, \n"
                    + "mgr_id = ?, \n"
                    + "salary = ?, \n"
                    + "benefits = ?, \n"
                    + "hire_date = ? \n"
                    + "where \n"
                    + "employee_id = ?"
            );
            Date sqlDate = reverseDate(employee.hireDate);
            stmt.setString(1, employee.empName);
            stmt.setString(2, employee.designation);
            stmt.setString(3, employee.department);
            stmt.setString(4, employee.mgrId);
            stmt.setDouble(5, employee.salary);
            stmt.setDouble(6, employee.benefits);
            stmt.setDate(7, sqlDate);
            stmt.setString(8, employee.empID);

            affectedRows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            dbc.closeConnection(con, stmt, null);

        }
        return (affectedRows > 0) ? "Successfully done" : "Operation failed";
    }

    private Date reverseDate(String date) {
        String revDate = "";
        String[] dArray = date.split("-");
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                revDate += dArray[i];
            } else {
                revDate += dArray[i] + "-";
            }

        }
        return Date.valueOf(revDate);
    }

    public synchronized int deleteemployee(String id) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rowCount = 0;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement("Delete FROM Employee where employee_id = ?");
            stmt.setString(1, id);
            rowCount = stmt.executeUpdate();
        } catch (SQLException e) {
        } finally {
            dbc.closeConnection(con, stmt, null);
        }
        return rowCount;
    }

    public synchronized boolean deleteMultiple(String id) {

        Connection con = null;
        PreparedStatement stmt = null;
        int rowCount = 0;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement("Delete FROM Employee where employee_id in(" + id + ")");
            rowCount = stmt.executeUpdate();
        } catch (SQLException e) {
        } finally {
            dbc.closeConnection(con, stmt, null);
        }
        return rowCount > 0;
    }

    public boolean verifyPswChange(String id, String oldPsw, String newPsw) {
        Connection con = null;
        PreparedStatement stmt = null;
        int affectedRows = 0;
        try {
            con = dbc.getConnection("emp_mgt");
            stmt = con.prepareStatement(
                    "UPDATE Employee \n"
                    + "SET \n"
                    + "password = ? \n"
                    + "where \n"
                    + "employee_id = ?\n"
                    + "And password = ?"
            );

            stmt.setString(1, newPsw);
            stmt.setString(2, id);
            stmt.setString(3, oldPsw);
            affectedRows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            dbc.closeConnection(con, stmt, null);

        }
        return affectedRows > 0;
    }

}
