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
    private List<Petugas> petugas;
    private int jumTeller;
    private int jumCS;
    
    public Administrator(String userName, String password){
        this.userName=userName;
        this.password=password;
        petugas=new ArrayList<>();
        
    }
    public void addCustomerService(Petugas CS){
        if (CS.getJenisService().equals("Customer Service")) {
            petugas.add(CS);
            jumCS++;
        }
    }
    public void addTeller(Petugas teller){
        if (teller.getJenisService().equals("Teller")) {
            petugas.add(teller);
        }
        jumTeller++;
    }
    public void removeCS(String CS){
        for (Petugas o:petugas) {
            if (o.getJenisService().equals("Customer Service") && o.getIdPetugas().equals(CS)) {
                petugas.remove(o);
                jumCS--;
                break;
            }
        }
    }
    public void removeTeller(String id){
        for(Petugas o:petugas) {
            if (o.getJenisService().equals("Teller") && o.getIdPetugas().equals(id)) {
                petugas.remove(o);
                jumTeller--;
                break;
            }
        }
    }
    public void showTeller () {
        for (Petugas o: petugas) {
            if (o.getJenisService().equals("Teller"))
            System.out.println("Nama Teller :"+o.getNamaPetugas());
        }
    }
    
}
