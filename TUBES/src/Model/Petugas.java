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
public abstract class Petugas {
  private  String idPetugas;
  private String namaPetugas;
  private String alamatPetugas;
  private int lamaBekerja;
  private String tglLahirPetugas;
  private String password;

    public Petugas(String idPetugas, String password, String namaPetugas, String alamatPetugas, String tglLahirPetugas, int lamaBekerja) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.alamatPetugas = alamatPetugas;
        this.lamaBekerja = lamaBekerja;
        this.tglLahirPetugas = tglLahirPetugas;
        this.password = password;
    }
  
  

  public String getNamaPetugas(){
      return namaPetugas;
  }
  public void setNamaPetugas(String nama)
  {
      this.namaPetugas=nama;
  }
  public String getIdPetugas(){
      return idPetugas;
  }
  public void setIdPetugas(String id){
      this.idPetugas=id;
  }
  public String getAlamatPetugas(){
      return alamatPetugas;
  }
  public void setAlamatPetugas(String alamat){
      this.alamatPetugas=alamat;
  }
  public int getLamaBekerja(){
      return lamaBekerja;
  }
  public void setLamaBekerja(int lama){
      this.lamaBekerja=lama;
  }
  public String getTglLahirPetugas(){
      return tglLahirPetugas;
  }
  public void setTglLahirPetugas(String tgl){
          this.tglLahirPetugas=tgl;
  }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
  
}
