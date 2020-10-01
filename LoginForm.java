import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TesseracT
 */
public class LoginForm extends javax.swing.JFrame {
    
Connection conn=null;
ResultSet rs=null;
int curRow=0;

    /**
     * Creates new form Confidential1
     */
    public LoginForm() {
        
        initComponents();
        this.setLocationRelativeTo(null);  //centre form in the screen
    }
    

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        log = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 80));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("UserName :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(290, 250, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8_shop_42px_3.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(590, 160, 80, 60);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("New to ShopAddict? SIGNUP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(350, 460, 320, 33);

        jLabel2.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        jLabel2.setText("Welcome to ShopAddict® ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(380, 180, 210, 30);

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(uname);
        uname.setBounds(400, 250, 310, 28);

        pass.setBackground(new java.awt.Color(204, 204, 204));
        pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel3.add(pass);
        pass.setBounds(400, 300, 310, 28);

        log.setBackground(new java.awt.Color(0, 255, 0));
        log.setFont(new java.awt.Font("Bookman Old Style", 1, 26)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("LOGIN");
        log.setToolTipText("");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel3.add(log);
        log.setBounds(460, 350, 120, 60);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Password :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(290, 300, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LoginBackground.jpeg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 50, 974, 480);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3);
        jLabel3.setBounds(940, 0, 25, 38);

        label.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("-");
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
        });
        jPanel3.add(label);
        label.setBounds(910, 0, 17, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_labelMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
String Name=uname.getText(); 
String PA=Arrays.toString(pass.getPassword());
String msg=uname.getText();
   
        if(uname.getText().length()==0)  // Checking for empty Username field
 {JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up Username");}
   else if(pass.getPassword().length==0)  // Checking for empty password field
   {  JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up password");}
 
  else
        
   {String sql = "select * from User_details where user_name=('"+ Name +"') and password=('"+ PA +"')"; 
       try{ Class.forName("com.mysql.jdbc.Driver");
         Connection con =DriverManager.getConnection("jdbc:mysql://localhost/project2019","root","0000");
        
      Statement stmt=con.createStatement();
       rs=stmt.executeQuery(sql);                   
                          
         if (rs.next()){
           MainInterfacee s= new MainInterfacee(Name);
           s.setVisible(true);
           this.dispose();
           stmt.close();
           rs.close();
           con.close();
          }
       else{JOptionPane.showMessageDialog(null, "Invalid password/UserName");}
        }
   catch(Exception e){       
       System.out.println("Something went wrong !! Please try again");}      
    }
      
    
// TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
SignUpForm suf= new SignUpForm();
        suf.setVisible(true);
        this.dispose();        // Opening Signup Form 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
