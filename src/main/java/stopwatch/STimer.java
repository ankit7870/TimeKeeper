package stopwatch;

import stopwatch.Stopwatch;

public class STimer implements Runnable{
    Stopwatch mysw;
    public volatile boolean status=true;
    public STimer(Stopwatch sw){
        mysw=sw;
    }
    @Override
    public void run() {
        int msec=0;
        int min=0;
        int sec=0;
        
        
        try{
            while(status){
                Thread.sleep(10);
                msec++;
                
                if(msec==100){
                    sec++;
                    msec=0;
                }
                if(sec==60){
                    min++;
                    sec=0;
                }
                mysw.setTimer(min,sec,msec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void stop(){
        status=false;
        
    }
}
