package myclock;

import countdown.Timer1;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import stopwatch.Stopwatch;


public class DIGITAL_CLOCK extends javax.swing.JFrame implements Runnable{

    int hour,second,minute;int count=0;
    int amin,ahr;//variables for Alarm setup
    int day,month,year;
    String timestr,datestr;
   
    public DIGITAL_CLOCK() {
        Thread t=new Thread(this);
        t.start();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        timerBT = new javax.swing.JButton();
        calendarBT = new javax.swing.JButton();
        setalarmBT = new javax.swing.JButton();
        swBT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLOCK");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeL.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        timeL.setForeground(new java.awt.Color(255, 255, 255));
        timeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(timeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, 70));

        dateL.setFont(new java.awt.Font("Digital-7", 1, 24)); // NOI18N
        dateL.setForeground(new java.awt.Color(255, 255, 255));
        dateL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(dateL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, 40));

        timerBT.setText("Timer");
        timerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBTActionPerformed(evt);
            }
        });
        getContentPane().add(timerBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, -1));

        calendarBT.setText("Calendar");
        calendarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarBTActionPerformed(evt);
            }
        });
        getContentPane().add(calendarBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        setalarmBT.setText("setalarrm");
        setalarmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setalarmBTActionPerformed(evt);
            }
        });
        getContentPane().add(setalarmBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        swBT.setText("Stopwatch");
        swBT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        swBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swBTActionPerformed(evt);
            }
        });
        getContentPane().add(swBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void swBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swBTActionPerformed
        dispose();     
        Stopwatch mysw=new Stopwatch();
        mysw.setVisible(true);
    }//GEN-LAST:event_swBTActionPerformed

    private void timerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerBTActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                Timer1 mt=new Timer1();
                mt.setVisible(true);
            }
        });
    }//GEN-LAST:event_timerBTActionPerformed

    private void calendarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarBTActionPerformed
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new myclock.Calendar().setVisible(true);
            }     
          
             }
        );
    }//GEN-LAST:event_calendarBTActionPerformed

    private void setalarmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setalarmBTActionPerformed
       
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new AlarmUI().setVisible(true);
            }
        });
        
        
    }//GEN-LAST:event_setalarmBTActionPerformed
       

    @Override
    public void run() {
     while(true){
         try{
             Calendar c=Calendar.getInstance();
             hour=c.get(Calendar.HOUR_OF_DAY);
             
             if(hour>12)
             {
                 hour=hour-12;
                 count=1;
             }
             minute=c.get(Calendar.MINUTE);
             second=c.get(Calendar.SECOND);
             day=c.get(Calendar.DAY_OF_MONTH);
             month=c.get(Calendar.MONTH);
            year=c.get(Calendar.YEAR);
            SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
            Date date=c.getTime();
            timestr=sdf.format(date);
            datestr=df.format(date);
            if(count==0)
            {
            timeL.setText(timestr+" AM");
            }
            else{
                timeL.setText(timestr+" PM");
            }
            dateL.setText(datestr);
            
            
          
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calendarBT;
    private javax.swing.JLabel dateL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton setalarmBT;
    private javax.swing.JButton swBT;
    private javax.swing.JLabel timeL;
    private javax.swing.JButton timerBT;
    // End of variables declaration//GEN-END:variables
}
