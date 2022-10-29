/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

/**
 *
 * @author srikr
 */
public class HospitalAdminEncounterjPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminEncounterjPanel
     */
    public HospitalAdminEncounterjPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEncounterdetailslbl = new javax.swing.JLabel();
        jEScrollPane = new javax.swing.JScrollPane();
        jEncountertbl = new javax.swing.JTable();
        jCreatebtn = new javax.swing.JButton();
        jReadbtn = new javax.swing.JButton();
        jUpdatebtn = new javax.swing.JButton();

        jEncounterdetailslbl.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jEncounterdetailslbl.setText("ENCOUNTER DETAILS :");

        jEncountertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Doctor Name", "Respiration Rate", "Heart Rate", "Height", "Weight", "Abnormal"
            }
        ));
        jEScrollPane.setViewportView(jEncountertbl);

        jCreatebtn.setText("CREATE");

        jReadbtn.setText("READ");

        jUpdatebtn.setText("UPDATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCreatebtn)
                        .addGap(30, 30, 30)
                        .addComponent(jReadbtn)
                        .addGap(30, 30, 30)
                        .addComponent(jUpdatebtn))
                    .addComponent(jEScrollPane)
                    .addComponent(jEncounterdetailslbl))
                .addGap(363, 363, 363))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jEncounterdetailslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCreatebtn)
                    .addComponent(jReadbtn)
                    .addComponent(jUpdatebtn))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCreatebtn;
    private javax.swing.JScrollPane jEScrollPane;
    private javax.swing.JLabel jEncounterdetailslbl;
    private javax.swing.JTable jEncountertbl;
    private javax.swing.JButton jReadbtn;
    private javax.swing.JButton jUpdatebtn;
    // End of variables declaration//GEN-END:variables
}
