public class Bataillenavale {
	static class BJoueur {
		String Torpilleurl;
		int Torpilleurc;
		String Sousm1l;
		int Sousm1c;
		String Sousm2l;
		int Sousm2c;
		String Croiseurl;
		int Croiseurc;
		String Porteavl;
		int Porteavc;
		String OrientationT;
		String OrientationS1;
		String OrientationS2;
		String OrientationC;
		String OrientationP;
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
		Ecran.afficherln("Veuillez saisir la colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationT = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS1J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1l=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationS1 = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS2J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm1l=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm1c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationS2 = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirCJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseurl=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationC = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirPJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavl=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.OrientationP = Clavier.saisirString();
		return b1;
	}
	static void plateaux(BJoueur b1){
		String colonne="";
		for(int i=0;i<10;i++){
			switch(i){
				case 0:{
					colonne="A";
					break;
				}
				case 1:{
					colonne="B";
					break;
				}
				case 2:{
					colonne="C";
					break;
				}
				case 3:{
					colonne="D";
					break;
				}
				case 4:{
					colonne="E";
					break;
				}
				case 5:{
					colonne="F";
					break;
				}
				case 6:{
					colonne="G";
					break;
				}
				case 7:{
					colonne="H";
					break;
				}
				case 8:{
					colonne="I";
					break;
				}
				case 9:{
					colonne="J";
					break;
				}
			}
			
			for(int k=0;k<10;k++){
				Ecran.afficher("   tl :", b1.Torpilleurl, " c :  " ,colonne, " tc :  ",b1.Torpilleurc, " k :  ",k);
				
				Ecran.afficherln("b1.Torpilleurl==colonne", b1.Torpilleurl==colonne);
				Ecran.afficherln("b1.Torpilleurc==k",b1.Torpilleurc==k);
				if (b1.Torpilleurl==colonne) {
						Ecran.afficherln("ICIIIIIII ");
					
					if (b1.Torpilleurc==k) {
						Ecran.afficher("X ");
					}
				} if (b1.Sousm1l==colonne) {
					if (b1.Sousm1c==k){
						Ecran.afficher("X ");
					}
				} if (b1.Sousm2l==colonne) {
					if (b1.Sousm2c==k){
						Ecran.afficher("X ");
					}
				} if (b1.Croiseurl==colonne) {
					if (b1.Croiseurc==k){
						Ecran.afficher("X ");
					}
				} if (b1.Porteavl==colonne) {
					if (b1.Porteavc==k){
						Ecran.afficher("X ");
					}
				} else {
					Ecran.afficher("O ");
				}
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