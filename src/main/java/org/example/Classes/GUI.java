package org.example.Classes;
import javax.swing.*;
import java.awt.*;

public class GUI {
    static JFrame mainFrame = new JFrame();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public GUI() {
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();

        int frameWidth = scaleSize(screenWidth);
        int frameHeight = scaleSize(screenHeight);

        mainFrame.setSize(frameWidth,frameHeight);
    }

    public void createNew () {
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }

    public static int scaleSize (double size){
        return (int) size / 3;
    }
}
