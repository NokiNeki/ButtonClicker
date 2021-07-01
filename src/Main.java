import ButtonsAndUpgrades.Upgrades;
import Gui.Components;
import ButtonsAndUpgrades.Buttons;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {



    public static void main(String[] args) {

        Upgrades Upgrade = Upgrades.getInstance();
        Buttons Button = Buttons.getInstance();


        // -------------------------------------------------- Main Frame Setup
        JFrame mainFrame = Components.setupMainFrame();
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // -------------------------------------------------- Clicker Button
        int clickX = 175, clickY = 50;
        JButton mainButton = Components.createJButton("Click Here", mainFrame, clickX, clickY, 150, 150);
        mainButton.addActionListener(Button.clickyButtonListener());

        JLabel clickLabel = Components.createJLabel("Clicks : "+ Button.buttonClicks, mainFrame, 0, clickX /*175*/, clickY + 150/*250*/, 150, 50);

        JButton resetButton = Components.createJButton("RESET", mainFrame, clickX + 40/*215*/, clickY + 200/*300*/, 75, 25);
        resetButton.addActionListener(Button.resetButtonListener());

        // -------------------------------------------------- Clicker Upgrade Button
        int clickPlusOneX = 30, clickPlusOneY = 50;
        JButton clickPlusOne = Components.createJButton("+1 CLICK", mainFrame, clickPlusOneX, clickPlusOneY, 120, 30);
        clickPlusOne.addActionListener(Upgrade.clickPlusOneListener());
        JLabel clickPlusOneLabel = Components.createJLabel(Upgrade.clickPlusOneCost + " Clicks : " + Upgrade.clickPlusOneAmount, mainFrame, 0, clickPlusOneX/*30*/, clickPlusOneY + 30/*180*/, 120, 15);

        // -------------------------------------------------- Clicker Upgrade +10 Button
        int clickPlusTenX = 30, clickPlusTenY = 100;
        JButton clickPlusTen = Components.createJButton("+10 CLICK", mainFrame, clickPlusTenX, clickPlusTenY, 120, 30);
        clickPlusTen.addActionListener(Upgrade.clickPlusTenListener());
        JLabel clickPlusTenLabel = Components.createJLabel(Upgrade.clickPlusTenCost + " Clicks : " + Upgrade.clickPlusTenAmount, mainFrame, 0, clickPlusTenX, clickPlusTenY + 30, 120, 15);

        // -------------------------------------------------- Auto Clicker Upgrade Button
        int autoPlusOneX = 30, autoPlusOneY = 150;
        JButton autoPlusOne = Components.createJButton("+1 AUTO", mainFrame, autoPlusOneX, autoPlusOneY, 120, 30);
        autoPlusOne.addActionListener(Upgrade.autoPlusOneListener());
        JLabel autoPlusOneLabel = Components.createJLabel(Upgrade.autoPlusOneCost + " Clicks : " + Upgrade.autoPlusOneAmount, mainFrame, 0, autoPlusOneX/*30*/, autoPlusOneY + 30/*180*/, 120, 15);



        // -------------------------------------------------- Run Time

        clickPlusOneLabel.setText(Upgrade.clickPlusOneCost + " Clicks : " + Upgrade.clickPlusOneAmount);
        clickPlusTenLabel.setText(Upgrade.clickPlusTenCost + " Clicks : " + Upgrade.clickPlusTenAmount);
        autoPlusOneLabel.setText(Upgrade.autoPlusOneCost + " Clicks : " + Upgrade.autoPlusOneAmount);

        // ----- Automatic clicker thread
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

        // ----- Game Loop
        while (true) {
            clickLabel.setText("Clicks : " + Button.buttonClicks);


            clickPlusOneLabel.setText(Upgrade.clickPlusOneCost + " Clicks : " + Upgrade.clickPlusOneAmount);
            clickPlusTenLabel.setText(Upgrade.clickPlusTenCost + " Clicks : " + Upgrade.clickPlusTenAmount);
            autoPlusOneLabel.setText(Upgrade.autoPlusOneCost + " Clicks : " + Upgrade.autoPlusOneAmount);
        }
    }
}
