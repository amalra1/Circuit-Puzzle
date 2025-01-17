package src.java;

public class Animation implements Runnable 
{
    private volatile boolean running = true;
    private Circuit circuit;
    boolean redraw;

    public Animation(Circuit circuit, boolean redraw)
    {
        this.circuit = circuit;
        this.redraw = redraw;
    }

    @Override
    public void run() 
    {
        // Animation logic
        while (running) 
        {
            try 
            {
                this.redraw = false;

                // Animation speed
                Thread.sleep(1200);

                for (int i = 0; i < circuit.getLines(); i++) 
                {
                    for (int j = 0; j < circuit.getColumns(); j++) 
                    {
                        // If it is selected
                        if (circuit.getCircuit()[i][j].getSelected() > 0)
                        {
                            // Check the color and toggle it
                            Symbol[][] squares = circuit.getCircuit()[i][j].getSquares();
                            
                            for (int k = 0; k < squares.length; k++) 
                            {
                                for (int l = 0; l < squares[k].length; l++) 
                                {
                                    // Brown
                                    if (squares[k][l].getId() == 0) 
                                    {
                                        // Red
                                        squares[k][l].setId(8);
                                    } 
                                    // Red
                                    else if (squares[k][l].getId() == 8) 
                                    {
                                        // Brown
                                        squares[k][l].setId(0);
                                    }
                                }
                            }
                        }
                    }
                }

                this.redraw = true;
            } 
            catch (InterruptedException e)
            {
                running = false;
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean getRedraw() 
    { 
        return this.redraw; 
    } 

    public void stop() 
    {
        running = false;
    }
}
