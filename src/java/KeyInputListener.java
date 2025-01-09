package src.java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyInputListener extends JFrame implements KeyListener {
    private volatile char input = ' ';

    public KeyInputListener() {
        setTitle("KeyInputListener");
        setSize(400, 400); // Ajuste o tamanho conforme necessário
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Não faz nada na borda de subida
    }

    @Override
    public void keyReleased(KeyEvent e) {
        input = e.getKeyChar();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não faz nada
    }

    public char getInput() {
        return input;
    }

    public void resetInput() {
        input = ' ';
    }
}