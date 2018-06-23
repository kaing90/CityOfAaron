/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ethan Russon
 */
public class PayTithingView extends ViewBase {
     /**
     * Constructor
     */
    public PayTithingView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "The Lord has commanded that we pay 10% of our gains in Tithing.\n"
                + "This is not required, but remember that the Lord has promised\n"
                + "that those who are obedient will prosper in the land.";
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("If you wish to pay tithing, you may choose\n"
                + "to pay between 8 and 12 percent of your earnings this year.\n"
                + "Please enter a whole number that is at >7 and <12.\n\n"
                + "If you have changed your mind, simply enter nothing\n"
                + "and you will be returned to the Game Menu.", true);
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No value entered. Returning to the Game Menu...");
            return false;
        }
        
        int percentage = Integer.parseInt(inputs[0]);	
        
        if (percentage < 8 || percentage > 12) {
            System.out.println("Incorrect value. Tithing not paid, please come back and try again.\n"
                    + "Returning to the Game Menu...");
            return false;
        }
        
        calcTithingPaid(percentage);
        
        return false;
    }

    private void calcTithingPaid(int percentage) {
        System.out.println("Entered Tithing percentage will be saved and used to\n"
            + "calculate how much tithing is coming out of your inventory.\n");
    }
}