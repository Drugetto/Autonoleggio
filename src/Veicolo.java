public class Veicolo {
    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int posti;
    
    public Veicolo(int codice, String targa, String marca, String modello, int posti) {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.posti = posti;
    }

    public Veicolo(){
        this.codice=35426;
        this.targa="";
        this.marca="";
        this.modello="";
        this.posti=4;
    }
    public Veicolo(Veicolo that){
        this.codice=that.codice;
        this.targa=that.targa;
        this.marca=that.marca;
        this.modello=that.modello;
        this.posti=that.posti;
    }

    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getPosti() {
        return posti;
    }
    public void setPosti(int posti) {
        this.posti = posti;
    }
}
