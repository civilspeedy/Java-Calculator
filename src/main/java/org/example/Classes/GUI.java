package org.example.Classes;
import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();
        System.out.println("Width: " + screenWidth + "Height: " + screenHeight);
        JFrame mainFrame = new JFrame();


    }
}
