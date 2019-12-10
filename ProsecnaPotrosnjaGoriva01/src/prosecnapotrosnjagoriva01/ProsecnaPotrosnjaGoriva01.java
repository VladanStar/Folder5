
package prosecnapotrosnjagoriva01;


public class ProsecnaPotrosnjaGoriva01 {

    public static void main(String[] args) {
       Automobil a = new Automobil();
       a.dopuniGorivo(35.0);
       
       
       a.voziPOGradu(3.0);
       a.voznjaNaOtvorenom(80.0);
       
       // System.out.println("Prosecna potrosnja od poslednje dopune: " + a.prosecnaPotrosnjaOdPoslednjeDopune());
       a.voziPOGradu(5.6);
       a.voziPOGradu(1.2);
       
       //System.out.println("Prosecna potrosnja od poslednje dopune: " + a.prosecnaPotrosnjaOdPoslednjeDopune());
       a.dopuniGorivo(5.0);
       
       a.voziPOGradu(1.5);
       a.voziPOGradu(1.5);
       
       //System.out.println("Prosecna potrosnja od poslednje dopune: " + a.prosecnaPotrosnjaOdPoslednjeDopune());
        System.out.println("Kraj");
    }
    
}
