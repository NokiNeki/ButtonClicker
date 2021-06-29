package ButtonsAndUpgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Upgrades {

    Buttons Button = Buttons.getInstance();


    private static final Upgrades UPGRADESINSTANCE = new Upgrades();
    private Upgrades() {}

    /**
     * @return an instance so all classes can use the same instance
     */
    public static Upgrades getInstance() {
        return UPGRADESINSTANCE;
    }



    public int clickPlusOneAmount = 0, clickPlusOneCost = 20;
    /**
     * @return the ActionListener for the click upgrade
     */
    public ActionListener clickPlusOneListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Button.buttonClicks >= clickPlusOneCost) {
                    Button.clicksPerClick += 1;
                    Button.buttonClicks -= clickPlusOneCost;
                    clickPlusOneCost += 5;
                    clickPlusOneAmount++;
                }
            }
        };
    }


    public int autoPlusOneAmount = 0, autoPlusOneCost = 60;
    /**
     * @return the ActionListener for the automatic clicker
     */
    public ActionListener autoPlusOneListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Button.buttonClicks >= autoPlusOneCost) {
                    autoPlusOneAmount += 1;
                    Button.buttonClicks -= autoPlusOneCost;
                    autoPlusOneCost += 20;

                }
            }
        };
    }


}
