package org.example.Classes;
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
    static JFrame mainFrame = new JFrame();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    JPanel panel = new JPanel();
    JLabel display = new JLabel();

    static int value;
    static int valueTwo;
    static String operator;

    /**
     * The Constructor which sets the dimensions of the main frame.
     */
    public GUI() {
        value = 0;
        valueTwo = 0;
    }

    /**
     * Builds the mainframe and inserts the elements that will comprise the interface.
     */
    public void newWindow () {
        panel.add(display);
        display.setText("2");

        panel.setBounds(0, 0, 250, 250);
        panel.setBackground(Color.blue);

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

        System.out.println("Screen size = " + screenWidth + "x" + screenHeight);

        int width = (int) screenWidth / scaleFactor;
        int height = (int) screenHeight / scaleFactor;

        System.out.println("Window size = " + width + "x" + height);
        return new Dimension(width, height);
    }

    public void updateDisplay(String item){
        display.setText(item);
    }

    public void updateDisplay(int item){
        String stringItem = String.valueOf(item);
        display.setText(stringItem);
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
                    System.out.println("This button was pressed " + action);
                    try {
                        // needs to be set up so that only int can come through
                        updateDisplay(action);


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


