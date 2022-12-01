public class Bataillenavale {
	static class BJoueur {
		Torpilleur Torpilleur;
		Sousmarin1 Sousm1;
		Sousmarin2 Sousm2;
		Croiseur Croiseur;
		Porteavion Porteav;
	}
	static class Torpilleur {
		int Torpilleurc1
		int Torpilleurc2
		String Torpilleurl1
		String Torpilleurl2
	}
	static class Sousmarin1 {
		int Sousmarin1c1
		int Sousmarin1c2
		int Sousmarin1c3
		String Sousmarin1l1
		String Sousmarin1l2
		String Sousmarin1l3
	}
	static class Sousmarin2 {
		int Sousmarin2c1
		int Sousmarin2c2
		int Sousmarin2c3
		String Sousmarin2l1
		String Sousmarin2l2
		String Sousmarin2l3
	}
	static class Croiseur {
		
	}
	static class Porteavion {
		
	}
	static void Presentation(){
		Ecran.afficherln("||	Bienvenu dans la bataille navale	||");
		Ecran.afficher("\n");
		Ecran.afficherln("***		Tout d'abord présentation des règles :		***");
		Ecran.afficherln("***		Vous allez disposer des bateaux sur une grille de 10 par 10 et le but sera de faire couler tout les bateaux adverse.		***");
		Ecran.afficherln("***		Pour toucher un bateau adverse il faudra selectionner une case et si celle-ci contient un bateaux adverse alors celui-ci sera toucher		***");
		Ecran.afficherln("***		et enfin si un bateaux est entierement toucher alors il va couler on appel sa le toucher couler		***");
		Ecran.afficherln("***		Le jeu se termine quand l'un des joueurs perd entierement ses bateaux, le vainqueur est alors celui a qui il reste encore des bateaux		***");
		Ecran.afficherln("\n");
	}
	static BJoueur SaisirTJ(){
		BJoueur b1 = new BJoueur();
		Ecran.afficherln("Veuillez saisir la ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurl=Clavier.saisirString();
		switch(b1.Torpilleurl){
				case "A":{
					b1.Torpilleurli=0;
					break;
				}
				case "B":{
					b1.Torpilleurli=1;
					break;
				}
				case "C":{
					b1.Torpilleurli=2;
					break;
				}
				case "D":{
					b1.Torpilleurli=3;
					break;
				}
				case "E":{
					b1.Torpilleurli=4;
					break;
				}
				case "F":{
					b1.Torpilleurli=5;
					break;
				}
				case "G":{
					b1.Torpilleurli=6;
					break;
				}
				case "H":{
					b1.Torpilleurli=7;
					break;
				}
				case "I":{
					b1.Torpilleurli=8;
					break;
				}
				case "J":{
					b1.Torpilleurli=9;
					break;
				}
			}
		Ecran.afficherln("Veuillez saisir la colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationT = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS1J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1l=Clavier.saisirString();
		switch(b1.Sousm1l){
				case "A":{
					b1.Sousm1li=0;
					break;
				}
				case "B":{
					b1.Sousm1li=1;
					break;
				}
				case "C":{
					b1.Sousm1li=2;
					break;
				}
				case "D":{
					b1.Sousm1li=3;
					break;
				}
				case "E":{
					b1.Sousm1li=4;
					break;
				}
				case "F":{
					b1.Sousm1li=5;
					break;
				}
				case "G":{
					b1.Sousm1li=6;
					break;
				}
				case "H":{
					b1.Sousm1li=7;
					break;
				}
				case "I":{
					b1.Sousm1li=8;
					break;
				}
				case "J":{
					b1.Sousm1li=9;
					break;
				}
			}
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationS1 = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS2J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm2l=Clavier.saisirString();
		switch(b1.Sousm2l){
				case "A":{
					b1.Sousm2li=0;
					break;
				}
				case "B":{
					b1.Sousm2li=1;
					break;
				}
				case "C":{
					b1.Sousm2li=2;
					break;
				}
				case "D":{
					b1.Sousm2li=3;
					break;
				}
				case "E":{
					b1.Sousm2li=4;
					break;
				}
				case "F":{
					b1.Sousm2li=5;
					break;
				}
				case "G":{
					b1.Sousm2li=6;
					break;
				}
				case "H":{
					b1.Sousm2li=7;
					break;
				}
				case "I":{
					b1.Sousm2li=8;
					break;
				}
				case "J":{
					b1.Sousm2li=9;
					break;
				}
			}
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm2c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationS2 = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirCJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseurl=Clavier.saisirString();
		switch(b1.Croiseurl){
				case "A":{
					b1.Croiseurli=0;
					break;
				}
				case "B":{
					b1.Croiseurli=1;
					break;
				}
				case "C":{
					b1.Croiseurli=2;
					break;
				}
				case "D":{
					b1.Croiseurli=3;
					break;
				}
				case "E":{
					b1.Croiseurli=4;
					break;
				}
				case "F":{
					b1.Croiseurli=5;
					break;
				}
				case "G":{
					b1.Croiseurli=6;
					break;
				}
				case "H":{
					b1.Croiseurli=7;
					break;
				}
				case "I":{
					b1.Croiseurli=8;
					break;
				}
				case "J":{
					b1.Croiseurli=9;
					break;
				}
			}
		Ecran.afficherln("Veuillez saisir la colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationC = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirPJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavl=Clavier.saisirString();
		switch(b1.Porteavl){
				case "A":{
					b1.Porteavli=0;
					break;
				}
				case "B":{
					b1.Porteavli=1;
					break;
				}
				case "C":{
					b1.Porteavli=2;
					break;
				}
				case "D":{
					b1.Porteavli=3;
					break;
				}
				case "E":{
					b1.Porteavli=4;
					break;
				}
				case "F":{
					b1.Porteavli=5;
					break;
				}
				case "G":{
					b1.Porteavli=6;
					break;
				}
				case "H":{
					b1.Porteavli=7;
					break;
				}
				case "I":{
					b1.Porteavli=8;
					break;
				}
				case "J":{
					b1.Porteavli=9;
					break;
				}
			}
		Ecran.afficherln("Veuillez saisir la colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationP = Clavier.saisirString();
		return b1;
	}
	static BJoueur transfrom(BJoueur b1){
		int 
	static void plateaux(BJoueur b1){
		int colonne=0;
		boolean pasvide = true ;
		for(int i=0;i<10;i++){
			colonne=i;
			for(int k=0;k<10;k++){
				if (b1.Torpilleurli==colonne) {					
					if (b1.Torpilleurc==k) {
						Ecran.afficher("X ");
						pasvide = false;
					}
				} if (b1.Sousm1li==colonne) {
					if (b1.Sousm1c==k){
						Ecran.afficher("X ");
						pasvide = false;
					}
				} if (b1.Sousm2li==colonne) {
					if (b1.Sousm2c==k){
						Ecran.afficher("X ");
						pasvide = false;
					}
				} if (b1.Croiseurli==colonne) {
					if (b1.Croiseurc==k){
						Ecran.afficher("X ");
						pasvide = false;
					}
				} if (b1.Porteavli==colonne) {
					if (b1.Porteavc==k){
						Ecran.afficher("X ");
						pasvide = false;
					}
				} if(pasvide){
					Ecran.afficher("O ");
				}
				pasvide=true;
			}
			Ecran.afficher("\n");
		}
		
	}
	public static void main (String args[]) {
		BJoueur b1 = new BJoueur();
		Presentation();
		b1 = SaisirTJ();
		b1 = SaisirS1J(b1);
		b1 = SaisirS2J(b1);
		b1 = SaisirCJ(b1);
		b1 = SaisirPJ(b1);
		plateaux(b1);
	}
}