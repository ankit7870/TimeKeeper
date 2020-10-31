
package myclock;

import static myclock.AlarmUI.counter;
import static myclock.SimpleAudioPlayer.filePath;

public class CheckAlarm implements Runnable{
    
       public volatile boolean status=true;  
      
        static int count=0;
       SimpleAudioPlayer audioPlayer;
       
    @Override
    public void run() {
      
        try
        {  
            while(status){
                
                if(AlarmUI.amin==AlarmUI.minute && AlarmUI.ahr==AlarmUI.hour && AlarmUI.counter==AlarmUI.AM){
                    if(AlarmUI.on==1){
                     if(count==0){
                         
            filePath = "C:\\Users\\ANKIT\\Downloads\\tone.wav"; 
            audioPlayer =new SimpleAudioPlayer(); 
           if(AlarmUI.resp==0) 
           audioPlayer.play();
            count=1;
                }
                    }
         if(AlarmUI.resp==1)
         {
          audioPlayer.pause();
        
         }
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
    
    
   

