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

    /**
     * The Constructor which sets the dimensions of the main frame.
     */
    public GUI() {
    }

    /**
     * Builds the mainframe and inserts the elements that will comprise the interface.
     */
    public void newWindow () {
        mainFrame.setLayout(new GridLayout(4, 5));
        mainFrame.setSize(scaleSize());
        generateButtons();
        mainFrame.setResizable(false);
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
        int scaleFactor = 3;

        System.out.println("Screen size = " + screenWidth + "x" + screenHeight);

        int width = (int) screenWidth / scaleFactor;
        int height = (int) screenHeight / scaleFactor;

        System.out.println("Window size = " + width + "x" + height);
        return new Dimension(width, height);
    }

    /**
     * Creates a List of buttons to be used in the inputPanel.
     */
    public static void generateButtons(){
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
                }
            });
            mainFrame.add(button);
        }

    }
}


