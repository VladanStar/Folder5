
package prosecnapotrosnjagoriva01;

public class Automobil {
    private double rezervoar = 0.0;
    private double predjeniPut = 0.0;
    
    
    private double predjenaKilometrazaKodPoslednjeDopune = 0.0;
    private double stanjeRezervoaraKodPoslednjeDopune = 0.0;
    private double iznosPoslednjeDopuneRezervoara = 0;

    public Automobil() {
    }

    public double getRezervoar() {
        return rezervoar;
    }

    public double getPredjeniPut() {
        return predjeniPut;
    }
    public void dopuniGorivo(double kolicina){
        System.out.println("Do sada je prosecna potrosnja:" + this.prosecnaPotrosnjaOdPoslednjeDopune());
        stanjeRezervoaraKodPoslednjeDopune = rezervoar;
        predjenaKilometrazaKodPoslednjeDopune = predjeniPut;
        
        rezervoar += kolicina;
        iznosPoslednjeDopuneRezervoara = kolicina;
    }
    public void voziPOGradu(double put){
        predjeniPut += put;
        rezervoar -= (put/100)*7.0;
    
    }
    public void voznjaNaOtvorenom(double put){
        predjeniPut += put;
        rezervoar -= (put/100)*5.6;
    
    }
    public double prosecnaPotrosnjaOdPoslednjeDopune(){
        double potrosenoGorivo, predjeniKm;
        predjeniKm = predjeniPut - predjenaKilometrazaKodPoslednjeDopune;
        potrosenoGorivo = stanjeRezervoaraKodPoslednjeDopune + iznosPoslednjeDopuneRezervoara - rezervoar;
        return (potrosenoGorivo/100)/predjeniKm;
    }
    
    
          
}
