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
	static Torpilleur SaisirTJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Torpilleur b1 = new Torpilleur();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur1 = Clavier.saisirInt();
		while ((b1.Torpilleur1<0)||(b1.Torpilleur1>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Torpilleur1 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Torpilleur (il mesure deux cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Torpilleur1 = (b1.Torpilleur1*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur2=Clavier.saisirInt();
		while ((b1.Torpilleur2<0)||(b1.Torpilleur2>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Torpilleur2= Clavier.saisirChar();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Torpilleur (il mesure deux cases)");
		colonne=Clavier.saisirChar();
		colonne2 = Transform(colonne);
		b1.Torpilleur2 = (b1.Torpilleur2*10)+colonne2;
		if ((b1.Torpilleur2!=b1.Torpilleur1+1)||(b1.Torpilleur2!=b1.Torpilleur1-1)||(b1.Torpilleur2!=b1.Torpilleur1+10)||(b1.Torpilleur2!=b1.Torpilleur1-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Torpilleur2=Clavier.saisirInt();
			while ((b1.Torpilleur2<0)||(b1.Torpilleur2>9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Torpilleur2= Clavier.saisirChar();
			}
			Ecran.afficherln("veuillez saisir de nouveau la colonne ");
			colonne=Clavier.saisirChar();
			colonne2 = Transform(colonne);
			b1.Torpilleur2 = (b1.Torpilleur2*10)+colonne2;
		}
		return b1;
	}
	static Sousmarin1 SaisirS1J(){
		char colonne;
		int colonne2;
		boolean verite;
		Sousmarin1 b1 = new Sousmarin1();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin11=Clavier.saisirInt();
		while ((b1.Sousmarin11<0)||(b1.Sousmarin11>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin11 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin11= (b1.Sousmarin11*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin12=Clavier.saisirInt();
		while ((b1.Sousmarin12<0)||(b1.Sousmarin12>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin12 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin12= (b1.Sousmarin12*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin13=Clavier.saisirInt();
		while ((b1.Sousmarin13<0)||(b1.Sousmarin13>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin13 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin13= (b1.Sousmarin13*10)+colonne2;
		return b1;
	}
	static Sousmarin2 SaisirS2J(){
		char colonne;
		int colonne2;
		boolean verite;
		Sousmarin2 b1 = new Sousmarin2();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin21=Clavier.saisirInt();
		while ((b1.Sousmarin21<0)||(b1.Sousmarin21>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin21 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin21= (b1.Sousmarin21*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin22=Clavier.saisirInt();
		while ((b1.Sousmarin22<0)||(b1.Sousmarin22>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin22 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin22= (b1.Sousmarin22*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin23=Clavier.saisirInt();
		while ((b1.Sousmarin23<0)||(b1.Sousmarin23>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin23 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin23= (b1.Sousmarin23*10)+colonne2;
		return b1;
	}
	static Croiseur SaisirCJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Croiseur b1 = new Croiseur();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur1=Clavier.saisirInt();
		while ((b1.Croiseur1<0)||(b1.Croiseur1>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Croiseur1 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Croiseur1=(b1.Croiseur1*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur2=Clavier.saisirInt();
		while ((b1.Croiseur2<0)||(b1.Croiseur2>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Croiseur2 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Croiseur2=(b1.Croiseur2*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur3=Clavier.saisirInt();
		while ((b1.Croiseur3<0)||(b1.Croiseur3>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Croiseur3 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Croiseur3=(b1.Croiseur3*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur4=Clavier.saisirInt();
		while ((b1.Croiseur4<0)||(b1.Croiseur4>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Croiseur4 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Croiseur4=(b1.Croiseur4*10)+colonne2;
		return b1;
	}
	static Porteavion SaisirPJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Porteavion b1 = new Porteavion();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion1=Clavier.saisirInt();
		while ((b1.Porteavion1<0)||(b1.Porteavion1>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion1 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Porteavion1=(b1.Porteavion1*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion2=Clavier.saisirInt();
		while ((b1.Porteavion2<0)||(b1.Porteavion2>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion2 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Porteavion2=(b1.Porteavion2*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion3=Clavier.saisirInt();
		while ((b1.Porteavion3<0)||(b1.Porteavion3>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion3 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Porteavion3=(b1.Porteavion3*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion4=Clavier.saisirInt();
		while ((b1.Porteavion4<0)||(b1.Porteavion4>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion4 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Porteavion4=(b1.Porteavion4*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la cinquieme ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion5=Clavier.saisirInt();
		while ((b1.Porteavion5<0)||(b1.Porteavion5>9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion5= Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la cinquieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Porteavion5=(b1.Porteavion5*10)+colonne2;
		
		return b1;
	}
	static int Transform(char C){
		int trans = 0;
		int C2;
		C2 = (int)C;
		switch (C2){
			case 65:
				trans = 0;
				break;
			case 66:
				trans = 1;
				break;
			case 67:
				trans = 2;
				break;
			case 68:
				trans = 3;
				break;
			case 69:
				trans = 4;
				break;
			case 70:
				trans = 5;
				break;
			case 71:
				trans = 6;
				break;
			case 72:
				trans = 7;
				break;
			case 73:
				trans = 8;
				break;
			case 74:
				trans = 9;
				break;
		}
		return trans;
	}
	
	static void plateaux(Torpilleur torp,Sousmarin1 sousm1,Sousmarin2 sousm2,Croiseur croiseur,Porteavion porteav){
		int colonne=0;
		boolean pasvide = true ;
		
		
		Ecran.afficher("   A ");
		Ecran.afficher("B ");
		Ecran.afficher("C ");
		Ecran.afficher("D ");
		Ecran.afficher(" E ");
		Ecran.afficher("F ");
		Ecran.afficher(" G ");
		Ecran.afficher("H ");
		Ecran.afficher(" I ");
		Ecran.afficher("J ");
		Ecran.afficherln("");
		for(int i = 0;i<100;i=i+10){
			switch (i) {
					case 0 :
						Ecran.afficher("0 ");
						break;
					case 10 :
						Ecran.afficher("1 ");
						break;
					case 20 :
						Ecran.afficher("2 ");
						break;
					case 30 :
						Ecran.afficher("3 ");
						break;
					case 40 :
						Ecran.afficher("4 ");
						break;
					case 50 :
						Ecran.afficher("5 ");
						break;
					case 60 :
						Ecran.afficher("6 ");
						break;
					case 70 :
						Ecran.afficher("7 ");
						break;
					case 80 :
						Ecran.afficher("8 ");
						break;
					case 90 :
						Ecran.afficher("9 ");
						break;
				}
			for(int k = 0;k<10;k++){
				if ((torp.Torpilleur1==i+k)||(torp.Torpilleur2==i+k)||(sousm1.Sousmarin11 ==i+k)||(sousm1.Sousmarin12 ==i+k)||(sousm1.Sousmarin13 ==i+k)||(sousm2.Sousmarin21 ==i+k)||(sousm2.Sousmarin22 ==i+k)||(sousm2.Sousmarin23 ==i+k)||(croiseur.Croiseur1==i+k)||(croiseur.Croiseur2==i+k)||(croiseur.Croiseur3==i+k)||(croiseur.Croiseur4==i+k)||(porteav.Porteavion1==i+k)||(porteav.Porteavion2==i+k)||(porteav.Porteavion3==i+k)||(porteav.Porteavion4==i+k)||(porteav.Porteavion5==i+k)){
					Ecran.afficher("X ");
				} else {
					Ecran.afficher("O ");
				}
			}
			Ecran.afficherln("");
		}
	}
	static boolean VerifT(Torpilleur b1) {
		boolean verif=false;
		while((b1.Torpilleur2==b1.Torpilleur1)||(b1.Torpilleur1>99)||(b1.Torpilleur1<0)||(b1.Torpilleur2>99)||(b1.Torpilleur2<0)){
			verif=true;
		}
		return verif;
	}
	static boolean VerifSm1(Sousmarin1 b1) {
		boolean verif=false;
		while((b1.Sousmarin11==b1.Sousmarin12)||(b1.Sousmarin11==b1.Sousmarin13)||(b1.Sousmarin11>99)||(b1.Sousmarin11<0)||(b1.Sousmarin12>99)||(b1.Sousmarin12<0)||(b1.Sousmarin13>99)||(b1.Sousmarin13<0)){
			verif=true;
		}
		return verif;
	}
	static boolean VerifSm2(Sousmarin2 b1) {
		boolean verif=false;
		while((b1.Sousmarin21==b1.Sousmarin22)||(b1.Sousmarin21==b1.Sousmarin23)||(b1.Sousmarin21>99)||(b1.Sousmarin21<0)||(b1.Sousmarin22>99)||(b1.Sousmarin22<0)||(b1.Sousmarin23>99)||(b1.Sousmarin23<0)){
			verif=true;
		}
		return verif;
	}
	static boolean VerifC(Croiseur b1) {
		boolean verif=false;
		while((b1.Croiseur1==b1.Croiseur2)||(b1.Croiseur1==b1.Croiseur2)||(b1.Croiseur2>99)||(b1.Croiseur2<0)||(b1.Croiseur3>99)||(b1.Croiseur3<0)||(b1.Croiseur4>99)||(b1.Croiseur4<0)||(b1.Croiseur1>99)||(b1.Croiseur1<0)){
			verif=true;
		}
		return verif;
	}
	static boolean VerifP(Porteavion b1) {
		boolean verif=false;
		while((b1.Porteavion1==b1.Porteavion2)||(b1.Porteavion1==b1.Porteavion2)||(b1.Porteavion2>99)||(b1.Porteavion2<0)||(b1.Porteavion3>99)||(b1.Porteavion3<0)||(b1.Porteavion4>99)||(b1.Porteavion4<0)||(b1.Porteavion1>99)||(b1.Porteavion1<0)){
			verif=true;
		}
		return verif;
	}
	/*static Torpilleur hasardT (){
		double hasard;
		int hasard2;
		Torpilleur torp = new Torpilleur();
		hasard=Math.random()*99;
		hasard2=(int)hasard;
		torp.Torpilleur1=hasard2;
		if (torp.Torpilleur1-10>10){
			if(torp.Torpilleur1<90){
				torp.Torpilleur2=torp.Torpilleur1 + 10;
			}else {
				torp.Torpilleur2=torp.Torpilleur1 - 10;
			}
		}
	}*/
	/*static Sousmarin1 hasardSm1 (){
		double hasard;
		int hasard2;
		Sousmarin1 sousm = new Sousmarin1();
		hasard=Math.random()*99;
		hasard2=(int)hasard;
		torp.Torpilleur1=hasard2;
		if(torp.Torpilleur1<90){
			sousm.Sousmarin12=sousm.Sousmarin11 + 1;
		}else {
			sousm.Sousmarin12=sousm.Sousmarin11 - 1;
		}
		
	}*/
	public static void main (String args[]) {
		Torpilleur torp = new Torpilleur();
		Sousmarin1 sousm1 = new Sousmarin1();
		Sousmarin2 sousm2 = new Sousmarin2();
		Croiseur croiseur = new Croiseur();
		Porteavion porteav = new Porteavion();
		Presentation();
		torp = SaisirTJ();
		plateaux(torp,sousm1,sousm2,croiseur,porteav);
		sousm1=SaisirS1J();
		plateaux(torp,sousm1,sousm2,croiseur,porteav);
		sousm2=SaisirS2J();
		plateaux(torp,sousm1,sousm2,croiseur,porteav);
		croiseur=SaisirCJ();
		plateaux(torp,sousm1,sousm2,croiseur,porteav);
		porteav=SaisirPJ();
		plateaux(torp,sousm1,sousm2,croiseur,porteav);
		
	}
}