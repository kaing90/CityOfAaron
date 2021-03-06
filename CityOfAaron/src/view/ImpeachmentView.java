/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ginger
 */
public class ImpeachmentView extends ViewBase{
    /**
     * The message that will be displayed by this view.
     */
    public ImpeachmentView(){
        
    }
    
    @Override
    protected String getMessage(){
        return "You let way too many people die and you have been impeached!\n"
                + "M - Main Menu\n";
                
    }
    
    
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Type your selection:");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
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
        switch (inputs[0].trim().toUpperCase()) {
            case "M":
                mainMenu();
                
        }
        
        return true;
    }
    
    
  
    
    
    private void mainMenu(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
        
    }
}
