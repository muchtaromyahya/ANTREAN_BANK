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
public class Teller extends Petugas {
    private String passwordTeller;
    
    public Teller(String id, String nama, String alamat, int lama, String tgl, String password){
        super(nama,id,alamat,lama,tgl);
        this.passwordTeller=password;
        
    }
    public String getPassword() {
        return passwordTeller;
    }
    public void setPassword(String pass) {
        this.passwordTeller=pass;
    }
}
