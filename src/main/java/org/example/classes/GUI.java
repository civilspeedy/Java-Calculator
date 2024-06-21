package org.example.classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * A Class for managing User Interface elements.
 */
public class GUI {
    JFrame mainFrame;
    Dimension screenSize;
    JPanel panel;
    Calculator calculator;
    Display display;
    String operator;

    /**
     * The Constructor which sets the dimensions of the main frame.
     */
    public GUI() {
        panel = new JPanel();
        calculator = new Calculator();
        display = new Display();
        mainFrame = new JFrame();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        panel.add(display.valueLabel);
    }

    /**
     * Builds the mainframe and inserts the elements that will comprise the interface.
     */
    public void newWindow () {

        panel.setBounds(0, 0, 250, 250);

        mainFrame.add(panel);
        mainFrame.setLayout(new GridLayout(4, 5));
        mainFrame.setSize(scaleSize());

        generateButtons();

        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    /**
     * Calculates the size of the window based of screen size.
     * @return the size of the window as a Dimension.
     */
    public Dimension scaleSize (){
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();
        int scaleFactor = 3;

        int width = (int) screenWidth / scaleFactor;
        int height = (int) screenHeight / scaleFactor;

        return new Dimension(width, height);
    }

    /**
     * Creates a List of buttons to be used in the inputPanel.
     */
    public void generateButtons(){
        List<String> symbols = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            symbols.add(String.valueOf(i));
        }

        symbols.addAll(List.of("+", "-", "÷", ".", "="));

        for (String symbol : symbols){
            JButton button = new JButton(symbol);
            button.setSize(50, 50);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String action = e.getActionCommand();
                    try {
                        // needs to be set up so that only int can come through
                        float actionAsFloat = Float.parseFloat(action);
                        display.updateDisplayValue(actionAsFloat);

                    } catch (Exception err){
                        switch (action) {
                            case "+":
                                break;
                            case "-":
                                break;
                            case "÷":
                                break;
                            case ".":
                                break;
                            case "=":
                                break;
                        }
                    }
                }
            });
            mainFrame.add(button);
        }

    }
}


