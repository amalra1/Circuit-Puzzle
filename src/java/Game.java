package src.java;

public class Game {
    public static void setInitialState(Circuit circuit)
    {
        // Create each block
        // Line 1
        Block block0 = new Block(5, 5);
        int[][] block0Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block1 = new Block(5, 5);
        int[][] block1Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 6, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block2 = new Block(5, 5);
        int[][] block2Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block3 = new Block(5, 5);
        int[][] block3Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block4 = new Block(5, 5);
        int[][] block4Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 0, 0, 0, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block5 = new Block(5, 5);
        int[][] block5Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {7, 7, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 2
    
        Block block6 = new Block(5, 5);
        int[][] block6Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block7 = new Block(5, 5);
        int[][] block7Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block8 = new Block(5, 5);
        int[][] block8Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block9 = new Block(5, 5);
        int[][] block9Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 6, 6},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block10 = new Block(5, 5);
        int[][] block10Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block11 = new Block(5, 5);
        int[][] block11Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 3
        Block block12 = new Block(5, 5);
        int[][] block12Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block13 = new Block(5, 5);
        int[][] block13Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block14 = new Block(5, 5);
        int[][] block14Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 0, 0, 0, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block15 = new Block(5, 5);
        int[][] block15Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {6, 6, 6, 6, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block16 = new Block(5, 5);
        int[][] block16Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block17 = new Block(5, 5);
        int[][] block17Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 4
        Block block18 = new Block(5, 5);
        int[][] block18Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block19 = new Block(5, 5);
        int[][] block19Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block20 = new Block(5, 5);
        int[][] block20Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block21 = new Block(5, 5);
        int[][] block21Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block22 = new Block(5, 5);
        int[][] block22Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block23 = new Block(5, 5);
        int[][] block23Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Set squares for each block
        // Line 1
        block0.setSquares(block0Values);
        block1.setSquares(block1Values);
        block2.setSquares(block2Values);
        block3.setSquares(block3Values);
        block4.setSquares(block4Values);
        block5.setSquares(block5Values);
    
        // Line 2
        block6.setSquares(block6Values);
        block7.setSquares(block7Values);
        block8.setSquares(block8Values);
        block9.setSquares(block9Values);
        block10.setSquares(block10Values);
        block11.setSquares(block11Values);
    
        // Line 3
        block12.setSquares(block12Values);
        block13.setSquares(block13Values);
        block14.setSquares(block14Values);
        block15.setSquares(block15Values);
        block16.setSquares(block16Values);
        block17.setSquares(block17Values);
    
        // Line 4
        block18.setSquares(block18Values);
        block19.setSquares(block19Values);
        block20.setSquares(block20Values);
        block21.setSquares(block21Values);
        block22.setSquares(block22Values);
        block23.setSquares(block23Values);
    
        // Set block in Circuit
        // Line 1
        circuit.setSpecificBlock(0, 0, block0);
        circuit.setSpecificBlock(0, 1, block1);
        circuit.setSpecificBlock(0, 2, block2);
        circuit.setSpecificBlock(0, 3, block3);
        circuit.setSpecificBlock(0, 4, block4);
        circuit.setSpecificBlock(0, 5, block5);

        // First to be selected by default (hard code way, fix later)
        circuit.getCircuit()[0][1].setSelected(1);
    
        // Line 2
        circuit.setSpecificBlock(1, 0, block6);
        circuit.setSpecificBlock(1, 1, block7);
        circuit.setSpecificBlock(1, 2, block8);
        circuit.setSpecificBlock(1, 3, block9);
        circuit.setSpecificBlock(1, 4, block10);
        circuit.setSpecificBlock(1, 5, block11);
    
        // Line 3
        circuit.setSpecificBlock(2, 0, block12);
        circuit.setSpecificBlock(2, 1, block13);
        circuit.setSpecificBlock(2, 2, block14);
        circuit.setSpecificBlock(2, 3, block15);
        circuit.setSpecificBlock(2, 4, block16);
        circuit.setSpecificBlock(2, 5, block17);
    
        // Line 4
        circuit.setSpecificBlock(3, 0, block18);
        circuit.setSpecificBlock(3, 1, block19);
        circuit.setSpecificBlock(3, 2, block20);
        circuit.setSpecificBlock(3, 3, block21);
        circuit.setSpecificBlock(3, 4, block22);
        circuit.setSpecificBlock(3, 5, block23);
    }

    public static void main(String[] args) 
    {
        // FLAGS
        boolean redraw = false;

        Printer printer = new Printer();
        Circuit circuit = new Circuit(4, 6);
        KeyInputListener keyInputListener = new KeyInputListener();
        Animation animation = new Animation(circuit, redraw);
        char input = ' ';

        keyInputListener.setVisible(true);

        // THREADS
        Thread animationThread = new Thread(animation);

        printer.flushScreen();
        printer.printMenu();

        animationThread.start();

        setInitialState(circuit);

        input = keyInputListener.getInput();
        while (input == ' ')
            input = keyInputListener.getInput();
        keyInputListener.resetInput();

        printer.flushScreen();
        printer.printCircuit(circuit);
        redraw = true;

        // Game Logic
        while (true) 
        {
            // Reads input
            input = keyInputListener.getInput();

            // Treats inputs
            if (input != ' ') 
            {
                if (input == 'q') 
                {
                    System.out.println("Game ended by player choice");
                    break;
                } 
                else if (input == 'd') 
                {
                    // test - works
                    //circuit.getCircuit()[0][2].setSelected(1);
                }

                // Resets input
                keyInputListener.resetInput();
            }

            // Draw
            if (animation.getRedraw()) 
            {
                printer.flushScreen();
                printer.printCircuit(circuit);
                redraw = false;
            }
        }

        animation.stop();
        animationThread.interrupt();
        keyInputListener.dispose();
        
        System.out.println("Game ended");
    }
}
