public class Bataillenavale {
	static class BJoueur1 {
		String Torpilleurl;
		int Torpilleurc;
		String Sousm1;
		String Sousm2;
		String Croiseur;
		String Porteav;
		String Orientation;
	}
	static class BJoueur2 {
		String Torpilleur;
		String Sousm1;
		String Sousm2;
		String Croiseur;
		String Porteav;
	}
	static BJoueur1 SaisirBJ1(){
		BJoueur1 b1 = new BJoueur1();
		Ecran.afficherln("Veuillez saisir la ligne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurl=Clavier.saisirString();
		Ecran.afficherln("Veuillez saisir la colonne de votre Torpilleur (il mesure deux cases)");
		b1.Torpilleurc=Clavier.saisirInt();
		Ecran.afficherln("Dans quel sens est-il orienter ?(orientation possible :\ngauche = d \ndroite = d\nhaut = h\nbas = b");
		b1.Orientation = Clavier.saisirString();
		return b1;
	}
	public static void main (String args[]) {
		BJoueur1 b1 = new BJoueur1();
		b1 = SaisirBJ1();
	}
}