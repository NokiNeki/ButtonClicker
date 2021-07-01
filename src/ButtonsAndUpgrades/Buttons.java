package ButtonsAndUpgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    Upgrades Upgrade = Upgrades.getInstance();

    public int buttonClicks = 0;
    public int clicksPerClick = 1;

    // -------------------------------------------------- Self instance
    private static final Buttons BUTTONSINSTANCE = new Buttons();

    private Buttons() {}

    /**
     * @return an instance so all classes can use the same instance
     */
    public static Buttons getInstance() {
        return BUTTONSINSTANCE;
    }


    // -------------------------------------------------- Button methods

    /**
     * @return the actionListener that adds 1 to buttonClicks
     */
    public ActionListener clickyButtonListener() {

        return e -> {
            buttonClicks += clicksPerClick;
        };
    }

    /**
     * @return the ActionListener that resets buttonClicks
     */
    public ActionListener resetButtonListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClicks = 0;
                Upgrades.getInstance().upgradeReset();
            };
        };
    }
}
