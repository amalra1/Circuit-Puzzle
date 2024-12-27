package Classes;

public class Block 
{
    // Attributes
    private int lines, columns;
    private int blockX, blockY;
    private Symbol[][] squares;

    // Constructor
    public Block(int lines, int columns) 
    { 
        this.squares = new Symbol[lines][columns];
        this.setLines(lines);
        this.setColumns(columns); 
    }

    // Methods
    public int getLines() 
    { 
        return this.lines; 
    } 

    public int getColumns() 
    { 
        return this.columns; 
    }

    public Symbol[][] getSquares() 
    { 
        return this.squares; 
    }
    
    public int getBlockX()
    {
        return this.blockX;
    }

    public int getBlockY()
    {
        return this.blockY;
    }
    
    public void setLines(int lines) 
    { 
        this.lines = lines; 
    } 
    
    public void setColumns(int columns) 
    { 
        this.columns = columns;  
    }

    public void setBlockX(int blockX)
    {
        this.blockX = blockX;
    }

    public void setBlockY(int blockY)
    {
        this.blockY = blockY;
    }

    public void setSpecificSquare(int line, int column, int value) 
    { 
        if (line < 0 || line >= this.lines || column < 0 || column >= this.columns) 
            throw new IllegalArgumentException("Trying to set out of block bounds");
        
        this.squares[line][column] = new Symbol(column, line, value);
    }

    public void setSquares(int[][] values)
    {
        for (int i = 0; i < this.lines; i++) 
            for (int j = 0; j < this.columns; j++) 
                this.squares[i][j] = new Symbol(j + (lines * blockX), i + (columns * blockY), values[i][j]);
    }
}
