package Classes;

public class Symbol 
{
    // Attributes
    private int posX, posY;
    private int id;

    // Constructor
    public Symbol(int posX, int posY, int id)
    {
        this.setPosX(posX);
        this.setPosY(posY);
        this.setId(id);
    }

    // Methods
    public int getPosX() 
    { 
        return this.posX; 
    }

    public int getPosY() 
    { 
        return this.posY; 
    }

    public int getId() 
    { 
        return this.id; 
    }

    public void setPosX(int posX)
    {
        this.posX = posX;
    }

    public void setPosY(int posY)
    {
        this.posY = posY;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
