/*rakan abdullah alqarni 
444001644
*/
package threads2;
class Task implements Runnable { 
    @Override
    public void run() {
        System.out.println("Task is running. Thread: " + Thread.currentThread().getName());
    }
}

public class Threads2 {
    public static void main(String[] args) {
       Task task = new Task(); 
        Thread t1 = new Thread(task, "RunnableThread"); 
        t1.start(); 
    }
}

