package com.company;

public class LowThread extends Thread {

    public LowThread(String name) {
        super(name);
        setPriority(MIN_PRIORITY);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ", p=" + this.getPriority() + ": Brojim: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(this.getName() + ":Nit je prekinuta. ");
            }
        }
    }


}