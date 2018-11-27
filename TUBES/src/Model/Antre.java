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
public class Antre {
    private String jenisAntre;
    private String tanggalAntre;
    private int noAntre=1;
    private List<String> List;
    private int jumlahAntre;
    public Antre(String jenisAntre, String tglAntre){
        if (jenisAntre=="Teller" || jenisAntre=="Customer Sevice") {
            this.jenisAntre=jenisAntre;
        } else {
            this.jenisAntre="Customer Service";
        }
        
        this.tanggalAntre=tglAntre;
        List=new ArrayList();
    }
    public void addAntre(){
        if (jenisAntre=="Teller") {
            List.add("T"+noAntre);
            noAntre++;
            jumlahAntre++;
        }
        if(jenisAntre=="Customer Service") {
            List.add("CS"+noAntre);
            noAntre++;
            jumlahAntre++;
        }
    }
    public void delAntre(){
        List.remove(0);
        jumlahAntre--;
    }
    public void setJumlahAntre(int jum){
        this.jumlahAntre=jum;
    }
    public void setJenisAntre(String jenis){
        this.jenisAntre=jenis;
    }
    public int getJumlahAntre(){
        return jumlahAntre;
    }
    public String getJenisAntre(){
        return jenisAntre;
    }
    public String getTanggalAntre(){
        return tanggalAntre;
    }
    public String getNoAntre(int o){
        return List.get(o);
    }
    public void setTanggalAntre(String tgl){
        this.tanggalAntre=tgl;
    }
    public void setNoAntre(int index,int nomor){
        if(jenisAntre=="teller") {
            List.set(index, "T"+nomor);
        } else if (jenisAntre=="Customer Service") {
            List.set(index, "CS"+nomor);
        }
    }
    
}
