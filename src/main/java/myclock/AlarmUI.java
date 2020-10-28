
package myclock;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class AlarmUI extends javax.swing.JFrame implements Runnable{

   
    public AlarmUI() {
        Thread t=new Thread(this);
        t.start();
        initComponents();
         for(int i=0;i<=12;i++){
             if(i<10){
            hrCB.addItem("0"+i);
             }
             else
                hrCB.addItem(""+i);  
             
        }
        for(int i=0;i<60;i++){
            if(i<10){
            minCB.addItem("0"+i);
             }
             else
                minCB.addItem(""+i);
        }
    }
     static int amin,ahr,hour,minute,count;String message;
      int flag=0; static int resp=0; int on=0;   
      Thread k;   int check=0;  
             
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampmCB = new javax.swing.JComboBox<>();
        hrCB = new javax.swing.JComboBox<>();
        hrLB = new javax.swing.JLabel();
        minCB = new javax.swing.JComboBox<>();
        ampmLB = new javax.swing.JLabel();
        minLB = new javax.swing.JLabel();
        BackBT = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        messTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ampmCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        ampmCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampmCBActionPerformed(evt);
            }
        });

        hrCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrCBActionPerformed(evt);
            }
        });

        hrLB.setText("00");
        hrLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        minCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minCBActionPerformed(evt);
            }
        });

        ampmLB.setText("AM");
        ampmLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        minLB.setText("00");
        minLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BackBT.setText("<-");
        BackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTActionPerformed(evt);
            }
        });

        jRadioButton1.setText("On/Off");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel1.setText("Alarm 1");

        messTF.setText("Enter Alarm message here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(hrLB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(minCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minLB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(hrCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ampmLB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(messTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ampmCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampmLB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(hrLB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampmCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ampmCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampmCBActionPerformed
        ampmLB.setText(""+ampmCB.getSelectedItem());

    }//GEN-LAST:event_ampmCBActionPerformed

    private void hrCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrCBActionPerformed
        hrLB.setText(""+hrCB.getSelectedItem());
        ahr = Integer.parseInt(hrLB.getText());
    }//GEN-LAST:event_hrCBActionPerformed

    private void minCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minCBActionPerformed
        minLB.setText(""+minCB.getSelectedItem());
        amin = Integer.parseInt(minLB.getText());
    }//GEN-LAST:event_minCBActionPerformed

    private void BackBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTActionPerformed
   this.setVisible(false);
         DIGITAL_CLOCK abc=new DIGITAL_CLOCK();
         abc.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BackBTActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        if(flag==0){
        Runnable r1=new CheckAlarm();
     k=new Thread(r1);
     k.start();
     
      message=messTF.getText();
     on=1;
     
    flag=1;
    }

        
        else if(flag==1){
           check=1;
            resp=1;
            on=0;
            flag=2;
        }
        else if(flag==2){
            on=1;
            check=0;
            CheckAlarm.count=0;
            resp=0;
      flag=1;
        }
    
    }//GEN-LAST:event_jRadioButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBT;
    private javax.swing.JComboBox<String> ampmCB;
    private javax.swing.JLabel ampmLB;
    private javax.swing.JComboBox<String> hrCB;
    private javax.swing.JLabel hrLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField messTF;
    private javax.swing.JComboBox<String> minCB;
    private javax.swing.JLabel minLB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
         try{
             Calendar c=Calendar.getInstance();
             hour=c.get(Calendar.HOUR_OF_DAY);
             
             if(hour>=12)
             {
                 hour=hour-12;
                 count=1;
             }
             minute=c.get(Calendar.MINUTE);
                        String message=messTF.getText();
                        
                            
    if(AlarmUI.amin==AlarmUI.minute && AlarmUI.ahr==AlarmUI.hour && on==1 && check==0){
     
        int response=JOptionPane.showConfirmDialog(this,"Snooze Alarm??",message,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            
             resp=1;
        }
        else if(response==JOptionPane.NO_OPTION){
            
        }
       
        check=1;
    }
           
         }
         catch(Exception e){
             e.printStackTrace();
         }
            
     }
       
    }

    }
    

