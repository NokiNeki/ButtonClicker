package ButtonsAndUpgrades;

import java.awt.event.ActionListener;

public class Upgrades {

    Buttons Button = Buttons.getInstance();


    // -------------------------------------------------- Self instance
    private static final Upgrades UPGRADESINSTANCE = new Upgrades();

    private Upgrades() {}

    /**
     * @return an instance so all classes can use the same instance
     */
    public static Upgrades getInstance() {
        return UPGRADESINSTANCE;
    }




    // -------------------------------------------------- Upgrade methods
    public int clickPlusOneAmount = 1, clickPlusOneCost = 20;
    /**
     * @return the ActionListener for the click upgrade
     */
    public ActionListener clickPlusOneListener() {

        return e -> {
            if (Button.buttonClicks >= clickPlusOneCost) {
                Button.clicksPerClick += 1;
                Button.buttonClicks -= clickPlusOneCost;
                clickPlusOneCost += 5;
                clickPlusOneAmount++;
            }
        };
    }

    public int clickPlusTenAmount = 0, clickPlusTenCost = 80;
    public ActionListener clickPlusTenListener() {

        return e -> {
            if (Button.buttonClicks >= clickPlusTenCost) {
                Button.buttonClicks -= clickPlusTenCost;
                clickPlusTenAmount += 1;
                clickPlusTenCost += 50;
                Button.clicksPerClick += 10;
            }
        };
    }


    public int autoPlusOneAmount = 0, autoPlusOneCost = 60;
    /**
     * @return the ActionListener for the automatic clicker
     */
    public ActionListener autoPlusOneListener() {

        return e -> {
            if (Button.buttonClicks >= autoPlusOneCost) {
                autoPlusOneAmount += 1;
                Button.buttonClicks -= autoPlusOneCost;
                autoPlusOneCost += 20;
            }
        };
    }
    // -------------------------------------------------- Reset method
    public void upgradeReset() {
        clickPlusOneAmount = 1;
        clickPlusOneCost = 20;
        clickPlusTenAmount = 0;
        clickPlusTenCost = 80;
        autoPlusOneAmount = 0;
        autoPlusOneCost = 60;
    }

}
