package jeu;

import javax.swing.JFrame;

import ressources.Constantes;

public class Main {
	
/**** VARIABLES ****/
	
	public static Scene scene;
	public static boolean jeu = true;
	
	
/**** METHODES ****/
	public static void main(String[] args) {
		// Creation de la fenetre de l'application
		JFrame fenetre = new JFrame("Jeu style Space Invaders");
		fenetre.setSize(Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setAlwaysOnTop(true);	

		// Association du panneau Scene a la fenetre
		scene = new Scene();		
		fenetre.setContentPane(scene);
		
		fenetre.setVisible(true);
	}

}
