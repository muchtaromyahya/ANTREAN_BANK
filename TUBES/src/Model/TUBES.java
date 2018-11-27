/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author YAHYA
 */
public class TUBES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teller t=new Teller("1","UCUP","BDG",15,"17 April","ucup123");
        
        Administrator Admin=new Administrator("jon","jon");
        Admin.addTeller(t);
        Admin.removeTeller(t);
        Admin.showTeller();
        
        
    }
    
}
