package Gui;

import javax.swing.*;
import java.awt.*;


public class Components {

    /**
     * This is for setting up the main window for the program
     * @return returns the main frame for the program
     */
    public static JFrame setupMainFrame() {
        JFrame mainFrame = new JFrame("ButtonClicker");
        mainFrame.setVisible(true);
        mainFrame.setSize(new Dimension(500, 500));
        mainFrame.setLayout(null);
        return mainFrame;
    }

    /**
     * @param buttonName is used for setting the button text
     * @param frame is the frame that we want to add the button to
     * @return returns the button created
     */
    public static JButton createJButton(String buttonName, JFrame frame) {
        JButton button = new JButton(buttonName);
        button.setBounds(175, 100, 150, 150);
        frame.add(button);
        return button;
    }

    /**
     * @param buttonName is the name of the button/the text that appears on it
     * @param frame is the frame that we want to add the button to
     * @return the button
     */
    public static JButton createResetButton(String buttonName, JFrame frame) {
        JButton button = new JButton(buttonName);
        button.setBounds(215, 300, 75, 25);
        frame.add(button);
        return button;
    }

}
