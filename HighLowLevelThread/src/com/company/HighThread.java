package com.company;

public class HighThread implements Runnable {
    public static int total = 0;
    private Thread thread;

    public HighThread(){
        thread = new Thread(this,"HP_Thread" + total);
        thread.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        System.out.println(thread.getName()+ " , p = "+ thread.getPriority() + " Nit je pocela ");
        try{
            Thread.sleep(3000);

        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(thread.getName()+ " Nit je zavrsena");

    }
    public Thread getThread(){
        return thread;
    }
}
