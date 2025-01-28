/*rakan abdullah alqarni 
444001644
*/
package threads;

class SharedResource { 
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class MyThread extends Thread { 
    SharedResource resource;

    MyThread(SharedResource res) {
        this.resource = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }

        for (int i = 0; i < 3; i++) { 
            System.out.println(getName() + " running: " + i); 
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                System.out.println(e);
            }
        }
    }
}

public class Threads { 
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        MyThread t1 = new MyThread(resource);
        t1.setName("Thread-1");

        MyThread t2 = new MyThread(resource);
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + resource.getCount());
    }
}