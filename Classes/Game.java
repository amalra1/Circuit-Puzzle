package Classes;
public class Game 
{
    public static void main(String[] args) 
    {
        Circuit circuit = new Circuit(1, 2);
        Block block = new Block(5, 5);
        int[][] testBlock = { 
            {0, 0, 6, 0, 0}, 
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0}, };

        block.setSquares(testBlock);        

        circuit.setSpecificBlock(0, 0, block);
        circuit.setSpecificBlock(0, 1, block);
        circuit.printCircuit();
    }
}