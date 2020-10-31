
package stopwatch;

import myclock.DIGITAL_CLOCK;
import stopwatch.STimer;

public class Stopwatch extends javax.swing.JFrame {
    int flag=0;int count=0;
    
    STimer timer;
    Thread t;
    public Stopwatch() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        minTF = new javax.swing.JTextField();
        secTF = new javax.swing.JTextField();
        csecTF = new javax.swing.JTextField();
        startBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lapTA = new javax.swing.JTextArea();
        pauseBT = new javax.swing.JButton();
        lapBT = new javax.swing.JButton();
        stopBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stopwatch");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STOP WATCH");

        minTF.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        minTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minTF.setText("0");
        minTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTFActionPerformed(evt);
            }
        });

        secTF.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        secTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secTF.setText("0");
        secTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secTFActionPerformed(evt);
            }
        });

        csecTF.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        csecTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        csecTF.setText("0");

        startBT.setText("Start");
        startBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lapTA.setColumns(20);
        lapTA.setFont(new java.awt.Font("Digital-7", 0, 18)); // NOI18N
        lapTA.setRows(5);
        jScrollPane1.setViewportView(lapTA);

        pauseBT.setText("Pause");
        pauseBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBTActionPerformed(evt);
            }
        });

        lapBT.setText("LAP");
        lapBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapBTActionPerformed(evt);
            }
        });

        stopBT.setText("Stop");
        stopBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBTActionPerformed(evt);
            }
        });

        backBT.setFont(new java.awt.Font("Arno Pro Smbd Caption", 1, 12)); // NOI18N
        backBT.setText("<-");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startBT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addComponent(stopBT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(csecTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(lapBT))))
                            .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(pauseBT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csecTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBT)
                    .addComponent(stopBT))
                .addGap(30, 30, 30)
                .addComponent(pauseBT)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lapBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minTFActionPerformed

    private void secTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secTFActionPerformed

    private void startBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTActionPerformed
        
        if(count==0)
        {
            timer=new STimer(this);
        t=new Thread(timer,"Ankit");
        t.start();
        count=1;
        }
    }//GEN-LAST:event_startBTActionPerformed

    private void pauseBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBTActionPerformed
       if(flag==0)
       {
           t.suspend();
           pauseBT.setText("Resume");
           flag=1;
       }
       else if(flag==1){
            t.resume();
            pauseBT.setText("Pause");
            flag=0;
    }
    }//GEN-LAST:event_pauseBTActionPerformed

    private void lapBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapBTActionPerformed
        String lap=minTF.getText()+":"+secTF.getText()+"."+csecTF.getText()+"\n";
        lapTA.append(lap);
    }//GEN-LAST:event_lapBTActionPerformed

    private void stopBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBTActionPerformed
        if(count==1){
                timer.stop();
                count=0;
                flag=0;
                 pauseBT.setText("Pause");
                this.setTimer(0,0,0);
        }
    }//GEN-LAST:event_stopBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
         this.setVisible(false);
         DIGITAL_CLOCK abc=new DIGITAL_CLOCK();
         abc.setVisible(true);
           
    }//GEN-LAST:event_backBTActionPerformed
     
    public void setTimer(int min,int sec,int csec){
        minTF.setText(""+min);
        secTF.setText(""+sec);
        csecTF.setText(""+csec);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JTextField csecTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lapBT;
    private javax.swing.JTextArea lapTA;
    private javax.swing.JTextField minTF;
    private javax.swing.JButton pauseBT;
    private javax.swing.JTextField secTF;
    private javax.swing.JButton startBT;
    private javax.swing.JButton stopBT;
    // End of variables declaration//GEN-END:variables
}
