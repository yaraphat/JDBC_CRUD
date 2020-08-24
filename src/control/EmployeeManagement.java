package control;

import dao.DAO;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class EmployeeManagement extends javax.swing.JFrame {

// Custom fields    
    private DAO dao = new DAO();
    private CardLayout accountCards;
    private CardLayout admCards;
    private ButtonColumn buttonColumn;
    private TableRowSorter<DefaultTableModel> sorter;
    private DefaultTableModel listModel;
    private String userId = "";

    public EmployeeManagement() {
        initComponents();
        customCreationCode();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        empLogInPane = new javax.swing.JPanel();
        empLogInForm = new javax.swing.JPanel();
        logId = new javax.swing.JTextField();
        empLogBtn = new javax.swing.JButton();
        logPass = new javax.swing.JPasswordField();
        adminPane = new javax.swing.JPanel();
        adminMenuPane = new javax.swing.JPanel();
        adminMenu = new javax.swing.JComboBox<>();
        admLogOut = new javax.swing.JButton();
        admHome = new javax.swing.JButton();
        admSeparator = new javax.swing.JSeparator();
        admActionPane = new javax.swing.JPanel();
        admEmptyPane = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        curUserTxt = new javax.swing.JLabel();
        curTime = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        addFieldPane = new javax.swing.JPanel();
        addBtnPane = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        clearFields = new javax.swing.JButton();
        admAddCancelBtn = new javax.swing.JButton();
        idPane = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        empIDTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        empNameTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        unitPriceLabel = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        nameLabel1 = new javax.swing.JLabel();
        dsgnTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idPane1 = new javax.swing.JPanel();
        idLabel1 = new javax.swing.JLabel();
        mgrIdTxt = new javax.swing.JTextField();
        idPane3 = new javax.swing.JPanel();
        idLabel3 = new javax.swing.JLabel();
        hireDateChooser = new com.toedter.calendar.JDateChooser();
        idPane4 = new javax.swing.JPanel();
        idLabel4 = new javax.swing.JLabel();
        deptTxt = new javax.swing.JTextField();
        idPane5 = new javax.swing.JPanel();
        idLabel5 = new javax.swing.JLabel();
        bnfTxt = new javax.swing.JTextField();
        admLstTblPanel = new javax.swing.JPanel();
        admTblScrollPane = new javax.swing.JScrollPane();
        admListTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();
        selectAllBox = new javax.swing.JCheckBox();
        idFilter = new javax.swing.JTextField();
        nameFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(0, 0));

        mainFrame.setLayout(new java.awt.CardLayout());

        logId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        logId.setText("Enter ID");
        logId.setName(""); // NOI18N
        logId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logIdFocusLost(evt);
            }
        });
        logId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logIdKeyPressed(evt);
            }
        });

        empLogBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        empLogBtn.setText("Log In");
        empLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLogBtnActionPerformed(evt);
            }
        });
        empLogBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empLogBtnKeyPressed(evt);
            }
        });

        logPass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        logPass.setText("password");
        logPass.setName(""); // NOI18N
        logPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logPassFocusLost(evt);
            }
        });
        logPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logPassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout empLogInFormLayout = new javax.swing.GroupLayout(empLogInForm);
        empLogInForm.setLayout(empLogInFormLayout);
        empLogInFormLayout.setHorizontalGroup(
            empLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empLogInFormLayout.createSequentialGroup()
                .addGroup(empLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empLogInFormLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(empLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logId, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empLogInFormLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(empLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        empLogInFormLayout.setVerticalGroup(
            empLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empLogInFormLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empLogBtn)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout empLogInPaneLayout = new javax.swing.GroupLayout(empLogInPane);
        empLogInPane.setLayout(empLogInPaneLayout);
        empLogInPaneLayout.setHorizontalGroup(
            empLogInPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empLogInPaneLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(empLogInForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        empLogInPaneLayout.setVerticalGroup(
            empLogInPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empLogInPaneLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(empLogInForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        mainFrame.add(empLogInPane, "logInCard");

        adminPane.setBackground(new java.awt.Color(204, 204, 204));
        adminPane.setForeground(new java.awt.Color(51, 51, 51));

        adminMenuPane.setForeground(new java.awt.Color(153, 153, 153));

        adminMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Register Employee", "View Employees", "Change password" }));
        adminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMenuActionPerformed(evt);
            }
        });

        admLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logOutEdited.jpg"))); // NOI18N
        admLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admLogOutActionPerformed(evt);
            }
        });

        admHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/house-blue.png"))); // NOI18N
        admHome.setOpaque(false);
        admHome.setContentAreaFilled(false);
        admHome.setBorderPainted(false);
        admHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminMenuPaneLayout = new javax.swing.GroupLayout(adminMenuPane);
        adminMenuPane.setLayout(adminMenuPaneLayout);
        adminMenuPaneLayout.setHorizontalGroup(
            adminMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPaneLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(admHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(admLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        adminMenuPaneLayout.setVerticalGroup(
            adminMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminMenu)
                    .addComponent(admLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        admActionPane.setLayout(new java.awt.CardLayout());

        jPanel4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Employee Registry System");

        curUserTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        curUserTxt.setText("Current User:  ");

        curTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        curTime.setText("Current Time:  ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(curTime)
                    .addComponent(curUserTxt))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(curUserTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(93, 93, 93)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout admEmptyPaneLayout = new javax.swing.GroupLayout(admEmptyPane);
        admEmptyPane.setLayout(admEmptyPaneLayout);
        admEmptyPaneLayout.setHorizontalGroup(
            admEmptyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admEmptyPaneLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        admEmptyPaneLayout.setVerticalGroup(
            admEmptyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admEmptyPaneLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        admActionPane.add(admEmptyPane, "admSummCard");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearFields.setText("Clear fields");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });

        admAddCancelBtn.setText("Close");
        admAddCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admAddCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBtnPaneLayout = new javax.swing.GroupLayout(addBtnPane);
        addBtnPane.setLayout(addBtnPaneLayout);
        addBtnPaneLayout.setHorizontalGroup(
            addBtnPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnPaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(clearFields)
                .addGap(18, 18, 18)
                .addComponent(admAddCancelBtn))
        );
        addBtnPaneLayout.setVerticalGroup(
            addBtnPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnPaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(addBtnPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn)
                    .addComponent(clearFields)
                    .addComponent(admAddCancelBtn)))
        );

        idLabel.setText("ID");

        javax.swing.GroupLayout idPaneLayout = new javax.swing.GroupLayout(idPane);
        idPane.setLayout(idPaneLayout);
        idPaneLayout.setHorizontalGroup(
            idPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel)
                .addGap(74, 74, 74)
                .addComponent(empIDTxt)
                .addContainerGap())
        );
        idPaneLayout.setVerticalGroup(
            idPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addGap(52, 52, 52)
                .addComponent(empNameTxt)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(empNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        unitPriceLabel.setText("Salary");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(unitPriceLabel)
                .addGap(51, 51, 51)
                .addComponent(salaryTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPriceLabel)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel1.setText("Designation");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel1)
                .addGap(18, 18, 18)
                .addComponent(dsgnTxt)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(dsgnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Employee Registry Form");

        idLabel1.setText("Manager ID");

        javax.swing.GroupLayout idPane1Layout = new javax.swing.GroupLayout(idPane1);
        idPane1.setLayout(idPane1Layout);
        idPane1Layout.setHorizontalGroup(
            idPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel1)
                .addGap(18, 18, 18)
                .addComponent(mgrIdTxt)
                .addContainerGap())
        );
        idPane1Layout.setVerticalGroup(
            idPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgrIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idLabel3.setText("Hired At");

        javax.swing.GroupLayout idPane3Layout = new javax.swing.GroupLayout(idPane3);
        idPane3.setLayout(idPane3Layout);
        idPane3Layout.setHorizontalGroup(
            idPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel3)
                .addGap(38, 38, 38)
                .addComponent(hireDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        idPane3Layout.setVerticalGroup(
            idPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(idPane3Layout.createSequentialGroup()
                .addComponent(hireDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        idLabel4.setText("Department");

        javax.swing.GroupLayout idPane4Layout = new javax.swing.GroupLayout(idPane4);
        idPane4.setLayout(idPane4Layout);
        idPane4Layout.setHorizontalGroup(
            idPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel4)
                .addGap(18, 18, 18)
                .addComponent(deptTxt)
                .addContainerGap())
        );
        idPane4Layout.setVerticalGroup(
            idPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idLabel5.setText("Benefits");

        javax.swing.GroupLayout idPane5Layout = new javax.swing.GroupLayout(idPane5);
        idPane5.setLayout(idPane5Layout);
        idPane5Layout.setHorizontalGroup(
            idPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel5)
                .addGap(37, 37, 37)
                .addComponent(bnfTxt)
                .addContainerGap())
        );
        idPane5Layout.setVerticalGroup(
            idPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addFieldPaneLayout = new javax.swing.GroupLayout(addFieldPane);
        addFieldPane.setLayout(addFieldPaneLayout);
        addFieldPaneLayout.setHorizontalGroup(
            addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFieldPaneLayout.createSequentialGroup()
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFieldPaneLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFieldPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFieldPaneLayout.createSequentialGroup()
                        .addComponent(addBtnPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        addFieldPaneLayout.setVerticalGroup(
            addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFieldPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addFieldPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addBtnPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(addFieldPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(addFieldPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        admActionPane.add(addPanel, "admAddCard");

        admListTbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        admListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "Name", "Designation", "Department", "ManagerID", "Salary", "Benefits", "Hired at", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        admListTbl.setColumnSelectionAllowed(true);
        admListTbl.setRowHeight(20);
        admTblScrollPane.setViewportView(admListTbl);
        admListTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (admListTbl.getColumnModel().getColumnCount() > 0) {
            admListTbl.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        deleteBtn.setText("Delete selected");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        selectAllBox.setText("Select all");
        selectAllBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Search ID");

        jLabel3.setText("Search name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectAllBox)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(selectAllBox)
                    .addComponent(idFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );

        javax.swing.GroupLayout admLstTblPanelLayout = new javax.swing.GroupLayout(admLstTblPanel);
        admLstTblPanel.setLayout(admLstTblPanelLayout);
        admLstTblPanelLayout.setHorizontalGroup(
            admLstTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admLstTblPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(admLstTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admLstTblPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(admTblScrollPane))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        admLstTblPanelLayout.setVerticalGroup(
            admLstTblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admLstTblPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admTblScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        admActionPane.add(admLstTblPanel, "admListCard");

        javax.swing.GroupLayout adminPaneLayout = new javax.swing.GroupLayout(adminPane);
        adminPane.setLayout(adminPaneLayout);
        adminPaneLayout.setHorizontalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admSeparator)
                    .addComponent(adminMenuPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admActionPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        adminPaneLayout.setVerticalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminMenuPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admActionPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainFrame.add(adminPane, "adminCard");

        getContentPane().add(mainFrame, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(937, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customCreationCode() {
        listModel = (DefaultTableModel) admListTbl.getModel();
        accountCards = (CardLayout) mainFrame.getLayout();
        admCards = (CardLayout) admActionPane.getLayout();
        setRowFilter();
        admListTblClickEvt();
        buildTable();
        refreshAdminPanel();

    }

    private void adminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMenuActionPerformed

        switch (adminMenu.getSelectedIndex()) {
            case 1:
                dispAddPanel();
                break;
            case 2:
                dispViewPanel();
                break;
            case 3:
                changePsw();
            default:
                break;
        }
    }//GEN-LAST:event_adminMenuActionPerformed
//Add panel close
    private void admAddCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admAddCancelBtnActionPerformed
        admHome();
    }//GEN-LAST:event_admAddCancelBtnActionPerformed
//Adding or updating inventoy
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        saveData();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void admLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admLogOutActionPerformed
        logOut();
    }//GEN-LAST:event_admLogOutActionPerformed

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed
        clearAddRecords();
    }//GEN-LAST:event_clearFieldsActionPerformed

    private void admHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admHomeActionPerformed
        admHome();
    }//GEN-LAST:event_admHomeActionPerformed

    private void selectAllBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllBoxActionPerformed
        selectAll();
    }//GEN-LAST:event_selectAllBoxActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteSelected();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void logPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logPassKeyPressed
        logInKeyPressed(evt);
    }//GEN-LAST:event_logPassKeyPressed

    private void logPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logPassFocusLost
        fillTxt(logPass, "password");
    }//GEN-LAST:event_logPassFocusLost

    private void logPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logPassFocusGained
        clearTxt(logPass, "password");
    }//GEN-LAST:event_logPassFocusGained

    private void empLogBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empLogBtnKeyPressed
        logInKeyPressed(evt);
    }//GEN-LAST:event_empLogBtnKeyPressed

    private void logIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logIdKeyPressed
        logInKeyPressed(evt);
    }//GEN-LAST:event_logIdKeyPressed

    private void empLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLogBtnActionPerformed
        logInValueVerify();
    }//GEN-LAST:event_empLogBtnActionPerformed

    private void logIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logIdFocusGained
        clearTxt(logId, "Enter ID");
    }//GEN-LAST:event_logIdFocusGained

    private void logIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logIdFocusLost
        fillTxt(logId, "Enter ID");
    }//GEN-LAST:event_logIdFocusLost

    private void clearTxt(JTextField tf, String txt) {
        if (tf.getText().equals(txt)) {
            tf.setText("");
        }
    }

    private void fillTxt(JTextField tf, String txt) {
        if (tf.getText().equals("")) {
            tf.setText(txt);
        }
    }

    private void logInKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logInValueVerify();
        }
    }

    private void logOut() {
        refreshLogInPanel();
        accountCards.show(mainFrame, "logInCard");
        userId = "";
        curUserTxt.setText("Current User:  ");
        refreshAdminPanel();
    }

    private void saveData() {
        String outcome = "Operation failed";
        Employee employee = getRecords(new Employee());
        if (employee != null) {
            outcome = dao.add(employee);
        }
        if (outcome.equals("Successfully done")) {
            addTableRow(employee);
        }
        JOptionPane.showMessageDialog(this, outcome);
    }
    
    private void selectAll() {
        int rowCount = listModel.getRowCount();
        if (selectAllBox.isSelected()) {
            for (int i = 0; i < rowCount; i++) {
                listModel.setValueAt(true, i, 0);
            }
        } else {
            for (int i = 0; i < rowCount; i++) {
                listModel.setValueAt(false, i, 0);
            }
        }
    }

    private void logInValueVerify() {
        String id = logId.getText();
        String psw = new String(logPass.getPassword());
        Employee employee = dao.getDesignation(id, psw);
        if (employee.designation == null) {
            JOptionPane.showMessageDialog(this, "Invalid ID or Password");
        } else if (employee.designation.equalsIgnoreCase("clerk") || employee.designation.equalsIgnoreCase("hrm")) {
            userId = id;
            String userName = "Current user: " + employee.empName.toUpperCase();
            curUserTxt.setText(userName);
            accountCards.show(mainFrame, "adminCard");
        } else {
            JOptionPane.showMessageDialog(this, "Access denied for user " + id);
        }
    }

    private void dispAddPanel() {
        admCards.show(admActionPane, "admAddCard");
    }

    private void dispViewPanel() {
        admCards.show(admActionPane, "admListCard");
    }

    private Employee getRecords(Employee employee) {
        employee.empID = empIDTxt.getText();
        employee.empName = empNameTxt.getText();
        employee.designation = dsgnTxt.getText();
        employee.mgrId = mgrIdTxt.getText();
        try {
            employee.salary = Double.parseDouble(salaryTxt.getText());
            employee.benefits = Double.parseDouble(bnfTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Please enter numeric value for salary and benefits");
            return null;
        }
        employee.department = deptTxt.getText();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
        employee.hireDate = sdf.format(hireDateChooser.getDate());
        return employee;
    }

    private void deleteSelected() {
        String ids = "";
        List<Integer> rowIndex = new ArrayList();
        int rowCount = admListTbl.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Boolean checked = (Boolean) admListTbl.getValueAt(i, 0);
            if (checked) {
                int modelIndex = admListTbl.convertRowIndexToModel(i);
                ids += listModel.getValueAt(modelIndex, 1) + ",";
                rowIndex.add(modelIndex);
            }
        }

        if (ids.length() > 0) {
            boolean deleted = dao.deleteMultiple(ids.substring(0, ids.length() - 1));

            if (deleted) {
                int rows = rowIndex.size();
                for (int i = 0; i < rows; i++) {
                    listModel.removeRow(rowIndex.get(i) - i);
                }
                selectAllBox.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(this, "Operation failed");
            }
        }
    }

    private void refreshAdminPanel() {
        adminMenu.setSelectedIndex(0);
        String time = "Current time: " + getCurrenttime();
        curTime.setText(time);
    }

    private void admHome() {
        refreshAdminPanel();
        admCards.show(admActionPane, "admSummCard");
    }

    private void changePsw() {
        JTextField oldPf = new JTextField();
        JTextField newPf = new JPasswordField();
        JTextField rePf = new JPasswordField();
        Object[] message = {
            "Old Password:", oldPf,
            "New Password:", newPf,
            "New Password:", rePf
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Change Password", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String oldPsw = oldPf.getText();
            String newPsw = newPf.getText();
            String rePsw = rePf.getText();
            if (newPsw.equals(rePsw)) {
                boolean changed = dao.verifyPswChange(userId, oldPsw, newPsw);
                if (changed) {
                    JOptionPane.showMessageDialog(rootPane, "Successfully done");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "New password entries mismatch. Try again later");
            }
        } else {

        }
    }

    private void refreshLogInPanel() {
        logId.setText("");
        logPass.setText("password");
    }

    private void clearAddRecords() {
        empIDTxt.setText("");
        empNameTxt.setText("");
        dsgnTxt.setText("");
        salaryTxt.setText("");
        deptTxt.setText("");
        bnfTxt.setText("");
        mgrIdTxt.setText("");
        hireDateChooser.cleanup();
    }

    public String getCurrenttime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy   hh:mm a");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void setRowFilter() {
        listModel = (DefaultTableModel) admListTbl.getModel();
        sorter = new TableRowSorter(listModel);
        admListTbl.setRowSorter(sorter);
        admListTbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        txtDocumentListener(nameFilter, 2);
        txtDocumentListener(idFilter, 1);
    }

    private void txtDocumentListener(JTextField filterText, Integer column) {
        filterText.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                newFilter(filterText, column);
            }

            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                newFilter(filterText, column);
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                newFilter(filterText, column);
            }
        });
    }

    private void newFilter(JTextField filterText, Integer column) {
        RowFilter<DefaultTableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(filterText.getText(), column);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }

    private void admListTblClickEvt() {
        admListTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = admListTbl.rowAtPoint(evt.getPoint());
                int col = admListTbl.columnAtPoint(evt.getPoint());
                Employee empOld = getRowValues(new Employee(), row);
                if (col == 9) {
                    String feedback = updateEmployee(row);
                    if (feedback.equals("Operation failed")) {
                        setRowValues(empOld, row);
                    }
                    JOptionPane.showMessageDialog(rootPane, feedback);
                }
            }
        });
    }

    private String updateEmployee(int rowindex) {
        Employee employee = getRowValues(new Employee(), rowindex);
        String feedback = dao.update(employee);
        return feedback;
    }

    private Employee getRowValues(Employee emp, int row) {
        emp.empID = (String) admListTbl.getValueAt(row, 1);
        emp.empName = (String) admListTbl.getValueAt(row, 2);
        emp.designation = (String) admListTbl.getValueAt(row, 3);
        emp.department = (String) admListTbl.getValueAt(row, 4);
        emp.mgrId = (String) admListTbl.getValueAt(row, 5);
        emp.salary = (Double) admListTbl.getValueAt(row, 6);
        emp.benefits = (Double) admListTbl.getValueAt(row, 7);
        emp.hireDate = (String) admListTbl.getValueAt(row, 8);
        return emp;
    }

    private Employee setRowValues(Employee emp, int row) {
        admListTbl.setValueAt(emp.empName, row, 2);
        admListTbl.setValueAt(emp.designation, row, 3);
        admListTbl.setValueAt(emp.department, row, 4);
        admListTbl.setValueAt(emp.mgrId, row, 5);
        admListTbl.setValueAt(emp.salary, row, 6);
        admListTbl.setValueAt(emp.benefits, row, 7);
        admListTbl.setValueAt(emp.hireDate, row, 8);
        return emp;
    }

    private void buildTable() {
        new Thread() {
            @Override
            public void run() {
                listModel.setRowCount(0);
                List<Employee> list = dao.listEmployee(new ArrayList());
                for (Employee emp : list) {
                    addTableRow(emp);
                }
                buttonColumn = new ButtonColumn(admListTbl, 9);
            }
        }.start();
    }
    
    private void addTableRow(Employee emp) {
        String name = emp.empName.toUpperCase();
        String designation = emp.designation.toUpperCase();
        String department = emp.department.toUpperCase();
        listModel.addRow(new Object[]{false, emp.empID, name, designation, department, emp.mgrId, emp.salary, emp.benefits, emp.hireDate, "UPDATE"});
    }
    

    public static void main(String[] args) {
        {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(EmployeeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new EmployeeManagement().setVisible(true);
                }
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBtnPane;
    private javax.swing.JPanel addFieldPane;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel admActionPane;
    private javax.swing.JButton admAddCancelBtn;
    private javax.swing.JPanel admEmptyPane;
    private javax.swing.JButton admHome;
    private javax.swing.JTable admListTbl;
    private javax.swing.JButton admLogOut;
    private javax.swing.JPanel admLstTblPanel;
    private javax.swing.JSeparator admSeparator;
    private javax.swing.JScrollPane admTblScrollPane;
    private javax.swing.JComboBox<String> adminMenu;
    private javax.swing.JPanel adminMenuPane;
    private javax.swing.JPanel adminPane;
    private javax.swing.JTextField bnfTxt;
    private javax.swing.JButton clearFields;
    private javax.swing.JLabel curTime;
    private javax.swing.JLabel curUserTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField deptTxt;
    private javax.swing.JTextField dsgnTxt;
    private javax.swing.JTextField empIDTxt;
    private javax.swing.JButton empLogBtn;
    private javax.swing.JPanel empLogInForm;
    private javax.swing.JPanel empLogInPane;
    private javax.swing.JTextField empNameTxt;
    private com.toedter.calendar.JDateChooser hireDateChooser;
    private javax.swing.JTextField idFilter;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idLabel3;
    private javax.swing.JLabel idLabel4;
    private javax.swing.JLabel idLabel5;
    private javax.swing.JPanel idPane;
    private javax.swing.JPanel idPane1;
    private javax.swing.JPanel idPane3;
    private javax.swing.JPanel idPane4;
    private javax.swing.JPanel idPane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField logId;
    private javax.swing.JPasswordField logPass;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JTextField mgrIdTxt;
    private javax.swing.JTextField nameFilter;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JCheckBox selectAllBox;
    private javax.swing.JLabel unitPriceLabel;
    // End of variables declaration//GEN-END:variables
}
