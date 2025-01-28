/*rakan abdullah alqarni 
444001644
*/
package threads1;

class mythread extends Thread { 
    @Override
    public void run() {
        System.out.println("Thread is running. Name: " + getName());
    }
}
public class Threads1 {
    public static void main(String[] args) {
       mythread t1 = new mythread(); 
        t1.setName("MyFirstThread"); 
        t1.start(); 
    }
}