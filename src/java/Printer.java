package src.java;

public class Printer 
{
    // Constructor
    public Printer() {}

    // Methods
    public void printBlock(Block block, int line)
    {
        for (int j = 0; j < block.getColumns(); j++) 
        {
            if (block.getSquares()[line][j].getId() == 0)  // BROWN SQUARE
                System.out.printf("\uD83D\uDFEB");
            else if (block.getSquares()[line][j].getId() == 1)  // WHITE SQUARE
                System.out.printf("\u2B1C");     
            else if (block.getSquares()[line][j].getId() == 2)  // ORANGE SQUARE
                System.out.printf("\uD83D\uDFE7");
            else if (block.getSquares()[line][j].getId() == 3)  // ORANGE CIRCLE
                System.out.printf("\uD83D\uDFE0"); 
            else if (block.getSquares()[line][j].getId() == 4)  // YELLOW SQUARE
                System.out.printf("\uD83D\uDFE8"); 
            else if (block.getSquares()[line][j].getId() == 5)  // YELLOW CIRCLE
                System.out.printf("\uD83D\uDFE1"); 
            else if (block.getSquares()[line][j].getId() == 6)  // BLUE SQUARE
                System.out.printf("\uD83D\uDFE6"); 
            else  // BLUE CIRCLE
                System.out.printf("\uD83D\uDD35");     
        }
    }

    public void printCircuit(Circuit circuit)
    {
        // Upper border
        for (int i = 0; i < circuit.getColumns(); i++) 
            System.out.printf(" ");  
        System.out.printf("\n");

        // For every block line
        for (int blockLine = 0; blockLine < circuit.getLines(); blockLine++) 
        {
            // For every line of squares within a block
            for (int line = 0; line < circuit.getCircuit()[0][0].getLines(); line++) 
            {
                // For every block column
                for (int blockColumn = 0; blockColumn < circuit.getColumns(); blockColumn++) 
                {
                    // Prints block specific line
                    this.printBlock(circuit.getCircuit()[blockLine][blockColumn], line);
                    System.out.printf(" ");  // Space between blocks
                }
                System.out.printf("\n"); 
            }
            System.out.printf("\n");  // Space between block lines
        }
    }

    public void printMenu() 
    {
        System.out.println("       ____ \\\\       _____     ____   _    _   _  _______");
        System.out.println("      / ___  \\\\     |  __ \\   / ___  | |  | | | | |__ __|");
        System.out.println("     | |      \\\\    | |__) | | |     | |  | | | |   | |");
        System.out.println("     | |       ---- |  _  /  | |     | |  | | | |   | |");
        System.out.println("     | |___      // | | \\ \\  | |___  | |__| | | |   | |");
        System.out.println("      \\____     //  |_|  \\_\\  \\____  \\______/ |_|   |_|");

        System.out.println("                     ____    _____    ____       ____       _  __  ____   _____     ");
        System.out.println("                    |  _ \\  |  __ \\  |  __|     /    \\     | |/ / |__  | |  __ \\   ");
        System.out.println("                    | |_) | | |__) | | |_      /  /\\  \\    | ' /    _| | | |__) |   ");
        System.out.println("                    |  _  < |  _  /  |  _|    /  ____  \\   |  <    |_  | |  _  /    ");
        System.out.println("                    | |_) | | | \\ \\  | |__   /  /    \\  \\  | . \\   __| | | | \\ \\  ");
        System.out.println("                    |____/  |_|  \\_\\ |____| |__/      \\__| |_|\\_\\ |____| |_|  \\_\\ ");
        
        System.out.println("\n\n\n");
        System.out.println("                                 > Press to Start <");
    }
    
    public void flushScreen()
    {
        System.out.print("\033\143");
    }
}