package Classes;

public class Block 
{
    // Attributes
    private int lines, columns;
    private int[][] squares;

    // Constructor
    public Block(int lines, int columns) 
    { 
        this.squares = new int[lines][columns];
        this.setLines(lines);
        this.setColumns(columns); 
    }

    // Methods
    public int getLines() 
    { 
        return lines; 
    } 

    public int getColumns() 
    { 
        return columns; 
    }

    public int[][] getSquares() 
    { 
        return squares; 
    } 
    
    public void setLines(int lines) 
    { 
        this.lines = lines; 
    } 
    
    public void setColumns(int columns) 
    { 
        this.columns = columns;  
    }

    public void setSpecificSquare(int line, int column, int value) 
    { 
        if (line < 0 || line >= this.lines || column < 0 || column >= this.columns) 
            throw new IllegalArgumentException("Trying to set out of block bounds");

        this.squares[line][column] = value; 
    }

    public void setSquares(int[][] values)
    {
        this.squares = values;
    }
    
    public void printBlock()
    {
        // Upper border
        for (int i = 0; i < this.columns; i++) 
            System.out.printf(" ");  
        System.out.printf("\n"); 

        for (int i = 0; i < this.lines; i++) 
        {
            System.out.printf(" ");

            for (int j = 0; j < this.columns; j++) 
            {
                if (this.squares[i][j] == 0)  // BROWN SQUARE
                    System.out.printf("\uD83D\uDFEB");
                else if (this.squares[i][j] == 1)  // WHITE SQUARE
                    System.out.printf("\u2B1C");     
                else if (this.squares[i][j] == 2)  // ORANGE SQUARE
                    System.out.printf("\uD83D\uDFE7");
                else if (this.squares[i][j] == 3)  // ORANGE CIRCLE
                    System.out.printf("\uD83D\uDFE0"); 
                else if (this.squares[i][j] == 4)  // YELLOW SQUARE
                    System.out.printf("\uD83D\uDFE8"); 
                else if (this.squares[i][j] == 5)  // YELLOW CIRCLE
                    System.out.printf("\uD83D\uDFE1"); 
                else if (this.squares[i][j] == 6)  // BLUE SQUARE
                    System.out.printf("\uD83D\uDFE6"); 
                else  // BLUE CIRCLE
                    System.out.printf("\uD83D\u1F535");     
            }
            System.out.printf(" \n");
        }
    }
}
