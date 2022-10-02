/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;
import Company.Employees;
import Company.Employee;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author srikr
 */
public class Search extends javax.swing.JPanel {

    /**
     * Creates new form Search
     */
    private Employees employees;
    public Search(Employees employees) {
        initComponents();
        this.employees=employees;
        
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        for (Employee employee : employees.getEmployees()){
          
            Object[] row = new Object[10];
            row[0] = employee.getName();
            row[1] = employee.getAge();
            row[2] = employee.getGender();
            row[3] = employee.getEmployeeId();
            row[4] = employee.getPhoneNumber();
            row[5] = employee.getEmailId();
            row[6] = employee.getStartDate();
            row[7] = employee.getPositionTitle();
            row[8] = employee.getLevel();
            row[9] = employee.getTeamInfo();
            
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGenderGroup = new javax.swing.ButtonGroup();
        jEmployeeId = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jEmailId = new javax.swing.JLabel();
        jAge = new javax.swing.JLabel();
        jImage2 = new javax.swing.JPanel();
        jName = new javax.swing.JLabel();
        jPhoneNo = new javax.swing.JLabel();
        jAgetf = new javax.swing.JTextField();
        jEmployee = new javax.swing.JLabel();
        jTeamInfo = new javax.swing.JLabel();
        jLevel = new javax.swing.JLabel();
        jStartDate = new javax.swing.JLabel();
        jMale = new javax.swing.JRadioButton();
        jPhoneNotf = new javax.swing.JTextField();
        jLGBTQ = new javax.swing.JRadioButton();
        jNametf = new javax.swing.JTextField();
        jFemale = new javax.swing.JRadioButton();
        jEmailidtf = new javax.swing.JTextField();
        jTeamInfotf = new javax.swing.JTextField();
        jDelete = new javax.swing.JButton();
        jPositionTitletf = new javax.swing.JTextField();
        jPositionTitle = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jLeveltf = new javax.swing.JTextField();
        jEmployeeIdtf = new javax.swing.JTextField();
        jStartDatetf = new com.toedter.calendar.JDateChooser();
        jSearch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jViewDetails = new javax.swing.JButton();
        jSearchtf = new javax.swing.JTextField();

        jEmployeeId.setText("Employee ID");

        jGender.setText("Gender");

        jEmailId.setText("Email ID");

        jAge.setText("Age");

        javax.swing.GroupLayout jImage2Layout = new javax.swing.GroupLayout(jImage2);
        jImage2.setLayout(jImage2Layout);
        jImage2Layout.setHorizontalGroup(
            jImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jImage2Layout.setVerticalGroup(
            jImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jName.setText("Name");

        jPhoneNo.setText("Phone No");

        jEmployee.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jEmployee.setText("Edit Employee Details");

        jTeamInfo.setText("Team Info");

        jLevel.setText("Level");

        jStartDate.setText("Start Date");

        jGenderGroup.add(jMale);
        jMale.setText("Male");
        jMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaleActionPerformed(evt);
            }
        });

        jGenderGroup.add(jLGBTQ);
        jLGBTQ.setText("LGBTQ+");
        jLGBTQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLGBTQActionPerformed(evt);
            }
        });

        jGenderGroup.add(jFemale);
        jFemale.setText("Female");
        jFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleActionPerformed(evt);
            }
        });

        jDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jPositionTitle.setText("Position Title");

        jUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jUpdate.setText("Update");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jSearch1.setText("Search");
        jSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearch1ActionPerformed(evt);
            }
        });
        jSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearch1KeyReleased(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone No", "Email Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jViewDetails.setText("View Details");
        jViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jStartDate)
                                    .addComponent(jEmployeeId)
                                    .addComponent(jAge)
                                    .addComponent(jTeamInfo)
                                    .addComponent(jName)
                                    .addComponent(jPositionTitle)
                                    .addComponent(jPhoneNo)
                                    .addComponent(jEmailId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jAgetf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLGBTQ))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLeveltf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jTeamInfotf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPositionTitletf, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPhoneNotf, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEmailidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)
                                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jNametf)
                                    .addComponent(jEmployeeIdtf, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jEmployee)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSearchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSearch1)
                                    .addGap(31, 31, 31))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jViewDetails)))
                .addGap(40, 40, 40))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jEmailidtf, jEmployeeIdtf, jPhoneNotf, jPositionTitletf, jTeamInfotf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSearch1, jUpdate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLeveltf, jSearchtf});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmployee)
                    .addComponent(jSearch1)
                    .addComponent(jSearchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jViewDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName)
                            .addComponent(jNametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmployeeId)
                            .addComponent(jEmployeeIdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAge)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jAgetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jGender)
                                .addComponent(jMale)
                                .addComponent(jFemale)
                                .addComponent(jLGBTQ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLeveltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLevel))
                            .addComponent(jStartDate)
                            .addComponent(jStartDatetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeamInfotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTeamInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPositionTitle)
                    .addComponent(jPositionTitletf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPhoneNotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPhoneNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmailidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmailId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSearch1, jUpdate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLeveltf, jSearchtf});

    }// </editor-fold>//GEN-END:initComponents

    private void jMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaleActionPerformed

    private void jLGBTQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLGBTQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLGBTQActionPerformed

    private void jFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFemaleActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();
        if (selectedrow >= 0){
            Employee employee = (Employee)jTable.getValueAt(selectedrow, 0);
            employees.deleteEmployee(employee);
            JOptionPane.showMessageDialog(null, "deleted");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "please select");
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        Employee employee = null;
        employee.setName(jNametf.getText());
        employee.setEmployeeId(jEmployeeIdtf.getText());
        employee.setAge(Integer.parseInt(jAgetf.getText()));
        employee.setStartDate(jStartDatetf.getDate());
        employee.setLevel(jLeveltf.getText());
        employee.setTeamInfo(jTeamInfotf.getText());
        employee.setPositionTitle(jPositionTitletf.getText());
        employee.setPhoneNumber(Long.parseLong(jPhoneNotf.getText()));
        employee.setEmailId(jEmailidtf.getText());
        JOptionPane.showMessageDialog(null, "Employee Profile Updated Successfully");
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearch1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jSearchtf.getText().trim()));
    }//GEN-LAST:event_jSearch1ActionPerformed

    private void jViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrow = jTable.getSelectedRow();
        if (selectedrow >= 0){
            Employee employee = (Employee) jTable.getValueAt(selectedrow, 0);
            jNametf.setText(String.valueOf(employee.getName()));
            jEmployeeIdtf.setText(String.valueOf(employee.getEmployeeId()));
            jAgetf.setText(String.valueOf(employee.getAge()));
            switch (employee.getGender()) {
                case "Male" -> jMale.setSelected(true);
                case "Female" -> jFemale.setSelected(true);
                default -> jLGBTQ.setSelected(true);
            }
            jStartDatetf.setDate(employee.getStartDate());
            jLeveltf.setText(String.valueOf(employee.getLevel()));
            jTeamInfotf.setText(String.valueOf(employee.getTeamInfo()));
            jPositionTitletf.setText(String.valueOf(employee.getPositionTitle()));
            jPhoneNotf.setText(String.valueOf(employee.getTeamInfo()));
            jEmailidtf.setText(String.valueOf(employee.getPositionTitle()));
        }
        else{
            JOptionPane.showMessageDialog(null, "please select");
        }
    }//GEN-LAST:event_jViewDetailsActionPerformed

    private void jSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearch1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jSearchtf.getText().trim()));
    }//GEN-LAST:event_jSearch1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAge;
    private javax.swing.JTextField jAgetf;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jEmailId;
    private javax.swing.JTextField jEmailidtf;
    private javax.swing.JLabel jEmployee;
    private javax.swing.JLabel jEmployeeId;
    private javax.swing.JTextField jEmployeeIdtf;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JLabel jGender;
    private javax.swing.ButtonGroup jGenderGroup;
    private javax.swing.JPanel jImage2;
    private javax.swing.JRadioButton jLGBTQ;
    private javax.swing.JLabel jLevel;
    private javax.swing.JTextField jLeveltf;
    private javax.swing.JRadioButton jMale;
    private javax.swing.JLabel jName;
    private javax.swing.JTextField jNametf;
    private javax.swing.JLabel jPhoneNo;
    private javax.swing.JTextField jPhoneNotf;
    private javax.swing.JLabel jPositionTitle;
    private javax.swing.JTextField jPositionTitletf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch1;
    private javax.swing.JTextField jSearchtf;
    private javax.swing.JLabel jStartDate;
    private com.toedter.calendar.JDateChooser jStartDatetf;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jTeamInfo;
    private javax.swing.JTextField jTeamInfotf;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jViewDetails;
    // End of variables declaration//GEN-END:variables


    /*private void searchEmployee(Employees employees) {
        
        String employeeName=employee.getName();
        jNametf.setText(employeeName);

        String employeeId=employee.getEmployeeId();
        jEmployeeIdtf.setText(employeeId);
        
        String employeeAge=Integer.toString(employee.getAge());
        jAgetf.setText(employeeAge);

        String employeeGender=employee.getGender();
        switch (employeeGender) {
            case "Male" -> jMale.setSelected(true);
            case "Female" -> jFemale.setSelected(true);
            default -> jLGBTQ.setSelected(true);
        }
        
        
        Date employeeStartDate=employee.getStartDate();
        jStartDatetf.setDate(employeeStartDate);

        String employeeLevel=employee.getLevel();
        jLeveltf.setText(employeeLevel);

        String employeeTeamInfo=employee.getTeamInfo();
        jTeamInfotf.setText(employeeTeamInfo);

        String employeePositionTitle=employee.getPositionTitle();
        jPositionTitletf.setText(employeePositionTitle);
        
        String employeePhoneNo=Long.toString(employee.getPhoneNumber());
        jPhoneNotf.setText(employeePhoneNo);

        String employeeEmailId=employee.getEmailId();
        jEmailidtf.setText(employeeEmailId);
    }
*/
}
