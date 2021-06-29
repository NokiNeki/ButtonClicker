package Gui;

import javax.swing.*;
import java.awt.*;


public class Components {

    /**
     * This is for setting up the main window for the program
     * @return the main frame for the program
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
     * @return the button created
     */
    public static JButton createJButton(String buttonName, JFrame frame, int x, int y, int width, int height) {
        JButton button = new JButton(buttonName);
        button.setBounds(x, y, width, height);
        frame.add(button);
        return button;
    }

    /**
     * @param text is the text that will go into the label
     * @param frame is the frame that the label will be added to
     * @param textAlignment of the text in the label
     * @param x coordinate of the label
     * @param y coordinate of the label
     * @param width of the label
     * @param height of the label
     * @return the label
     */
    public static JLabel createJLabel(String text, JFrame frame, int textAlignment, int x, int y, int width, int height) {
        JLabel label = new JLabel();
        label.setBounds(x, y, width, height);
        label.setText(text);
        label.setHorizontalAlignment(textAlignment);
        frame.add(label);

        return label;
    }


}
