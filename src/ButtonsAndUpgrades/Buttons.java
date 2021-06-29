package ButtonsAndUpgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    public static int buttonClicks = 0;
    public static int clicksPerClick = 1;

    /**
     * @return the actionListener that adds 1 to buttonClicks
     * This is for the main click button for the application
     */
    public static ActionListener clickyButtonListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClicks += clicksPerClick;
            }
        };
    }

    /**
     * @return the ActionListener that resets buttonClicks
     */
    public static ActionListener resetButtonListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 buttonClicks = 0;
            }
        };
    }


}
