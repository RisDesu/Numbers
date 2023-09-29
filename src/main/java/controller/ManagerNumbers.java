/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import model.Text;
import view.Menu;

/**
 *
 * @author HP
 */
public class ManagerNumbers extends Menu<String> {
    
    private Text list= new Text();
    
    public ManagerNumbers(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.superlativeEquation();
                
                break;
            case 2:
                list.quadraticEquation();
                break;
            case 3: 
                System.exit(0);               
        }
    }
}
