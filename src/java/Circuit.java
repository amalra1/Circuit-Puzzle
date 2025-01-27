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

    public void checkElectricity() {
        // Origins coordinates
        int[][] origins = {{0, 0}, {3, 0}};
    
        // Reset all blocks to blue 
        for (int i = 0; i < this.lines; i++) 
            for (int j = 0; j < this.columns; j++) 
                this.blocks[i][j].fillWire("blue");
    
        // Check electricity connections through blocks from the origins
        for (int[] origin : origins) {
            int pathI = origin[0];
            int pathJ = origin[1];
            followPath(pathI, pathJ, 2);
        }
    }
    
    // DIRECTION: 0 - Right, 1 - Down, 2 - Left, 3 - Up
    private void followPath(int i, int j, int direction) {
        Block currentBlock = this.blocks[i][j];
        Symbol[][] squares = currentBlock.getSquares();
    
        if (!currentBlock.getType().equals("double-l")) 
        {
            // Color the current block's wire orange if it's blue
            currentBlock.fillWire("orange");
        }
        else
        {
            // Color the current block's wire orange based on direction
            currentBlock.fillWire("orange", direction);
        }
    
        // Right side check
        if (squares[2][4].getId() == 2 || squares[2][4].getId() == 3) {
            if (j + 1 < this.columns && (this.blocks[i][j + 1].getSquares()[2][0].getId() == 6 || this.blocks[i][j + 1].getSquares()[2][0].getId() == 7))
                followPath(i, j + 1, 2); 
        }
    
        // Downwards check
        if (squares[4][2].getId() == 2) {
            if (i + 1 < this.lines && this.blocks[i + 1][j].getSquares()[0][2].getId() == 6)
                followPath(i + 1, j, 3); 
        }
    
        // Left side check
        if (squares[2][0].getId() == 2) {
            if (j - 1 >= 0 && this.blocks[i][j - 1].getSquares()[2][4].getId() == 6)
                followPath(i, j - 1, 0); 
        }
    
        // Top side check
        if (squares[0][2].getId() == 2) {
            if (i - 1 >= 0 && this.blocks[i - 1][j].getSquares()[4][2].getId() == 6)
                followPath(i - 1, j, 1); 
        }
    }    
}

