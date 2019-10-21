
package pgv2.pkg1v2;

import static java.lang.Thread.sleep;

/**
 *
 * @author munchi
 */
public class PGV21v2 {

    public static void main(String[] args) {
        try {
            Hilo h1 = new Hilo("ONE");
            Hilo h2 = new Hilo("TOW");
            Hilo h3 = new Hilo("THREE");


            h1.start();
            sleep(100);
            h2.start();
            sleep(100);
            h3.start();
            sleep(100);

            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException ex) {
            System.out.println("Hilo Interrumpido.");   
        }
            System.out.println(" ");
    }
    
}
