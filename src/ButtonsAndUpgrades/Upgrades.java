package ButtonsAndUpgrades;

import ButtonsAndUpgrades.Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ButtonsAndUpgrades.Buttons.buttonClicks;
import static ButtonsAndUpgrades.Buttons.clicksPerClick;

public class Upgrades {

    public static int plusOneC = 20;
    public static int plusOneCAmount = 0;

    /**
     * @return the ActionListener for the upgrade
     */
    public static ActionListener clickPlusOneListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonClicks >= plusOneC) {
                    clicksPerClick += 1;
                    buttonClicks -= plusOneC;
                    plusOneC += 5;
                    plusOneCAmount++;
                }
            }
        };
    }


}
