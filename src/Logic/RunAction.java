package Logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RunAction implements Runnable {

    private int ID;
    private int time;
    private boolean runstatus = true;

    public RunAction(int time) {
        this.ID = ((int) (Math.random() * 10000));
        this.time = time;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            while (runstatus) {
                System.out.println("Thread " + ID + " running.");
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.keyRelease(KeyEvent.VK_ESCAPE);
                ///////////
                robot.keyPress(KeyEvent.VK_X);
                robot.keyRelease(KeyEvent.VK_X);
                Thread.sleep(time);
            }
            System.out.println("Thread " + ID + " stopped.");
        } catch (Exception ex) {
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isRunstatus() {
        return runstatus;
    }

    public void setRunstatus(boolean runstatus) {
        this.runstatus = runstatus;
    }

    
}
