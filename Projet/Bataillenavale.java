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
		String Orientation;
	}
	static BJoueur SaisirTJ(){
		BJoueur b1 = new BJoueur();
		Ecran.afficherln("Veuillez saisir la ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurl=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.Orientation = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS1J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1l=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro1 (il mesure trois cases)");
		b1.Sousm1c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.Orientation = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirS2J(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm1l=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Sous-marin numéro2 (il mesure trois cases)");
		b1.Sousm1c=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.Orientation = Clavier.saisirString();
		return b1;
	}
	static BJoueur SaisirCJ(BJoueur b1){
		Ecran.afficherln("Veuillez saisir la ligne de votre Croiseur (il mesure trois cases)");
		b1.Croiseurl=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Croiseur (il mesure trois cases)");
		b1.Croiseurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.Orientation = Clavier.saisirString();
		return b1;
	}
	public static void main (String args[]) {
		BJoueur b1 = new BJoueur();
		b1 = SaisirTJ();
		b1 = SaisirS1J(b1);
		b1 = SaisirS2J(b1);
		b1 = SaisirCJ(b1);
		
	}
}