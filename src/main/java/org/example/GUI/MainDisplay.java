package org.example.GUI;

import javax.swing.*;
import java.awt.*;

public class MainDisplay {
    public MainDisplay(){
        JFrame mainWindow = window();
    }
    public JFrame window() {
        JFrame windowFrame = new JFrame();
        Dimension windowSize = getWindowSize();

        windowFrame.setSize(windowSize);
        windowFrame.setResizable(false);
        windowFrame.setVisible(true);
        return windowFrame;
    }

    public Dimension getWindowSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = screenSize.width;
        int height = screenSize.height;

        int newWidth = width / 3;
        int newHeight = height / 3;

        return new Dimension(newWidth, newHeight);
    }
}
