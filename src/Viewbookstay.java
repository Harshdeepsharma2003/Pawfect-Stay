
import hib.swing.Bookstay;
import hib.swing.Shelterplaces;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Viewbookstay extends javax.swing.JFrame {

    /**
     * Creates new form Viewbookstay
     */
    public Viewbookstay() {
        initComponents();
         Fetch();
        
    }

    private void Fetch(){
   
         DefaultTableModel dtm;
   SessionFactory sf=new Configuration().configure().buildSessionFactory();

        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
Criteria crit = session.createCriteria(Bookstay.class);
List<Bookstay> list = crit.list();

dtm = (DefaultTableModel)jTable4.getModel();
for (Bookstay ref : list) {
    if (ref != null) {
        String id = ref.getId() != null ? ref.getId() : "";
        String name = ref.getName() != null ? ref.getName() : "";
        String contact = ref.getContact() != null ? ref.getContact() : "";
        String address = ref.getAddress() != null ? ref.getAddress() : "";
        Calendar startDate = ref.getStartDate() != null ? ref.getStartDate() : null; // Don't convert to string
        Calendar endDate = ref.getEndDate() != null ? ref.getEndDate() : null; // Use getEndDate() instead of jDatePicker2.getModel().getValue()

        // Format the dates as strings
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDateStr = startDate != null ? dateFormat.format(startDate.getTime()) : "";
        String endDateStr = endDate != null ? dateFormat.format(endDate.getTime()) : "";

        Object records[] = {id,name, contact, address, startDateStr, endDateStr};
        dtm.addRow(records);
    }
}
}
     private void updateBookingStatusFromSelectedRow() {
        int selectedRow = jTable4.getSelectedRow(); // Get the selected row index
        if (selectedRow != -1) { // Check if a row is selected
            String id = (String)jTable4.getValueAt(selectedRow, 0); // Get the ID from the selected row

            // Call the updateBookingStatus method with the retrieved ID
            updateBookingStatus(id);
        } else {
            JOptionPane.showMessageDialog(null, "No row selected.");
        }
    }
    
    private void updateBookingStatus(String id) {
        // Your logic to update the booking status goes here
        // For example, you could set a new status based on some logic
        String newStatus = "Updated"; // This could be determined by your application logic

        // Show a message dialog for demonstration purposes
        JOptionPane.showMessageDialog(null, "Updating booking status for ID: " + id + " to Status: " + newStatus);
        
        // Here you would typically update the database or data structure as needed
        // For example, you could update the table model directly if necessary:
        // Update the status in your data source here
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jDatePicker2 = new org.jdatepicker.JDatePicker();
        jButton6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Slot Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Address", "Start Date", "End Date", "Status"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 240));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 210, -1));

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setText("ID");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jTabbedPane1.addTab("View", jPanel1);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Name");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Contact");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Start Stay Date");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Clear All");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Expected End Date");

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("  SUBMIT  ");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Status");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Accepted" }));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Find");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jButton6)
                .addGap(70, 70, 70)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDatePicker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDatePicker2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        jTabbedPane1.addTab("Update Shelter Stay", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 1200, 600));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/h1.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 162, 113));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         
    String inputId = jTextField5.getText(); // Assuming jTextFieldId is your input field for ID
    if (inputId.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter an ID.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }
    DefaultTableModel dtm;
    
     // Query the database
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();

    try {
        // Use Criteria to find the record by ID
        Criteria crit = session.createCriteria(Bookstay.class);
        crit.add(Restrictions.eq("id", inputId)); // Assuming 'id' is the field name in Bookstay
        List<Bookstay> list = crit.list();
dtm=(DefaultTableModel)jTable4.getModel();
dtm.setRowCount(0); // Clear previous rows from the table model

        // Populate the table model with the results
        for (Bookstay ref : list) {
            if (ref != null) {
                String id = ref.getId() != null ? ref.getId() : "";
                String name = ref.getName() != null ? ref.getName() : "";
                String contact = ref.getContact() != null ? ref.getContact() : "";
                String address = ref.getAddress() != null ? ref.getAddress() : "";
                Calendar startDate = ref.getStartDate() != null ? ref.getStartDate() : null;
                Calendar endDate = ref.getEndDate() != null ? ref.getEndDate() : null;

                // Format the dates as strings
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String startDateStr = startDate != null ? dateFormat.format(startDate.getTime()) : "";
                String endDateStr = endDate != null ? dateFormat.format(endDate.getTime()) : "";

                Object records[] = {id, name, contact, address, startDateStr, endDateStr};
                dtm.addRow(records);
            }
        }

        // Commit transaction
        tx.commit();
    } catch (Exception e) {
        if (tx != null) {
            tx.rollback(); // Rollback in case of an error
        }
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        session.close(); // Always close the session
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered

    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited

    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

       SessionFactory sf = new Configuration().configure().buildSessionFactory();
org.hibernate.Session session = sf.openSession();
Transaction tx = session.beginTransaction();

String id = jTextField3.getText();
String name = jTextField8.getText();
String contact = jTextField2.getText(); 
String address = jTextArea1.getText();
Calendar startDate = (Calendar) jDatePicker1.getModel().getValue(); 
Calendar endDate = (Calendar) jDatePicker2.getModel().getValue();
String status = (String) jComboBox4.getSelectedItem();

// Check if all fields are filled
if (id.isEmpty() || name.isEmpty() || contact.isEmpty() || address.isEmpty() || startDate == null || endDate == null) {
    JOptionPane.showMessageDialog(null, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    // Retrieve the existing Bookstay object from the database
    Bookstay existingBooking = (Bookstay) session.get(Bookstay.class, id);
    
    if (existingBooking != null) {
        // Update the properties of the existing object
        existingBooking.setName(name);
        existingBooking.setContact(contact);
        existingBooking.setAddress(address);
        existingBooking.setStartDate(startDate);
        existingBooking.setEndDate(endDate);
        existingBooking.setStatus(status);
        
        // Save the updated object
        session.update(existingBooking);
        
        tx.commit();
        JOptionPane.showMessageDialog(null, "Booking updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Booking with ID " + id + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    session.close();
}   
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
        new Homeshelter().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        //        jLabel3.setForeground(c);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
         DefaultTableModel dtm;
     // Query the database
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();

 
        // Use Criteria to find the record by ID
        Criteria crit = session.createCriteria(Bookstay.class);
        List<Bookstay> list = crit.list();
    dtm=(DefaultTableModel)jTable4.getModel();
        // Populate the table model with the results
        for (Bookstay ref : list) {
            if (ref != null) {
                String id = ref.getId() != null ? ref.getId() : "";
                String name = ref.getName() != null ? ref.getName() : "";
                String contact = ref.getContact() != null ? ref.getContact() : "";
                String address = ref.getAddress() != null ? ref.getAddress() : "";
                Calendar startDate = ref.getStartDate() != null ? ref.getStartDate() : null;
                Calendar endDate = ref.getEndDate() != null ? ref.getEndDate() : null;
               
                // Format the dates as strings
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String startDateStr = startDate != null ? dateFormat.format(startDate.getTime()) : "";
                String endDateStr = endDate != null ? dateFormat.format(endDate.getTime()) : "";
  String status = ref.getStatus() != null ? ref.getStatus() : "";
               
                Object records[] = {id, name, contact, address, startDateStr, endDateStr,status};
                dtm.addRow(records);
            }
        }

        // Commit transaction
        tx.commit();
     session.close(); // Always close the session
    




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed


SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session session = sf.openSession();
Transaction tx = session.beginTransaction();

// Retrieve user inputs
String id = jTextField3.getText(); // ID of the Bookstay
String status = (String) jComboBox4.getSelectedItem(); // New status from the combo box

// Retrieve the existing Bookstay object from the session using the provided ID
Bookstay c = (Bookstay) session.get(Bookstay.class, id); // Replace id with the actual ID

if (c != null) { // Check if the object was found
    // Retrieve associated values
    String name = c.getName();
    String contact = c.getContact();
    String address = c.getAddress();
    Calendar startDate = c.getStartDate();
    Calendar endDate = c.getEndDate();

    // Set these values in the respective JTextFields
    jTextField8.setText(name); // Assuming jTextField8 is for Name
    jTextField2.setText(contact); // Assuming jTextField2 is for Contact
    jTextArea1.setText(address); // Assuming jTextArea1 is for Address

   // Assuming jDatePicker1 and jDatePicker2 are instances of JDatePickerImpl
if (startDate != null) {
    Date startDateValue = startDate.getTime(); // Convert Calendar to Date
    jDatePicker1.getModel().setDate(startDateValue.getYear() + 1900, startDateValue.getMonth() + 1, startDateValue.getDate());
    jDatePicker1.getModel().setSelected(true);
}
if (endDate != null) {
    Date endDateValue = endDate.getTime(); // Convert Calendar to Date
    jDatePicker2.getModel().setDate(endDateValue.getYear() + 1900, endDateValue.getMonth() + 1, endDateValue.getDate());
    jDatePicker2.getModel().setSelected(true);
}

    // Set the status in the JComboBox
    jComboBox4.setSelectedItem(c.getStatus()); // Assuming jComboBox4 is for Status

    // Update status if it has changed
    if (!c.getStatus().equals(status)) {
        c.setStatus(status);
    }

    // Update the Bookstay object in the database
    session.update(c);
} else {
    System.out.println("No Bookstay found with ID: " + id);
}

// Commit the transaction and close the session
tx.commit();
session.close();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Viewbookstay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewbookstay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewbookstay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewbookstay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewbookstay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox4;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private org.jdatepicker.JDatePicker jDatePicker2;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
