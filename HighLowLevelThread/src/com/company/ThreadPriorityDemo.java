package com.company;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        new ThreadPriorityDemo();
    }

    public ThreadPriorityDemo() {
        for (int i = 0; i < 100; i++) {
            HighThread ht = new HighThread();
            LowThread lt = new LowThread("LP_Thread " + i);

            lt.start();
            ht.getThread().start();
        }

    }

}
