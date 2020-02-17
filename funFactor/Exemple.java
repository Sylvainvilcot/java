public class Exemple {
     public static void main(String[] args) {
         // 2
         //   5
         //     4
         //     4
         //     6
         //   6

         Travailleur titi = new Travailleur(4);
         Travailleur tata = new Travailleur(4);
         Travailleur toto = new Travailleur(6);
         Travailleur tete = new Travailleur(6);

         Chef foo = new Chef(5);
         foo.addSubalterne(titi);
         foo.addSubalterne(tata);
         foo.addSubalterne(toto);
         
         Chef bar = new Chef(2);
         bar.addSubalterne(foo);
         bar.addSubalterne(tete);

         System.out.println(bar.bestParty());
     }
    
}




