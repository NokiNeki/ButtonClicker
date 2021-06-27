package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {

    public static int buttonClicks = 0;

    /**
     * @return returns the actionListener that adds 1 to buttonClicks
     * This is for the main click button for the application
     */
    public static ActionListener clickyButtonListener() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClicks++;
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
