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
public abstract class Formulir {
    private String namaFormulir;
    private String noRekFormulir;
    private String idFormulir;
    
    public Formulir(Customer c, String id){
        this.namaFormulir=c.getNama();
        this.noRekFormulir=c.getNoRek();
        this.idFormulir=id;
    }
    public String getNamaFormulir(){
        return namaFormulir;
    }

    public String getIdFormulir() {
        return idFormulir;
    }
    public void setNamaFormulir(Customer c) {
        this.namaFormulir=c.getNama();
    }

    public void setIdFormulir(String idform) {
        this.idFormulir=idform;
    }

    public String getNoRekFormulir() {
        return noRekFormulir;
    }

    public void setNoRekFormulir(String noRekFormulir) {
        this.noRekFormulir = noRekFormulir;
    }
    
}
