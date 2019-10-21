
package pgv2.pkg1v2;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guzman
 */
public class Hilo extends Thread{
    private String id;

    public Hilo(String id) {
        this.id = id;
    }
    
    @Override
    public void run(){
        try {
            for (int i = 0; i < 30; i++) {
              sleep(500);
                    System.out.println(id);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
