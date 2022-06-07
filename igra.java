package casino;


abstract class osoba{
    String ime;
    String prezime;
    int godine;
public osoba(){
    this.ime = "Jova";
    this.prezime = "Polovina";
    this.godine= 18;
 
}
@Override
public String toString() {
    return "Ime: "+ this.ime + "Prezime: " + this.prezime + "Godine: " + this.godine;
}
public osoba(String ime, String prezime, int godine){
    this.ime = ime;
    this.prezime = prezime;
    this.godine= godine;
}
String getIme() {return ime;}
void setIme(String ime){this.ime = ime;}
String getPrezime() {return prezime;}
void setPrezime(String prezime){this.prezime = prezime;}
int getGodine() {return godine;}
void setGodine(int godine){this.godine = godine;}
}

abstract class igra {
    int unos;
    int nagrada;
    osoba o;
    public igra(int unos, int nagrada, osoba o){
        this.unos = unos;
        this.nagrada = nagrada;
        this.o = o;
    }
    int getUnos() {return unos;}
void setUnos(int unos){this.unos = unos;}
int getNagrada() {return nagrada;}
void setNagrada(int nagrada){this.nagrada = nagrada;}
osoba getO() {return o;}
void setO(osoba o){this.o = o;}
@Override
public String toString() {
    return "Unos: "+this.unos + "Nagrada: " + this.nagrada + "Osoba: " + o.ime;
}
}

class Poker extends igra{
int karta;
int tokeni;
public Poker(int k, int t, int unos, int nagrada, osoba o){
    super(unos, nagrada, o);
    this.karta = k;
    this.tokeni = t;
}
int getKarta() {return karta;}
void setKarta(int karta){this.karta = karta;}
int getTokeni() {return tokeni;}
void setTokeni(int tokeni){this.tokeni = tokeni;}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "Karta: "+ this.karta + "Token: " + this.tokeni;
}
}
enum boja{crvena, crna, nula};
class Rulet extends igra{
int broj;
boja b;
boja getB() {return b;}
void setB(boja b){this.b = b;}
public Rulet(int broj, boja b, int unos, int nagrada, osoba o){
    super(unos, nagrada, o);
    this.b = b;
    this.broj = broj;
}
@Override
public String toString() {
    return super.toString() + "Broj: "+this.broj + "Boja: "+ this.b;
}
}
enum vocke{banana, ananas, visnja};
class vockice extends igra{
    vocke v;
     vocke getV() {return v;}
    void setV(vocke v){this.v = v;}
    public vockice(int b, vocke v, int unos, int nagrada, osoba o){
        super(unos, nagrada, o);
        this.v = v;
        
    }
  @Override
  public String toString() {
      return super.toString() + "Vocka: "+this.v;
  }
}
enum vrstaDilera{zabavljac, dosadan, ludi};
class diler extends osoba{
    vrstaDilera d;
int godineUskustva;
int getGodineIskustva() {return godineUskustva;}
void setGodineIskustva(int godineUskustva){this.godineUskustva = godineUskustva;}
vrstaDilera getD() {return d;}
void setD(vrstaDilera d){this.d = d;}
public diler(String ime, String prezime, int godine, vrstaDilera v, int godineUskustva){
    super(ime, prezime, godine);
    this.d = v; this.godineUskustva = godineUskustva;}
@Override
public String toString() {
    return super.toString() + "Vrsta dilera: " + this.d + "godine iskustva: "+this.godineUskustva;
}
}
enum tipIgraca{ruletas, pokerman, vockica};
class igrac extends osoba{
tipIgraca igrac;
    tipIgraca getIgrac() {return igrac;}
    void set(tipIgraca igrac){this.igrac = igrac;}
    public igrac(String ime, String prezime, int godine, tipIgraca v){
        super(ime, prezime, godine);
        this.igrac = v; 
    }
    @Override
    public String toString() {
        return super.toString() + "Tip igraca: " + this.igrac;
    }
}

enum tipSekjurutuja{lightweight, heavyweight};
class sekjuriti extends osoba{
    tipSekjurutuja sekjuriti;
    tipSekjurutuja getSekjuriti() {return sekjuriti;}
    void setSekjuriti(tipSekjurutuja sekjuriti){this.sekjuriti = sekjuriti;}
    public sekjuriti(String ime, String prezime, int godine, tipSekjurutuja t){
        super(ime, prezime, godine);
    this.sekjuriti = t;    
    }
    @Override
    public String toString() {
        return super.toString() + "Tip sekjuritija: " + this.sekjuriti;
    }
}