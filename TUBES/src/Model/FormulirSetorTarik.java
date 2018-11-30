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
    private String keterangan;
    private String jumlahSetorTarik;
    public static int iterator=0;
    
    public FormulirSetorTarik(Customer c,String id, boolean isWithdraw, String jumlah, String berita){
        super(c,id);
        this.jumlahSetorTarik=jumlah;
    }
    public FormulirSetorTarik(Customer c,String jumlahUang,String keterangan) {
        super(c,"ST-"+(++iterator));
        this.jumlahSetorTarik=jumlahUang;
        this.keterangan=keterangan;
    }
    public FormulirSetorTarik(String nama,String noRek,String jumlahUang,String keterangan) {
        super(nama,noRek,"ST-"+(++iterator));
        this.jumlahSetorTarik=jumlahUang;
        this.keterangan=keterangan;
    }
    public String getJumlahSetorTarik(){
        return jumlahSetorTarik;
    }
    public void setJumlahSetorTarik(String jumlah){
        this.jumlahSetorTarik=jumlah;
    }
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public static int getIterator() {
        return iterator;
    }

    public static void setIterator(int iterator) {
        FormulirSetorTarik.iterator = iterator;
    }
    
    
}