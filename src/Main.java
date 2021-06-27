import Gui.Components;
import Buttons.Button;

import javax.swing.*;

import static javax.swing.SwingConstants.CENTER;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    static int buttonClicks;

    public static void main(String[] args) {
        JFrame mainFrame = Components.setupMainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton mainButton = Components.createJButton("Click Here", mainFrame);
        mainButton.addActionListener(Button.clickyButtonListener());

        JButton resetButton = Components.createResetButton("RESET", mainFrame);
        resetButton.addActionListener(Button.resetButtonListener());

        JLabel clickLabel = new JLabel();
        clickLabel.setBounds(175, 250, 150, 50);
        clickLabel.setText("Test");
        clickLabel.setHorizontalAlignment(CENTER);
        mainFrame.add(clickLabel);

        while (true) {
            clickLabel.setText(Integer.toString(Button.buttonClicks));
        }
    }
}
