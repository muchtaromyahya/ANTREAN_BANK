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
import java.util.*;
public class Administrator {
    private String userName;
    private String password;
    private List<CustomerService> daftarCS;
    private List<Teller> daftarTeller;
    private int jumTeller;
    private int jumCS;
    
    public Administrator(String userName, String password){
        this.userName=userName;
        this.password=password;
        daftarCS=new ArrayList();
        daftarTeller=new ArrayList();
        
    }
    public void addCustomer(CustomerService CS){
        daftarCS.add(CS);
    }
    public void addTeller(Teller teller){
        daftarTeller.add(teller);
    }
    public void removeCS(CustomerService CS){
        for (CustomerService o:daftarCS) {
            if (o.equals(CS)) {
                daftarCS.remove(o);
                break;
            }
        }
    }
    public void removeTeller(Teller teller){
        for(Teller o:daftarTeller) {
            if (o.equals(teller)) {
                daftarTeller.remove(o);
                break;
            }
        }
    }
    public void showTeller () {
        for (Teller o:daftarTeller) {
            System.out.println("Nama Teller :"+o.getNamaPetugas());
        }
    }
    
}
