
package countdown;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import myclock.DIGITAL_CLOCK;
import myclock.SimpleAudioPlayer;

public class Timer1 extends javax.swing.JFrame {
    Timer timer;
   int min,sec;int count = 0;
    public Timer1() {
        initComponents();
        for(int i=0;i<60;i++){
            minCB.addItem(""+i);
        }
        for(int i=0;i<60;i++){
            secCB.addItem(""+i);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minCB = new javax.swing.JComboBox<>();
        secCB = new javax.swing.JComboBox<>();
        minLB = new javax.swing.JLabel();
        secLB = new javax.swing.JLabel();
        startBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BackBT = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timer");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIMER");

        minCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minCBActionPerformed(evt);
            }
        });

        secCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secCBActionPerformed(evt);
            }
        });

        minLB.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        minLB.setForeground(new java.awt.Color(255, 255, 255));
        minLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLB.setText("00");

        secLB.setFont(new java.awt.Font("Digital-7", 0, 36)); // NOI18N
        secLB.setForeground(new java.awt.Color(255, 255, 255));
        secLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secLB.setText("00");

        startBT.setText("Start");
        startBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("second");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("minute");

        BackBT.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        BackBT.setText("<-");
        BackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBT)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(startBT))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(secCB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(minCB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(minLB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(61, 61, 61)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(secLB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secLB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(startBT)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minCBActionPerformed
   minLB.setText(""+minCB.getSelectedItem());
   min=Integer.parseInt(minLB.getText());
    }//GEN-LAST:event_minCBActionPerformed

    private void secCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secCBActionPerformed
       secLB.setText(""+secCB.getSelectedItem());
      sec=Integer.parseInt(secLB.getText());
    }//GEN-LAST:event_secCBActionPerformed

    private void startBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTActionPerformed
       timer =new Timer(1000,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              sec--;
              if(sec<=0)
              {
                  min--;
                  sec=60;
              }
              if((min<=0 && sec==0) || min<0){
                
                sec=0;
                min=0;
                
            SimpleAudioPlayer audioPlayer1; 
                 try
        { 
                    
                     if(count==0){
                         
           SimpleAudioPlayer.filePath = "C:\\Users\\ANKIT\\Downloads\\birds.wav"; 
            audioPlayer1 =new SimpleAudioPlayer(); 
          
           audioPlayer1.play();
           JOptionPane.showMessageDialog(rootPane, "TIME UP", "Stopped", HEIGHT);
           audioPlayer1.pause();
            count=1;
                }
        
            }
          
      
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          }
          
                timer.stop();
                count=0;
              }
              secLB.setText(""+sec);
               minLB.setText(""+min);
           }
           
       });
       timer.start();
    }//GEN-LAST:event_startBTActionPerformed

    private void BackBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTActionPerformed
       this.setVisible(false);
         DIGITAL_CLOCK abc=new DIGITAL_CLOCK();
         abc.setVisible(true);
    }//GEN-LAST:event_BackBTActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> minCB;
    private javax.swing.JLabel minLB;
    private javax.swing.JComboBox<String> secCB;
    private javax.swing.JLabel secLB;
    private javax.swing.JButton startBT;
    // End of variables declaration//GEN-END:variables
}
