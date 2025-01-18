package src.java;

public class Block 
{
    // Attributes
    private int lines, columns;
    //private String type;
    private int selected;
    private Symbol[][] squares;

    // Constructor
    public Block(int lines, int columns) 
    { 
        this.squares = new Symbol[lines][columns];
        this.setLines(lines);
        this.setColumns(columns); 
        //this.setSelected(0);
        //this.setType(type);
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

    public int getSelected() 
    { 
        return this.selected; 
    }

    public Symbol[][] getSquares() 
    { 
        return this.squares; 
    }
    
    public void setLines(int lines) 
    { 
        this.lines = lines; 
    } 
    
    public void setColumns(int columns) 
    { 
        this.columns = columns;  
    }

    public void setSelected(int selected) 
    { 
        this.selected = selected;
        
        // Change selected block color to red
        if (selected == 1)
        {
            for (int k = 0; k < this.lines; k++) 
                for (int l = 0; l < this.columns; l++) 
                    if (this.squares[k][l].getId() == 0) 
                        this.squares[k][l].setId(8);
        }
        else
        {
            for (int k = 0; k < this.lines; k++) 
                for (int l = 0; l < this.columns; l++)     
                    if (this.squares[k][l].getId() == 8) 
                        this.squares[k][l].setId(0);
        }
    }

    public void setSpecificSquare(int line, int column, int value) 
    { 
        if (line < 0 || line >= this.lines || column < 0 || column >= this.columns) 
            throw new IllegalArgumentException("Trying to set out of block bounds");
        
        this.squares[line][column] = new Symbol(value);
    }

    public void setSquares(int[][] values)
    {
        for (int i = 0; i < this.lines; i++) 
            for (int j = 0; j < this.columns; j++) 
                this.squares[i][j] = new Symbol(values[i][j]);
    }
}
