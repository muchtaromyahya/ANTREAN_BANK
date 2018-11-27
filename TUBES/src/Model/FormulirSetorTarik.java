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
public class FormulirSetorTarik extends Formulir{
    private boolean isWithdraw;
    private double jumlahSetorTarik;
    private String berita;
    
    public FormulirSetorTarik(Customer c,String id, boolean isWithdraw, double jumlah, String berita){
        super(c,id);
        this.berita=berita;
        this.isWithdraw=isWithdraw;
        this.jumlahSetorTarik=jumlah;
    }
    public double getJumlahSetorTarik(){
        return jumlahSetorTarik;
    }
    public void setJumlahSetorTarik(double jumlah){
        this.jumlahSetorTarik=jumlah;
    }
    public boolean getTarikSetor(){
        return isWithdraw;
    }
    public void setTarikSetor(boolean isWithdraw){
        this.isWithdraw=isWithdraw;
    }
    public String getBerita(){
        return berita;
    }
    public void setBerita(String berita){
        this.berita=berita;
    }
}
