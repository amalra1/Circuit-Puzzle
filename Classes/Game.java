package Classes;

public class Game 
{
    public static void main(String[] args) 
    {
        Printer printer = new Printer();
        Circuit circuit = new Circuit(1, 2);

        Block block1 = new Block(5, 5);
        int[][] testBlock1 = { 
            {0, 0, 6, 0, 0}, 
            {0, 0, 6, 5, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0}, 
        };
        block1.setSquares(testBlock1);

        Block block2 = new Block(5, 5);
        int[][] testBlock2 = { 
            {5, 5, 5, 5, 5}, 
            {5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5}, 
        };
        block2.setSquares(testBlock2);       

        circuit.setSpecificBlock(0, 0, block1);
        circuit.setSpecificBlock(0, 1, block1);

        printer.printCircuit(circuit);

        circuit.setSpecificBlock(0, 1, block2);

        printer.printCircuit(circuit);
    }
}
