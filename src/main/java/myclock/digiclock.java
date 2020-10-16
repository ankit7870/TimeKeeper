
package myclock;


public class digiclock {
    
     public static void main(String args[]) {
       DIGITAL_CLOCK mc=new DIGITAL_CLOCK();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mc.setVisible(true);
            }
           
        });
    }
    
}
