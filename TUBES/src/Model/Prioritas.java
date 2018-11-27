/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author geryn
 */
public class Prioritas {
    private String jenisPrioritas;
    private String kodePrioritas;
    public String getKprioritas(){
        return kodePrioritas;
    }
    public String getJprioritas() {
        return jenisPrioritas;
    }
    public void setJprioritas(){
        if (getKprioritas().charAt(0)=='1'){
            this.jenisPrioritas="VIP";
        }
        else if (getKprioritas().charAt(0)=='2'){
            this.jenisPrioritas="VVIP";
        }
        else if (getKprioritas().charAt(0)=='3'){
            this.jenisPrioritas="SVVIP";
        }
    }
    public void setKprioritas(String kode) {
        if (kode.charAt(0)=='1') {
            this.kodePrioritas=kode;
        }
        else if (kode.charAt(0)=='2') {
            this.kodePrioritas=kode;
        }
        else if (kode.charAt(0)=='3') {
            this.kodePrioritas=kode;
        } else {
            System.out.println("INPUTAN kode tidak Benar");
        }
    }
}
