package org.example.Classes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A Class for managing User Interface elements.
 */
public class GUI {
    static JFrame mainFrame = new JFrame();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * The Constructor which sets the dimensions of the main frame.
     */
    public GUI() {
        Dimension size = scaleSize();
        System.out.println(size);
        mainFrame.setSize(size);
    }

    /**
     * Builds the mainframe and inserts the elements that will comprise the interface.
     */
    public void newWindow () {
        mainFrame.add(inputPanel());
        mainFrame.setLayout(null);
        mainFrame.pack(); // something broken here
        mainFrame.setVisible(true);
        System.out.println(mainFrame.getSize());
    }

    /**
     * Calculates the size of the window based of screen size.
     * @return the size of the window as a Dimension.
     */
    public static Dimension scaleSize (){
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();

        System.out.println("Screen size = " + screenWidth + "x" + screenHeight);

        int width = (int) screenWidth / 2;
        int height = (int) screenHeight / 2;

        System.out.println("Window size = " + width + "x" + height);
        return new Dimension(width, height);
    }

    /**
     * Creates the panel where all inputs will be.
     * @return A JPanel containing all the inputs.
     */
    public static JPanel inputPanel () {
        JPanel grid = new JPanel(new GridLayout(4, 5));
        List<JButton> buttons = generateButtons();

        for (JButton button : buttons){
            grid.add(button);
        }

        return grid;
    }

    /**
     * Creates a List of buttons to be used in the inputPanel.
     * @return A list of JButtons.
     */
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


