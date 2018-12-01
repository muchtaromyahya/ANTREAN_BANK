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
public class FormulirBukaRekening extends Formulir {
    private String jenisRekening;
    private String setoranAwal;
    private String keterangan;
    
    public FormulirBukaRekening(Customer c, String jenisRekening, String setoranAwal,String keterangan){
        super(c);
        this.jenisRekening=jenisRekening;
        this.setoranAwal=setoranAwal;
        this.keterangan=keterangan;
    }

    public FormulirBukaRekening(String nama,String id,String jenisRekening, String setoranAwal, String keterangan) {
        super(nama);
        this.jenisRekening = jenisRekening;
        this.setoranAwal = setoranAwal;
        this.keterangan = keterangan;
        this.setIdFormulir(id);
    }
    
    public String getJenisRekening(){
        return jenisRekening;
        
    }
    public void setJenisRekening(String jenisRekening){
        this.jenisRekening=jenisRekening;
    }
    public String getSetoranAwal(){
        return setoranAwal;
    }
    public void setSetoranAwal(String setoranAwal){
        this.setoranAwal=setoranAwal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
}
