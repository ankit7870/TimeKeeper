
package myclock;

import java.util.Scanner;
import static myclock.SimpleAudioPlayer.filePath;
import javax.swing.JOptionPane;

public class CheckAlarm implements Runnable{
    
       public volatile boolean status=true;  
      
        int count=0;
       
       
    @Override
    public void run() {
      
        try
        {  filePath = "C:\\Users\\ANKIT\\Downloads\\tone.wav"; 
            SimpleAudioPlayer audioPlayer =  
                            new SimpleAudioPlayer(); 
            while(status){
                if(AlarmUI.amin==AlarmUI.minute && AlarmUI.ahr==AlarmUI.hour){
                    if(count==0){
              
           
            audioPlayer.play();
            count++;
                }
         if(AlarmUI.resp==1)
            
           audioPlayer.pause();
          
           
            }
            }
        }
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          }
    }
}
    
    
   

