// Rondo Benjamin Groupe de TD I

public class Rondo {
	//classe Torpilleur qui prend en compte les cases du bateau
	static class Torpilleur {
		int Torpilleur1;
		int Torpilleur2;
	}
	//classe Sousmarin1 qui prend en compte les cases du bateau
	static class Sousmarin1 {
		int Sousmarin11;
		int Sousmarin12;
		int Sousmarin13;
	}
	//classe Sousmarin2 qui prend en compte les cases du bateau
	static class Sousmarin2 {
		int Sousmarin21;
		int Sousmarin22;
		int Sousmarin23;
	}
	//classe Croiseur qui prend en compte les cases du bateau
	static class Croiseur {
		int Croiseur1;
		int Croiseur2;
		int Croiseur3;
		int Croiseur4;
	}
	//classe Porteavion qui prend en compte les cases du bateau
	static class Porteavion {
		int Porteavion1;
		int Porteavion2;
		int Porteavion3;
		int Porteavion4;
		int Porteavion5;
	}
	//effet : présente l'affichage des règles
	//sortie : affichage
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
	//effet: fonction qui permet de saisir le bateau torpilleur
	// sortie : torpilleur
	static Torpilleur SaisirTJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Torpilleur b1 = new Torpilleur();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleur1 = Clavier.saisirInt();
		while ((b1.Torpilleur1<=0)||(b1.Torpilleur1>=9)){
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
		while ((b1.Torpilleur2<=0)||(b1.Torpilleur2>=9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Torpilleur2= Clavier.saisirChar();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Torpilleur (il mesure deux cases)");
		colonne=Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Torpilleur2 = (b1.Torpilleur2*10)+colonne2;
		if ((b1.Torpilleur2!=(b1.Torpilleur1)+1)||(b1.Torpilleur2==b1.Torpilleur1-1)||(b1.Torpilleur2==b1.Torpilleur1+10)||(b1.Torpilleur2==b1.Torpilleur1-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Torpilleur2=Clavier.saisirInt();
			while ((b1.Torpilleur2<=0)||(b1.Torpilleur2>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Torpilleur2= Clavier.saisirChar();
			}
			Ecran.afficherln("veuillez saisir de nouveau la colonne ");
			colonne=Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
			colonne2 = Transform(colonne);
			b1.Torpilleur2 = (b1.Torpilleur2*10)+colonne2;
		}
		return b1;
	}
	// effet : fonction qui permet de saisir le premier sousmarin
	//sortie : sousmarin1
	static Sousmarin1 SaisirS1J(){
		char colonne;
		int colonne2;
		boolean verite;
		Sousmarin1 b1 = new Sousmarin1();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousmarin11=Clavier.saisirInt();
		while ((b1.Sousmarin11<=0)||(b1.Sousmarin11>=9)){
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
		while ((b1.Sousmarin12<=0)||(b1.Sousmarin12>=9)){
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
		Ecran.afficher(b1.Sousmarin11,b1.Sousmarin12);
		if ((b1.Sousmarin12!=b1.Sousmarin11+1)||(b1.Sousmarin12!=b1.Sousmarin11-1)||(b1.Sousmarin12!=b1.Sousmarin11+10)||(b1.Sousmarin12!=b1.Sousmarin11-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Sousmarin12=Clavier.saisirInt();
			while ((b1.Sousmarin12<=0)||(b1.Sousmarin12>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Sousmarin12 = Clavier.saisirInt();
			}
			Ecran.afficherln("Veuillez de nouveau saisir la colonne");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin12= (b1.Sousmarin12*10)+colonne2;
		}
		
		if ((b1.Sousmarin12==b1.Sousmarin11+1)||(b1.Sousmarin12==b1.Sousmarin11-1)) {
			b1.Sousmarin13=b1.Sousmarin12-(b1.Sousmarin12%10);
			Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin13= (b1.Sousmarin12-b1.Sousmarin12%10)+colonne2;
		} else {
			Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
			b1.Sousmarin13=Clavier.saisirInt();
			while ((b1.Sousmarin13<=0)||(b1.Sousmarin13>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Sousmarin13 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin13= (b1.Sousmarin13*10)+colonne2;
		}
		return b1;
	}
	// effet : fonction qui permet de saisir le deuxieme sousmarin
	//sortie : sousmarin2
	static Sousmarin2 SaisirS2J(){
		char colonne;
		int colonne2;
		boolean verite;
		Sousmarin2 b1 = new Sousmarin2();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousmarin21=Clavier.saisirInt();
		while ((b1.Sousmarin21<=0)||(b1.Sousmarin21>=9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin21 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la premiere colonne de votre Sous-marin numéro2 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin21= (b1.Sousmarin21*10)+colonne2;
		Ecran.afficherln("Veuillez saisir la deuxieme ligne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousmarin22=Clavier.saisirInt();
		while ((b1.Sousmarin22<=0)||(b1.Sousmarin22>=9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Sousmarin22 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Sous-marin numéro2 (il mesure trois cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		colonne2 = Transform(colonne);
		b1.Sousmarin22= (b1.Sousmarin22*10)+colonne2;
		
		if ((b1.Sousmarin22!=b1.Sousmarin21+1)||(b1.Sousmarin22!=b1.Sousmarin21-1)||(b1.Sousmarin22!=b1.Sousmarin21+10)||(b1.Sousmarin22!=b1.Sousmarin21-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Sousmarin22=Clavier.saisirInt();
			while ((b1.Sousmarin22<=0)||(b1.Sousmarin22>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Sousmarin22 = Clavier.saisirInt();
			}
			Ecran.afficherln("Veuillez de nouveau saisir la colonne");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin22= (b1.Sousmarin22*10)+colonne2;
		}
		
		if ((b1.Sousmarin22==b1.Sousmarin21+1)||(b1.Sousmarin22==b1.Sousmarin21-1)) {
			b1.Sousmarin23=b1.Sousmarin22-(b1.Sousmarin22%10);
			Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Sous-marin numéro1 (il mesure trois cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin23= (b1.Sousmarin22-b1.Sousmarin22%10)+colonne2;
		} else {
			Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Sous-marin numéro1 (il mesure trois cases)");
			b1.Sousmarin23=Clavier.saisirInt();
			while ((b1.Sousmarin23<=0)||(b1.Sousmarin23>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Sousmarin23 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Sousmarin23= (b1.Sousmarin23*10)+colonne2;
		}
		return b1;
	}
	// effet : fonction qui permet de saisir le croiseur
	//sortie : croiseur
	static Croiseur SaisirCJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Croiseur b1 = new Croiseur();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Croiseur (il mesure quatre cases)");
		b1.Croiseur1=Clavier.saisirInt();
		while ((b1.Croiseur1<=0)||(b1.Croiseur1>=9)){
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
		while ((b1.Croiseur2<=0)||(b1.Croiseur2>=9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Croiseur2 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Croiseur (il mesure quatre cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		if ((b1.Croiseur2!=b1.Croiseur1+1)||(b1.Croiseur2!=b1.Croiseur1-1)||(b1.Croiseur2!=b1.Croiseur1+10)||(b1.Croiseur2!=b1.Croiseur1-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Croiseur2=Clavier.saisirInt();
			while ((b1.Croiseur2<=0)||(b1.Croiseur2>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Croiseur2 = Clavier.saisirInt();
			}
			Ecran.afficherln("Veuillez de nouveau saisir la colonne");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Croiseur2= (b1.Croiseur2*10)+colonne2;
		}
		if ((b1.Croiseur2==b1.Croiseur1+1)||(b1.Croiseur2==b1.Croiseur1-1)) {
			b1.Croiseur3=b1.Croiseur2-(b1.Croiseur2%10);
			Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion numéro1 (il mesure cinq cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Croiseur3= (b1.Croiseur2-b1.Croiseur2%10)+colonne2;
			b1.Croiseur4=b1.Croiseur2-(b1.Croiseur2%10);
			Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Porte avion numéro1 (il mesure cinq cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Croiseur4= (b1.Croiseur2-b1.Croiseur2%10)+colonne2;
		} else {
			Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Porte avion numéro1 (il mesure cinq cases)");
			b1.Croiseur3=Clavier.saisirInt();
			while ((b1.Croiseur3<=0)||(b1.Croiseur3>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Croiseur3 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Croiseur3= (b1.Croiseur3*10)+colonne2;
			Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Porte avion numéro1 (il mesure cinq cases)");
			b1.Croiseur4=Clavier.saisirInt();
			while ((b1.Croiseur4<=0)||(b1.Croiseur4>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Croiseur4 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Croiseur4= (b1.Croiseur3*10)+colonne2;
		}
		return b1;
	}
	// effet : fonction qui permet de saisir le porte avion
	//sortie : porte avion
	static Porteavion SaisirPJ(){
		char colonne;
		int colonne2;
		boolean verite;
		Porteavion b1 = new Porteavion();
		Ecran.afficherln("Veuillez saisir la premiere ligne de votre Porte avion (il mesure cinq cases)");
		b1.Porteavion1=Clavier.saisirInt();
		while ((b1.Porteavion1<=0)||(b1.Porteavion1>=9)){
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
		while ((b1.Porteavion2<=0)||(b1.Porteavion2>=9)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			b1.Porteavion1 = Clavier.saisirInt();
		}
		Ecran.afficherln("Veuillez saisir la deuxieme colonne de votre Porte avion (il mesure cinq cases)");
		colonne = Clavier.saisirChar();
		while(((int)colonne<65)||((int)colonne>74)){
			Ecran.afficher("Veuillez saisir une valeur correct");
			colonne = Clavier.saisirChar();
		}
		if ((b1.Porteavion2!=b1.Porteavion1+1)||(b1.Porteavion2!=b1.Porteavion1-1)||(b1.Porteavion2!=b1.Porteavion1+10)||(b1.Porteavion2!=b1.Porteavion1-10)){
			Ecran.afficherln("Erreur veuillez de nouveau saisir la ligne");
			b1.Porteavion2=Clavier.saisirInt();
			while ((b1.Porteavion2<=0)||(b1.Porteavion2>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Porteavion2 = Clavier.saisirInt();
			}
			Ecran.afficherln("Veuillez de nouveau saisir la colonne");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion2= (b1.Porteavion2*10)+colonne2;
		}
		if ((b1.Porteavion2==b1.Porteavion1+1)||(b1.Porteavion2==b1.Porteavion1-1)) {
			b1.Porteavion3=b1.Porteavion2-(b1.Porteavion2%10);
			Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion (il mesure cinq cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion3= (b1.Porteavion2-b1.Porteavion2%10)+colonne2;
			b1.Porteavion4=b1.Porteavion2-(b1.Porteavion2%10);
			Ecran.afficherln("Veuillez saisir la quatrieme colonne de votre Porte avion (il mesure cinq cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion4= (b1.Porteavion2-b1.Porteavion2%10)+colonne2;
			b1.Porteavion5=b1.Porteavion2-(b1.Porteavion2%10);
			Ecran.afficherln("Veuillez saisir la troisieme colonne de votre Porte avion (il mesure cinq cases)");
			colonne = Clavier.saisirChar();
			while(((int)colonne<65)||((int)colonne>74)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				colonne = Clavier.saisirChar();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion5= (b1.Porteavion2-b1.Porteavion2%10)+colonne2;
		} else {
			Ecran.afficherln("Veuillez saisir la troisieme ligne de votre Porte avion (il mesure cinq cases)");
			b1.Porteavion3=Clavier.saisirInt();
			while ((b1.Porteavion3<=0)||(b1.Porteavion3>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Porteavion3 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion3= (b1.Porteavion3*10)+colonne2;
			Ecran.afficherln("Veuillez saisir la quatrieme ligne de votre Porte avion (il mesure trois cases)");
			b1.Porteavion4=Clavier.saisirInt();
			while ((b1.Porteavion4<=0)||(b1.Porteavion4>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Porteavion4 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion4= (b1.Porteavion3*10)+colonne2;
			Ecran.afficherln("Veuillez saisir la cinquieme ligne de votre Porte avion (il mesure trois cases)");
			b1.Porteavion5=Clavier.saisirInt();
			while ((b1.Porteavion5<=0)||(b1.Porteavion5>=9)){
				Ecran.afficher("Veuillez saisir une valeur correct");
				b1.Porteavion5 = Clavier.saisirInt();
			}
			colonne2 = Transform(colonne);
			b1.Porteavion5= (b1.Porteavion4*10)+colonne2;
		}
		return b1;
	}
	//effet : fonction qui permet de transformer la caractere de la case en entier
	//entrée : caractere C
	//sortie : entier trans
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
	//effet : fonction qui permet l'affichage du plateaux de jeu
	//sortie : affichage
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
	//effet : fonction qui permet la saisie du torpilleur par le robot
	//sortie torpilleur
	static Torpilleur hasardT (){
		double hasard;
		int hasard2;
		Torpilleur bot = new Torpilleur();
		hasard=Math.random()*99;
		hasard2=(int)hasard;
		bot.Torpilleur1=hasard2;
		if (bot.Torpilleur1-10>10){
			if(bot.Torpilleur1<90){
				bot.Torpilleur2=bot.Torpilleur1 + 10;
			}else {
				bot.Torpilleur2=bot.Torpilleur1 - 10;
			}
		}
		return bot;
	}
	//effet : fonction qui permet la saisie du premeir sousmarin par le robot
	//sortie sousmarin1
	static Sousmarin1 hasardSm1 (){
		double hasard,hasard3;
		int hasard2,hasard4;
		Sousmarin1 bot = new Sousmarin1();
		hasard=Math.random()*10;
		hasard3=Math.random()*10;
		hasard2=(int)hasard;
		hasard4=(int)hasard3;
		bot.Sousmarin11=hasard2*10+hasard4;
		if(hasard4<6){
			bot.Sousmarin12=bot.Sousmarin11 + 1;
			bot.Sousmarin13=bot.Sousmarin12 + 1;
		}else {
			bot.Sousmarin12=bot.Sousmarin11 - 1;
			bot.Sousmarin13=bot.Sousmarin12 - 1;
		}
		return bot;
	}
	//effet : fonction qui permet la saisie du deuxieme sousmarin par le robot
	//sortie sousmarin2
	static Sousmarin2 hasardSm2 (Sousmarin1 bot1){
		double hasard,hasard3;
		int hasard2,hasard4;
		Sousmarin2 bot = new Sousmarin2();
		hasard=Math.random()*10;
		hasard3=Math.random()*10;
		hasard2=(int)hasard;
		hasard4=(int)hasard3;
		while (((hasard2*10+hasard4)==bot1.Sousmarin11)||((hasard2*10+hasard4)==bot1.Sousmarin12)){
			hasard=Math.random()*10;
			hasard3=Math.random()*10;
			hasard2=(int)hasard;
			hasard4=(int)hasard3;
		}
		bot.Sousmarin21=hasard2*10+hasard4;
		if(hasard2<6){
			bot.Sousmarin22=bot.Sousmarin21 + 10;
			bot.Sousmarin23=bot.Sousmarin22 + 10;
		}else {
			bot.Sousmarin22=bot.Sousmarin21 - 10;
			bot.Sousmarin23=bot.Sousmarin22 - 10;
		}
		return bot;
	}
	//effet : fonction qui permet la saisie du croiseur par le robot
	//sortie croiseur
	static Croiseur hasardC (Sousmarin1 bot1,Sousmarin2 bot2){
		double hasard,hasard3;
		int hasard2,hasard4;
		Croiseur bot = new Croiseur();
		hasard=Math.random()*10;
		hasard3=Math.random()*10;
		hasard2=(int)hasard;
		hasard4=(int)hasard3;
		while (((hasard2*10+hasard4)==bot1.Sousmarin11)||((hasard2*10+hasard4)==bot1.Sousmarin12)||((hasard2*10+hasard4)==bot2.Sousmarin21)||((hasard2*10+hasard4)==bot2.Sousmarin22)){
			hasard=Math.random()*10;
			hasard3=Math.random()*10;
			hasard2=(int)hasard;
			hasard4=(int)hasard3;
		}
		bot.Croiseur1=hasard2*10+hasard4;
		if(hasard4<6){
			bot.Croiseur2=bot.Croiseur1 + 1;
			bot.Croiseur3=bot.Croiseur2 + 1;
			bot.Croiseur4=bot.Croiseur3 + 1;
			
		}else {
			bot.Croiseur2=bot.Croiseur1 - 1;
			bot.Croiseur3=bot.Croiseur2 - 1;
			bot.Croiseur4=bot.Croiseur3 - 1;
		}
		return bot;
	}
	//effet : fonction qui permet la saisie du porte avion par le robot
	//sortie porteavion
	static Porteavion hasardP (Sousmarin1 bot1,Sousmarin2 bot2,Croiseur bot3){
		double hasard,hasard3;
		int hasard2,hasard4;
		Porteavion bot = new Porteavion();
		hasard=Math.random()*10;
		hasard3=Math.random()*10;
		hasard2=(int)hasard;
		hasard4=(int)hasard3;
		while (((hasard2*10+hasard4)==bot1.Sousmarin11)||((hasard2*10+hasard4)==bot1.Sousmarin12)||((hasard2*10+hasard4)==bot2.Sousmarin21)||((hasard2*10+hasard4)==bot2.Sousmarin22)||((hasard2*10+hasard4)==bot3.Croiseur1)||((hasard2*10+hasard4)==bot3.Croiseur2)){
			hasard=Math.random()*10;
			hasard3=Math.random()*10;
			hasard2=(int)hasard;
			hasard4=(int)hasard3;
		}
		bot.Porteavion1=hasard2*10+hasard4;
		if(hasard2<5){
			bot.Porteavion2=bot.Porteavion1 + 10;
			bot.Porteavion3=bot.Porteavion2 + 10;
			bot.Porteavion4=bot.Porteavion3 + 10;
			bot.Porteavion5=bot.Porteavion4 + 10;
		}else {
			bot.Porteavion2=bot.Porteavion1 - 10;
			bot.Porteavion3=bot.Porteavion2 - 10;
			bot.Porteavion4=bot.Porteavion3 - 10;
			bot.Porteavion5=bot.Porteavion4 - 10;
		}
		return bot;
	}
	//effet : fonction qui permet de trouver si un bateau a été toucher
	//entrée bcase torpilleur sousmarin1 sousmarin2 croiseur et porteavion
	//sortie counter
	static int EstToucher(int bcase, Torpilleur torp,Sousmarin1 sousm1,Sousmarin2 sousm2, Croiseur croiseur,Porteavion porteav){
		int counter=0;
		if (bcase==torp.Torpilleur1){
			Ecran.afficher("toucher");
			counter++;
			torp.Torpilleur1=-5;
		}if (bcase==torp.Torpilleur2){
			Ecran.afficher("toucher");
			torp.Torpilleur2=-5;
			counter++;
		}if (bcase==sousm1.Sousmarin11){
			Ecran.afficher("toucher");
			sousm1.Sousmarin11=-5;
			counter++;
		} if (bcase==sousm1.Sousmarin12){
			Ecran.afficher("toucher");
			sousm1.Sousmarin12=-5;
			counter++;
		} if (bcase==sousm1.Sousmarin13){
			Ecran.afficher("toucher");
			sousm1.Sousmarin13=-5;
			counter++;
		} if (bcase==sousm2.Sousmarin21){
			Ecran.afficher("toucher");
			sousm2.Sousmarin21=-5;
			counter++;
		} if (bcase==sousm2.Sousmarin22){
			Ecran.afficher("toucher");
			sousm2.Sousmarin22=-5;
			counter++;
		} if (bcase==sousm2.Sousmarin23){
			Ecran.afficher("toucher");
			sousm2.Sousmarin23=-5;
			counter++;
		} if (bcase==croiseur.Croiseur1){
			Ecran.afficher("toucher");
			croiseur.Croiseur1=-5;
			counter++;
		} if (bcase==croiseur.Croiseur2){
			Ecran.afficher("toucher");
			croiseur.Croiseur2=-5;
			counter++;
		} if (bcase==croiseur.Croiseur3){
			Ecran.afficher("toucher");
			croiseur.Croiseur3=-5;
			counter++;
		} if (bcase==croiseur.Croiseur4){
			Ecran.afficher("toucher");
			croiseur.Croiseur4=-5;
			counter++;
		} if (bcase==porteav.Porteavion1){
			Ecran.afficher("toucher");
			porteav.Porteavion1=-5;
			counter++;
		} if (bcase==porteav.Porteavion2){
			Ecran.afficher("toucher");
			porteav.Porteavion2=-5;
			counter++;
		} if (bcase==porteav.Porteavion3){
			Ecran.afficher("toucher");
			porteav.Porteavion3=-5;
			counter++;
		} if (bcase==porteav.Porteavion4){
			Ecran.afficher("toucher");
			porteav.Porteavion4=-5;
			counter++;
		} if (bcase==porteav.Porteavion5){
			Ecran.afficher("toucher");
			porteav.Porteavion5=-5;
			counter++;
		}
		return counter;
	}
	//effet : fonction principal qui permet le fonctionnement du jeu en demandant le nombre de manche, le choix du jeu et enfin le jeu en lui meme
	public static void main (String args[]) {
		int bcase;
		double bcased;
		int counter1=0;
		int counter2=0;
		int manche;
		int choix;
		Ecran.afficherln("Combien de manche voulez-vous jouer ?");
		manche=Clavier.saisirInt();
		Ecran.afficherln("Si vous voulez jouer contre un robot choissisez 1 ou choissisez 2 si vous voulez jouer a 2 joueurs");
		choix=Clavier.saisirInt();
		while (manche!=0){
			counter1=0;
			counter2=0;
			Torpilleur torp = new Torpilleur();
			Sousmarin1 sousm1 = new Sousmarin1();
			Sousmarin2 sousm2 = new Sousmarin2();
			Croiseur croiseur = new Croiseur();
			Porteavion porteav = new Porteavion();
			Torpilleur torpbot = new Torpilleur();
			Sousmarin1 sousm1bot = new Sousmarin1();
			Sousmarin2 sousm2bot = new Sousmarin2();
			Croiseur croiseurbot = new Croiseur();
			Porteavion porteavbot = new Porteavion();
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
			torpbot = hasardT();
			sousm1bot=hasardSm1();
			sousm2bot=hasardSm2(sousm1bot);
			croiseurbot = hasardC(sousm1bot,sousm2bot);
			porteavbot = hasardP(sousm1bot,sousm2bot,croiseurbot);
			plateaux(torpbot,sousm1bot,sousm2bot,croiseurbot,porteavbot);
			if (choix==1) {
				while((counter1!=17)||(counter2!=17)){
					Ecran.afficherln("Joueur a vous de jouer veuillez saisir une case entre 0 et 99");
					bcase=Clavier.saisirInt();
					while((bcase<0)&&(bcase>99)){
						Ecran.afficherln("Veuillez saisir une case valide");
						bcase=Clavier.saisirInt();
					}
					counter1=EstToucher(bcase,torpbot,sousm1bot,sousm2bot,croiseurbot,porteavbot);
					plateaux(torpbot,sousm1bot,sousm2bot,croiseurbot,porteavbot);
					Ecran.afficherln("A l'ordinateur de jouer");
					bcased=Math.random()*99;
					bcase=(int)bcased;
					counter2=EstToucher(bcase,torp,sousm1,sousm2,croiseur,porteav);
					plateaux(torp,sousm1,sousm2,croiseur,porteav);
					if (counter1==17){
						Ecran.afficherln("Bravo vous avez gagner");
						manche++;
					}
					if (counter2==17){
						Ecran.afficherln("Dommage l'ordinateur a gagné");
						manche++;
					}
				}
			} else {
				Ecran.afficher("Joueur 2 veuillez saisir vos bateaux");
				Torpilleur torpJ2 = new Torpilleur();
				Sousmarin1 sousm1J2 = new Sousmarin1();
				Sousmarin2 sousm2J2 = new Sousmarin2();
				Croiseur croiseurJ2 = new Croiseur();
				Porteavion porteavJ2 = new Porteavion();
				torpJ2 = SaisirTJ();
				plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
				sousm1J2=SaisirS1J();
				plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
				sousm2J2=SaisirS2J();
				plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
				croiseurJ2=SaisirCJ();
				plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
				porteavJ2=SaisirPJ();
				plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
				while((counter1!=17)||(counter2!=17)){
					Ecran.afficherln("Joueur1 a vous de jouer veuillez saisir une case entre 0 et 99");
					bcase=Clavier.saisirInt();
					while((bcase<0)&&(bcase>99)){
						Ecran.afficherln("Veuillez saisir une case valide");
						bcase=Clavier.saisirInt();
					}
					counter1=EstToucher(bcase,torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
					plateaux(torpJ2,sousm1J2,sousm2J2,croiseurJ2,porteavJ2);
					Ecran.afficherln("Joueur2 a vous de jouer veuillez saisir une case entre 0 et 99");
					bcase=Clavier.saisirInt();
					while((bcase<0)&&(bcase>99)){
						Ecran.afficherln("Veuillez saisir une case valide");
						bcase=Clavier.saisirInt();
					}
					counter2=EstToucher(bcase,torp,sousm1,sousm2,croiseur,porteav);
					plateaux(torp,sousm1,sousm2,croiseur,porteav);
					if (counter1==17){
						Ecran.afficherln("Bravo vous avez gagner");
						manche++;
					}
					if (counter2==17){
						Ecran.afficherln("Dommage l'ordinateur a gagné");
						manche++;
					}
				}
			}
		}
	}
}