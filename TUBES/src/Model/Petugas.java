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
  public Petugas(String nama, String id,String alamat,int lama,String tglLahir){
      this.namaPetugas=nama;
      this.idPetugas=id;
      this.lamaBekerja=lama;
      this.tglLahirPetugas=tglLahir;
      this.alamatPetugas=alamat;
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
}
