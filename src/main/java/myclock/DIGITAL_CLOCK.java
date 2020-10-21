package myclock;

import countdown.Timer1;

import java.io.File;
import java.applet.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineListener;
import stopwatch.Stopwatch;

import  java.io.*;

public class DIGITAL_CLOCK extends javax.swing.JFrame implements Runnable{

    int hour,second,minute;int count=0;
    int amin,ahr;//variables for Alarm setup
    int day,month,year;
    String timestr,datestr;
    public DIGITAL_CLOCK() {
        Thread t=new Thread(this);
        t.start();
        initComponents();
         for(int i=0;i<=12;i++){
            hrCB.addItem(""+i);
        }
        for(int i=0;i<60;i++){
            minCB.addItem(""+i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        timeL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        swBT = new javax.swing.JButton();
        timerBT = new javax.swing.JButton();
        ampmCB = new javax.swing.JComboBox<>();
        hrCB = new javax.swing.JComboBox<>();
        hrLB = new javax.swing.JLabel();
        minCB = new javax.swing.JComboBox<>();
        ampmLB = new javax.swing.JLabel();
        minLB = new javax.swing.JLabel();
        calendarBT = new javax.swing.JButton();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeL.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        timeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(timeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 290, 70));

        dateL.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        dateL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateL.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(dateL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 40));

        swBT.setText("Stopwatch");
        swBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swBTActionPerformed(evt);
            }
        });
        getContentPane().add(swBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, -1));

        timerBT.setText("Timer");
        timerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBTActionPerformed(evt);
            }
        });
        getContentPane().add(timerBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, -1));

        ampmCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        ampmCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampmCBActionPerformed(evt);
            }
        });
        getContentPane().add(ampmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        hrCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrCBActionPerformed(evt);
            }
        });
        getContentPane().add(hrCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        hrLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(hrLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        minCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minCBActionPerformed(evt);
            }
        });
        getContentPane().add(minCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        ampmLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ampmLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 40, 20));

        minLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(minLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, 20));

        calendarBT.setText("Calendar");
        calendarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarBTActionPerformed(evt);
            }
        });
        getContentPane().add(calendarBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

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

    private void minCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minCBActionPerformed
       minLB.setText(""+minCB.getSelectedItem());
     amin=Integer.parseInt(hrLB.getText());
    }//GEN-LAST:event_minCBActionPerformed

    private void hrCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrCBActionPerformed
       hrLB.setText(""+hrCB.getSelectedItem());
       ahr=Integer.parseInt(hrLB.getText());
    }//GEN-LAST:event_hrCBActionPerformed

    private void ampmCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampmCBActionPerformed
     ampmLB.setText(""+ampmCB.getSelectedItem());
  
    }//GEN-LAST:event_ampmCBActionPerformed

    private void calendarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarBTActionPerformed
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myclock.Calendar().setVisible(true);
            }       
    }//GEN-LAST:event_calendarBTActionPerformed
        );
                }
   

    @Override
    public void run() {
     while(true){
         try{
             Calendar c=Calendar.getInstance();
             hour=c.get(Calendar.HOUR_OF_DAY);
             int h=hour;
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
            
            
           if(ahr==hour && amin==minute){
              
               try{
                  
              File audioFile = new File("C:\\Users\\ANKIT\\Downloads\\Zaroori-Tha-Rahat-Fateh-Ali-Khan.mp3");
 
AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
AudioFormat format = audioStream.getFormat();
 
DataLine.Info info = new DataLine.Info(Clip.class, format);
Clip audioClip = (Clip) AudioSystem.getLine(info);
audioClip.open(audioStream);
audioClip.start();
               }
               catch(Exception e){
             e.printStackTrace();
           }
            
         }
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ampmCB;
    private javax.swing.JLabel ampmLB;
    private javax.swing.JButton calendarBT;
    private javax.swing.JLabel dateL;
    private javax.swing.JComboBox<String> hrCB;
    private javax.swing.JLabel hrLB;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> minCB;
    private javax.swing.JLabel minLB;
    private javax.swing.JButton swBT;
    private javax.swing.JLabel timeL;
    private javax.swing.JButton timerBT;
    // End of variables declaration//GEN-END:variables
}
