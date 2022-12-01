public class Bataillenavale {
	static class BJoueur {
		Torpilleur Torpilleur;
		Sousmarin1 Sousm1;
		Sousmarin2 Sousm2;
		Croiseur Croiseur;
		Porteavion Porteav;
	}
	static class Torpilleur {
		int Torpilleurl1;
		int Torpilleurl2;
		String Torpilleurc1;
		String Torpilleurc1;
	}
	static class Sousmarin1 {
		int Sousmarin1l1;
		int Sousmarin1l2;
		int Sousmarin1l3;
		String Sousmarin1c1;
		String Sousmarin1c2;
		String Sousmarin1c3;
	}
	static class Sousmarin2 {
		int Sousmarin2l1;
		int Sousmarin2l2;
		int Sousmarin2l3;
		String Sousmarin2c1;
		String Sousmarin2c2;
		String Sousmarin2c3;
	}
	static class Croiseur {
		int Croiseurl1;
		int Croiseurl2;
		int Croiseurl3;
		int Croiseurl4;
		String Croiseur2c1;
		String Croiseur2c2;
		String Croiseur2c3;
		String Croiseur2c4;
	}
	static class Porteavion {
		int Porteavionl1;
		int Porteavionl2;
		int Porteavionl3;
		int Porteavionl4;
		int Porteavionl5;
		String Porteavionc1;
		String Porteavionc2;
		String Porteavionc3;
		String Porteavionc4;
		String Porteavionc5;
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
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleurl1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleurc1=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleurl2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur.Torpilleurc2=Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS1J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1l1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1c1=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1l2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1c2=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1l3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1.Sousmarin1c3=Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS2J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2l1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2c1=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2l2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2c2=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2l3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm2.Sousmarin2c3=Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirCJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurl1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurc1=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurl2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurc2=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurl3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurc3=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurl4=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur.Croiseurc4=Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirPJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionl1=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionc1=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionl2=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionc2=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionl3=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionc3=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionl4=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionc4=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la cinquieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionl5=Clavier.saisirInt();
		Ecran.afficherln("Veuillez saisir la cinquieme colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion.Porteavionc5=Clavier.saisirString();
		return b1;
	}
	static BJoueur transfrom(BJoueur b1){
		int valeur;
	}
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