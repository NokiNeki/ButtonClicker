import ButtonsAndUpgrades.Upgrades;
import Gui.Components;
import ButtonsAndUpgrades.Buttons;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {



    public static void main(String[] args) {

        Upgrades Upgrade = Upgrades.getInstance();
        Buttons Button = Buttons.getInstance();


        // -------------------------------------------------------- Main Frame Setup
        JFrame mainFrame = Components.setupMainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // -------------------------------------------------------- Clicker Button
        int clickX = 175, clickY = 100;
        JButton mainButton = Components.createJButton("Click Here", mainFrame, 175, 100, 150, 150);
        mainButton.addActionListener(Button.clickyButtonListener());

        JLabel clickLabel = Components.createJLabel("test", mainFrame, 0, clickX /*175*/, clickY + 150/*250*/, 150, 50);

        JButton resetButton = Components.createJButton("RESET", mainFrame, clickX + 40/*215*/, clickY + 200/*300*/, 75, 25);
        resetButton.addActionListener(Button.resetButtonListener());

        // -------------------------------------------------------- Clicker Upgrade Button
        int clickPlusOneX = 30, clickPlusOneY = 150;
        JButton clickPlusOne = Components.createJButton("+1 CLICK", mainFrame, clickPlusOneX, clickPlusOneY, 120, 30);
        clickPlusOne.addActionListener(Upgrade.clickPlusOneListener());
        JLabel clickPlusOneLabel = Components.createJLabel(Upgrade.clickPlusOneCost + " Clicks : " + Upgrade.clickPlusOneAmount, mainFrame, 0, clickPlusOneX/*30*/, clickPlusOneY + 30/*180*/, 120, 15);

        // -------------------------------------------------------- Auto Clicker Upgrade Button
        int autoPlusOneX = 30, autoPlusOneY = 200;
        JButton autoPlusOne = Components.createJButton("+1 AUTO", mainFrame, autoPlusOneX, autoPlusOneY, 120, 30);
        autoPlusOne.addActionListener(Upgrade.autoPlusOneListener());
        JLabel autoPlusOneLabel = Components.createJLabel(Upgrade.autoPlusOneCost + " Clicks : " + Upgrade.autoPlusOneAmount, mainFrame, 0, autoPlusOneX/*30*/, autoPlusOneY + 30/*180*/, 120, 15);



        // -------------------------------------------------------- Run Time
        class AutoThread extends Thread {
            public void run() {
                while (true) {
                    for (int i = 0; i < Upgrade.autoPlusOneAmount; i++) {
                        Button.buttonClicks++;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {}
                }
            }
        }
        AutoThread autoThread = new AutoThread();
        autoThread.start();

        while (true) {
            clickLabel.setText(Integer.toString(Button.buttonClicks));


            clickPlusOneLabel.setText(Upgrade.clickPlusOneCost + " Clicks : " + Upgrade.clickPlusOneAmount);
            autoPlusOneLabel.setText(Upgrade.autoPlusOneCost + " Clicks : " + Upgrade.autoPlusOneAmount);



        }
    }
}
