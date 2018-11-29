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
    private String berita;
    public static int iterator=0;
    
    public FormulirSetorTarik(Customer c,String id, boolean isWithdraw, String jumlah, String berita){
        super(c,id);
        this.berita=berita;
        this.jumlahSetorTarik=jumlah;
    }
    public FormulirSetorTarik(Customer c,String jumlahUang,String keterangan,String berita) {
        super(c,"ST-"+(++iterator));
        this.jumlahSetorTarik=jumlahUang;
        this.berita=berita;
        this.keterangan=keterangan;
    }
    public String getJumlahSetorTarik(){
        return jumlahSetorTarik;
    }
    public void setJumlahSetorTarik(String jumlah){
        this.jumlahSetorTarik=jumlah;
    }
    public String getBerita(){
        return berita;
    }
    public void setBerita(String berita){
        this.berita=berita;
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
