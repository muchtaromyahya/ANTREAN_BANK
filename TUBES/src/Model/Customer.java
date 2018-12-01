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
public final class Customer extends Prioritas {
    private String nama;
    private String nik;
    private String noRek;
    private String alamat;
    private String pendidikan;
    private String noHp;
    private String tglLahir;
    private String wali;
    private String id;
    private static int urut;
    
    public Customer (String nama,String NIK, String alamat, String pendidikan, String noHp, String tglLahir, String wali){
        setNama(nama);
        setNIK(NIK);
        setAlamat(alamat);
        setPendidikan(pendidikan);
        setNoHP(noHp);
        setTglLahir(tglLahir);
        setWali(wali);
        
    }
    public Customer (String nama, String nik, String noRek, String alamat, String pendidikan, String noHp, String tglLahir, String wali){
        setNama(nama);
        setNIK(nik);
        setAlamat(alamat);
        setPendidikan(pendidikan);
        setNoHP(noHp);
        setTglLahir(tglLahir);
        setWali(wali);
        setNoRek(noRek);
    }
    public Customer (String nama, String nik, String noRek, String prioritas, String alamat, String pendidikan, String noHp,String tglLahir, String wali){
        setNama(nama);
        setNIK(nik);
        setAlamat(alamat);
        setPendidikan(pendidikan);
        setNoHP(noHp);
        setTglLahir(tglLahir);
        setWali(wali);
        setNoRek(noRek);
        super.setKprioritas(prioritas);
        super.setJprioritas();;
    }
    public Customer (String nama, String noRek) {
        setNama(nama);
        setNoRek(noRek);
        
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik=nik;
        
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getPendidikan(){
        return pendidikan;
    }
    public String getNoHp(){
        return noHp;
    }
    public String getTglLahir(){
        return tglLahir;
    }
    public String getWali(){
        return wali;
    }
    public void setPendidikan(String pendidikan) {
        this.pendidikan=pendidikan;
    }
    public void setNoHP(String nohp) {
        this.noHp=nohp;
    }
    public void setTglLahir(String tgl) {
        this.tglLahir=tgl;
    }
    public void setWali(String wali) {
        this.wali=wali;
    }
    public void setNoRek(String norek) {
        this.noRek=norek;
    }
    public void setNIK(String nik) {
        this.nik=nik;
    }

    public String getNoRek() {
        return noRek;
    }
    
    

}
