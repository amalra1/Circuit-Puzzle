package src.java;

public class Game {
    public static void setInitialState(Circuit circuit)
    {
        // Create each block
        // Line 1
        Block block0 = new Block(5, 5, "origin");
        int[][] block0Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block1 = new Block(5, 5, "line");
        int[][] block1Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 6, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block2 = new Block(5, 5, "double-l");
        int[][] block2Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block3 = new Block(5, 5, "l");
        int[][] block3Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block4 = new Block(5, 5, "over-bottom");
        int[][] block4Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 0, 0, 0, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block5 = new Block(5, 5, "destiny");
        int[][] block5Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {7, 7, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 2
    
        Block block6 = new Block(5, 5, "blank");
        int[][] block6Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block7 = new Block(5, 5, "line");
        int[][] block7Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block8 = new Block(5, 5, "line");
        int[][] block8Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block9 = new Block(5, 5, "l");
        int[][] block9Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 6, 6},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block10 = new Block(5, 5, "double-l");
        int[][] block10Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block11 = new Block(5, 5, "blank");
        int[][] block11Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 3
        Block block12 = new Block(5, 5, "blank");
        int[][] block12Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block13 = new Block(5, 5, "double-l");
        int[][] block13Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block14 = new Block(5, 5, "over-bottom");
        int[][] block14Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 0, 0, 0, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block15 = new Block(5, 5, "t");
        int[][] block15Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {6, 6, 6, 6, 6},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block16 = new Block(5, 5, "l");
        int[][] block16Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block17 = new Block(5, 5, "blank");
        int[][] block17Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        // Line 4
        Block block18 = new Block(5, 5, "origin");
        int[][] block18Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };
    
        Block block19 = new Block(5, 5, "l");
        int[][] block19Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block20 = new Block(5, 5, "double-l");
        int[][] block20Values = {
            {0, 0, 6, 0, 0},
            {0, 6, 6, 0, 0},
            {6, 6, 0, 6, 6},
            {0, 0, 6, 6, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block21 = new Block(5, 5, "l");
        int[][] block21Values = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {6, 6, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block22 = new Block(5, 5, "line");
        int[][] block22Values = {
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
            {0, 0, 6, 0, 0},
        };
    
        Block block23 = new Block(5, 5, "blank");
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
        circuit.setSpecificBlock(0, 0, block0, block0.getType());
        circuit.setSpecificBlock(0, 1, block1, block1.getType());
        circuit.setSpecificBlock(0, 2, block2, block2.getType());
        circuit.setSpecificBlock(0, 3, block3, block3.getType());
        circuit.setSpecificBlock(0, 4, block4, block4.getType());
        circuit.setSpecificBlock(0, 5, block5, block5.getType());
    
        // Line 2
        circuit.setSpecificBlock(1, 0, block6, block6.getType());
        circuit.setSpecificBlock(1, 1, block7, block7.getType());
        circuit.setSpecificBlock(1, 2, block8, block8.getType());
        circuit.setSpecificBlock(1, 3, block9, block9.getType());
        circuit.setSpecificBlock(1, 4, block10, block10.getType());
        circuit.setSpecificBlock(1, 5, block11, block11.getType());
    
        // Line 3
        circuit.setSpecificBlock(2, 0, block12, block12.getType());
        circuit.setSpecificBlock(2, 1, block13, block13.getType());
        circuit.setSpecificBlock(2, 2, block14, block14.getType());
        circuit.setSpecificBlock(2, 3, block15, block15.getType());
        circuit.setSpecificBlock(2, 4, block16, block16.getType());
        circuit.setSpecificBlock(2, 5, block17, block17.getType());
    
        // Line 4
        circuit.setSpecificBlock(3, 0, block18, block18.getType());
        circuit.setSpecificBlock(3, 1, block19, block19.getType());
        circuit.setSpecificBlock(3, 2, block20, block20.getType());
        circuit.setSpecificBlock(3, 3, block21, block21.getType());
        circuit.setSpecificBlock(3, 4, block22, block22.getType());
        circuit.setSpecificBlock(3, 5, block23, block23.getType());
    }

    public static void main(String[] args) 
    {
        // FLAGS
        boolean redraw = false;

        // VARIABLES
        Printer printer = new Printer();
        Circuit circuit = new Circuit(4, 6);
        KeyInputListener keyInputListener = new KeyInputListener();
        char input = ' ';
        int selectedX = 0, selectedY = 0;

        keyInputListener.setVisible(true);

        // Prints menu on screen
        printer.flushScreen();
        printer.printMenu();

        setInitialState(circuit);

        // First to be selected by default (hard code way, fix later)
        circuit.getCircuit()[0][1].setSelected(1);
        selectedX = 0;
        selectedY = 1;

        // Input to start game logic
        input = keyInputListener.getInput();
        while (input == ' ')
            input = keyInputListener.getInput();
        keyInputListener.resetInput();

        // Starts game
        printer.flushScreen();
        printer.printCircuit(circuit);
        printer.printFooterInfos();
        redraw = true;
        circuit.checkElectricity();

        // Game Logic
        while (true) 
        {
            // Reads input
            input = keyInputListener.getInput();

            // Treats inputs
            if (input != ' ') 
            {
                // QUIT
                if (input == 'q') 
                {
                    System.out.println("Player chose to end it.");
                    break;
                } 

                // MOVE SELECTED
                int newX = selectedX;
                int newY = selectedY;

                switch (input) 
                {
                    case 'd': // RIGHT
                        if (selectedY + 1 < 5) 
                            newY++;
                        break;
                    case 'a': // LEFT
                        if (selectedY - 1 > 0) 
                            newY--;
                        break;
                    case 's': // DOWN
                        if (selectedX + 1 < 4) 
                            newX++;
                        break;
                    case 'w': // UP
                        if (selectedX - 1 >= 0) 
                            newX--;
                        break;
                    case 'k': // ROTATE
                        if (circuit.getCircuit()[selectedX][selectedY].getType() != "over-bottom")
                        {
                            circuit.getCircuit()[selectedX][selectedY].rotateRight();
                            redraw = true;
                        }
                        break;
                }

                // Update selection
                if (newX != selectedX || newY != selectedY) 
                {
                    circuit.getCircuit()[selectedX][selectedY].setSelected(0);
                    selectedX = newX;
                    selectedY = newY;
                    circuit.getCircuit()[selectedX][selectedY].setSelected(1);
                    redraw = true;
                }

                // Resets input
                keyInputListener.resetInput();
            }

            // Check whole table for updates on the electricity path
            circuit.checkElectricity();

            // Draw
            if (redraw) 
            {
                printer.flushScreen();
                printer.printCircuit(circuit);
                printer.printFooterInfos();
                redraw = false;
            }
        }

        keyInputListener.dispose();
        
        System.out.println("Game ended");
    }
}
