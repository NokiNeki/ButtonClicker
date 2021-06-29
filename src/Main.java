import ButtonsAndUpgrades.Upgrades;
import Gui.Components;
import ButtonsAndUpgrades.Buttons;

import javax.swing.*;

import static ButtonsAndUpgrades.Upgrades.plusOneC;
import static ButtonsAndUpgrades.Upgrades.plusOneCAmount;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    static int buttonClicks;

    public static void main(String[] args) {
        JFrame mainFrame = Components.setupMainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // --------------------------------------------------------
        int clickX = 175, clickY = 100;
        JButton mainButton = Components.createJButton("Click Here", mainFrame, 175, 100, 150, 150);
        mainButton.addActionListener(Buttons.clickyButtonListener());

        JLabel clickLabel = Components.createJLabel("test", mainFrame, 0, clickX /*175*/, clickY + 150/*250*/, 150, 50);

        JButton resetButton = Components.createJButton("RESET", mainFrame, clickX + 40/*215*/, clickY + 200/*300*/, 75, 25);
        resetButton.addActionListener(Buttons.resetButtonListener());

        // --------------------------------------------------------
        int clickPlusOneX = 30, clickPlusOneY = 150;
        JButton clickPlusOne = Components.createJButton("+1 CLICK", mainFrame, clickPlusOneX, clickPlusOneY, 120, 30);
        clickPlusOne.addActionListener(Upgrades.clickPlusOneListener());
        JLabel clickPlusOneLabel = Components.createJLabel(plusOneC + " Clicks : " + plusOneCAmount, mainFrame, 0, clickPlusOneX/*30*/, clickPlusOneY + 30/*180*/, 120, 15);





        while (true) {
            clickLabel.setText(Integer.toString(Buttons.buttonClicks));


//            JLabel clickPlusOneLabel = Components.createJLabel(plusOneC + " Clicks : " + plusOneCAmount, mainFrame, 0, 30, 180, 120, 15);
            clickPlusOneLabel.setText(plusOneC + " Clicks : " + plusOneCAmount);
        }
    }
}
