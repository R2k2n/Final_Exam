/*rakan abdullah alqarni 
444001644
*/
package threads3;

class MyThread extends Thread { 
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { 
            System.out.println("Thread running: " + i); 
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) { 
                System.out.println(e);
            }
        }
    }
}
public class Threads3 {
    public static void main(String[] args) {
    MyThread t1 = new MyThread(); 
        t1.setName("MyFirstThread");
        t1.start();

      
        MyThread t2 = new MyThread(); 
        t2.setName("MySecondThread");
        t2.start();
    }
}

