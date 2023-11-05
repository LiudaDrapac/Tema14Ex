package zoo;

import java.util.List;

public class Animal {
    private String nume;
    private int virsta;
    private String carne;
    private String iarba;

    public Animal(String nume, int virsta, String carne, String iarba) {
        this.nume = nume;
        this.virsta = virsta;
        this.carne = carne;
        this.iarba = iarba;
    }
    public String getNume() {
        return nume;
   }
    public void setNume(String nume){
        this.nume = nume;
    }

    public int getVirsta() {
        return virsta;
    }
    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }

    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;

    }
    public String getIarba() {
        return iarba;
    }
    public void setIarba(String iarba) {
        this.iarba = iarba;
    }
}
