package org.example.Classes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    static JFrame mainFrame = new JFrame();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public GUI() {
        float screenWidth = (float) screenSize.getWidth();
        float screenHeight = (float) screenSize.getHeight();

        int frameWidth = scaleSize(screenWidth);
        int frameHeight = scaleSize(screenHeight);

        mainFrame.setSize(frameWidth,frameHeight);
    }

    public void newWindow () {
        mainFrame.add(inputPanel());
        mainFrame.pack();
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }

    public static int scaleSize (double size){
        return (int) size / 3;
    }

    public static JPanel inputPanel () {
        JPanel grid = new JPanel(new GridLayout(4, 5));
        List<JButton> buttons = generateButtons();

        for (JButton button : buttons){
            grid.add(button);
        }

        return grid;
    }

    public static List<JButton> generateButtons(){
        List<String> symbols = new ArrayList<>();
        List<JButton> buttons = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            symbols.add(String.valueOf(i));
        }

        symbols.addAll(List.of("+", "-", "÷", ".", "="));

        for (String symbol : symbols){
            JButton button = new JButton(symbol);
            button.setSize(50, 50);
            buttons.add(button);
        }

        return buttons;
    }
}


