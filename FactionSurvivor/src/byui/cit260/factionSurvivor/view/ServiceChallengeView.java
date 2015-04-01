/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class ServiceChallengeView extends View {

    public ServiceChallengeView() {
        super ("\n"
                + "\n----------------------------------------"
                + "\n| Service Challenge                  |"
                + "\n----------------------------------------"
                + "\nT - Talk to Tom"
                + "\nA - Talk to Anna"
                + "\nJ - Talk to John"
                + "\nL - Talk to Leader"
                + "\nS - Save Game"
                + "\nE - Exit to Previous Menu"
                + "\n----------------------------------------");
    }

    

    public void doAction(char choice) {
        switch (choice) {
            case 'T': // Show character selection Tris
                this.talkTom();

                break;
            case 'A': // Show Character Selection Four
                this.talkAnna();
                break;
            case 'J': // Show Character Selection Christina
                this.talkJohn();
                break;
            case 'L': // Show Character Selection Eric
                this.talkLeader();
                break;
            case 'S': // Show Character Selection Natalie
                this.saveGame();

            case 'E': // Exit to previous menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

    }

    private void talkTom() {
        System.out.println("*** you talked to Tom ***");
    }

    private void talkAnna() {
        System.out.println("*** you talked to Anna ***");
    }

    private void talkJohn() {
        System.out.println("*** you talked to John ***");
    }

    private void talkLeader() {

    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
