package Classes;

public class Circuit
{
    // Attributes
    private int lines, columns;
    private Block[][] blocks;

    // Constructor
    public Circuit(int lines, int columns) 
    { 
        this.blocks = new Block[lines][columns];
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

    public Block[][] getCircuit() 
    { 
        return blocks; 
    } 
    
    public void setLines(int lines) 
    { 
        this.lines = lines; 
    } 
    
    public void setColumns(int columns) 
    { 
        this.columns = columns;  
    }

    public void setSpecificBlock(int line, int column, Block block)
    {
        if (line < 0 || line >= this.lines || column < 0 || column >= this.columns) 
            throw new IllegalArgumentException("Trying to set out of circuit bounds");

        this.blocks[line][column] = block;
    }

    public void setCircuit(Block[][] blocks)
    {
        for (int i = 0; i < this.lines; i++)
            for (int j = 0; j < this.columns; j++) 
                this.blocks[i][j] = blocks[i][j];
    }

    public void printCircuit()
    {
        for (int i = 0; i < this.lines; i++)
        {
            for (int j = 0; j < this.columns; j++) 
            {
                this.blocks[i][j].printBlock();
            }  
        }
    }
}
