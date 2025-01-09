package src.java;

public class Animation implements Runnable 
{
    private volatile boolean running = true;

    @Override
    public void run() 
    {
        // Animation login
        while (running) 
        {
            try 
            {
                // Animation speed
                Thread.sleep(500);

                // Animation itself -- HERE
            } 
            catch (InterruptedException e)
            {
                running = false;
            }
        }
    }

    public void stop() 
    {
        running = false;
    }
}
