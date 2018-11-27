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
public class FormulirTransfer extends Formulir {
    private double jumlahTransfer;
    private String rekTujuan;
    private String bankTujuan;
    
    public FormulirTransfer(Customer c,String id, double jumlah, String rekTujuan, String bankTujuan){
        super(c,id);
        this.bankTujuan=bankTujuan;
        this.jumlahTransfer=jumlah;
        this.rekTujuan=rekTujuan;
    }
    public double getJumlahTransfer(){
        return jumlahTransfer;
    }
    public void setJumlahTransfer(int jumlah){
        this.jumlahTransfer= jumlah;
    }
    public String getRekTujuan(){
        return rekTujuan;
    }
    public void setRekTujuan(String rekTujuan){
        this.rekTujuan=rekTujuan;
    }
    public String getBankTujuan(){
        return bankTujuan;
    }
    public void setBankTujuan(String bankTujuan){
        this.bankTujuan=bankTujuan;
    }
    
}
