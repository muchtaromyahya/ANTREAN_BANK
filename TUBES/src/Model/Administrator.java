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
public class Administrator extends Petugas {
    String jenis;

    public Administrator(String idPetugas, String password, String namaPetugas, String alamatPetugas, String tglLahirPetugas, int lamaBekerja,String jenis) {
        super(idPetugas, password, namaPetugas, alamatPetugas, tglLahirPetugas, lamaBekerja);
        this.jenis=jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
}
