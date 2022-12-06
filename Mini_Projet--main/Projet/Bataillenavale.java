public class Bataillenavale {
	static class BJoueur {
		Torpilleur Torpilleur;
		Sousmarin1 Sousm1;
		Sousmarin2 Sousm2;
		Croiseur Croiseur;
		Porteavion Porteav;
	}
	static class Torpilleur {
		int Torpilleur1;
		int Torpilleur2;

	}
	static class Sousmarin1 {
		int Sousmarin11;
		int Sousmarin12;
		int Sousmarin13;

	}
	static class Sousmarin2 {
		int Sousmarin21;
		int Sousmarin22;
		int Sousmarin23;
	}
	static class Croiseur {
		int Croiseur1;
		int Croiseur2;
		int Croiseur3;
		int Croiseur4;

	}
	static class Porteavion {
		int Porteavion1;
		int Porteavion2;
		int Porteavion3;
		int Porteavion4;
		int Porteavion5;

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
		String colonne;
		int colonne2;
		BJoueur b1 = new BJoueur();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleur1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Torpilleur (il mesure deux cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		b1.Torpilleur.Torpilleur1 = b1.Torpilleur.Torpilleur1*10+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleur2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Torpilleur (il mesure deux cases)");
		colonne=Clavier.saisirString();
		colonne2 = Transform(colonne);
		b1.Torpilleur.Torpilleur2 = b1.Torpilleur.Torpilleur2*10+colonne2;
		return b1;
	}
	static BJoueur SaisirS1J(BJoueur b1){
		String colonne;
		int colonne2;
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin11=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin12=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin13=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		return b1;
	}
	static BJoueur SaisirS2J(BJoueur b1){
		String colonne;
		int colonne2;
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin21=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin22=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin23=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		return b1;
	}
	static BJoueur SaisirCJ(BJoueur b1){
		String colonne;
		int colonne2;
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseur1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseur2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseur3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseur4=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		return b1;
	}
	static BJoueur SaisirPJ(BJoueur b1){
		String colonne;
		int colonne2;
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteav.Porteavion1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteav.Porteavion2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteav.Porteavion3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteav.Porteavion4=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		Ecran.afficherln("Veuillez saisir la cinquieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteav.Porteavion5=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la cinquieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirString();
		colonne2 = Transform(colonne);
		return b1;
	}
	static int Transform(String C){
		int trans = 0;
		switch (C){
			case "A":
				trans = 0;
				break;
			case "B":
				trans = 1;
				break;
			case "C":
				trans = 2;
				break;
			case "D":
				trans = 3;
				break;
			case "E":
				trans = 4;
				break;
			case "F":
				trans = 5;
				break;
			case "G":
				trans = 6;
				break;
			case "H":
				trans = 7;
				break;
			case "I":
				trans = 8;
				break;
			case "J":
				trans = 9;
				break;
		}
		return trans;
	}
	
	static void plateaux(BJoueur b1){
		int colonne=0;
		boolean pasvide = true ;
		/*for(int i=0;i<10;i++){
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
		}*/
		
	}
	public static void main (String args[]) {
		BJoueur b1 = new BJoueur();
		Presentation();
		b1=SaisirTJ();
		b1=SaisirS1J(b1);
		b1=SaisirS2J(b1);
		b1=SaisirCJ(b1);
		b1=SaisirPJ(b1);
		plateaux(b1);
	}
}