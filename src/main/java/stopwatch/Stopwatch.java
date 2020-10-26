
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        jLabel1.setText("STOP WATCH");

        jLabel2.setText("MINUTES");

        jLabel3.setText("SECONDS");

        jLabel4.setText("CENTISEC");

        minTF.setText("0");
        minTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTFActionPerformed(evt);
            }
        });

        secTF.setText("0");
        secTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secTFActionPerformed(evt);
            }
        });

        csecTF.setText("0");

        startBT.setText("Start");
        startBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTActionPerformed(evt);
            }
        });

        lapTA.setColumns(20);
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
                        .addGap(157, 157, 157)
                        .addComponent(lapBT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(pauseBT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(startBT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stopBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(csecTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csecTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBT)
                    .addComponent(stopBT))
                .addGap(18, 18, 18)
                .addComponent(pauseBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lapBT)
                .addGap(20, 20, 20))
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
        String lap=minTF.getText()+" min "+secTF.getText()+" sec "+csecTF.getText()+" csec "+"\n";
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
