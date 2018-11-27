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
public class CustomerService extends Petugas {
    private String passwordCS;

    public CustomerService(String nama, String id, String alamat, int lama, String tglLahir,String password) {
        super(nama,id, alamat, lama, tglLahir);
        this.passwordCS=password;
    }
    public String getPassword() {
        return passwordCS;
    }
    public void setPassword(String pass) {
        this.passwordCS=pass;
    }
    
}
