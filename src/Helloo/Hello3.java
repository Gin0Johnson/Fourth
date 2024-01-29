package Helloo;


public class Hello3 extends Thread {
    Hello3(String tname, ThreadGroup tgrp) {
        super(tgrp, tname);
        start();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
	 public static void main(String[] args) throws SecurityException, InterruptedException {
        ThreadGroup tg = new ThreadGroup("The parent group");
        Hello3 t2 = new Hello3("Second", tg);
        System.out.println("Starting the Second");

        // Sleep for some time to let the threads run
        Thread.sleep(500);

        // Interrupt all threads in the ThreadGroup
        tg.interrupt();

        // Wait for all threads to finish
        tg.destroy();

        if (tg.isDestroyed() == true) {
            System.out.println("ThreadGroup is destroyed");
        } else {
            System.out.println("ThreadGroup not destroyed");
        }
    }
}


