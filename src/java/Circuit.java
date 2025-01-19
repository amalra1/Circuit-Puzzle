package src.java;

public class Circuit
{
    Printer printer = new Printer();

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
        return this.lines; 
    } 

    public int getColumns() 
    { 
        return this.columns; 
    }

    public Block[][] getCircuit() 
    { 
        return this.blocks; 
    } 
    
    public void setLines(int lines) 
    { 
        this.lines = lines; 
    } 
    
    public void setColumns(int columns) 
    { 
        this.columns = columns;  
    }

    public void setSpecificBlock(int line, int column, Block block, String type)
    {
        if (line < 0 || line >= this.lines || column < 0 || column >= this.columns) 
            throw new IllegalArgumentException("Trying to set out of circuit bounds");
    
        Block newBlock = new Block(block.getLines(), block.getColumns(), type);
        
        for (int i = 0; i < block.getLines(); i++)
            for (int j = 0; j < block.getColumns(); j++)
                newBlock.setSpecificSquare(i, j, block.getSquares()[i][j].getId());
    
        this.blocks[line][column] = newBlock;
    }

    public void setCircuit(Block[][] blocks)
    {
        for (int i = 0; i < this.lines; i++)
            for (int j = 0; j < this.columns; j++) 
                this.blocks[i][j] = blocks[i][j];
    }
}
