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
}
enum vrstaDilera{zabavljac, dosadan, ludi};
class diler extends osoba{
    vrstaDilera d;
int godineUskustva;
int getGodineIskustva() {return godineUskustva;}
void setGodineIskustva(int godineUskustva){this.godineUskustva = godineUskustva;}
vrstaDilera getD() {return d;}
void setD(vrstaDilera d){this.d = d;}
}
enum tipIgraca{ruletas, pokerman, vockica};
class igrac extends osoba{
tipIgraca igrac;
    int getBroj() {return broj;}
    void setBroj(int broj){this.broj = broj;}
    tipIgraca getIgrac() {return igrac;}
    void set(tipIgraca igrac){this.igrac = igrac;}
}

enum tipSekjurutuja{lightweight, heavyweight};
class sekjuriti extends osoba{
    tipSekjurutuja sekjuriti;
    tipSekjurutuja getSekjuriti() {return sekjuriti;}
    void setSekjuriti(tipSekjurutuja sekjuriti){this.sekjuriti = sekjuriti;}
}