package entites;

import javax.swing.ImageIcon;

import ressources.Constantes;

public class Alien extends Entite {
    public Alien(int xPos, int yPos, String strImg1, String strImg2) {
        super.xPos = xPos;
		super.yPos = yPos;
		super.largeur = Constantes.LARGEUR_ALIEN;
		super.hauteur = Constantes.HAUTEUR_ALIEN;
		super.vivant = true;
		// Adresse des images de l'alien
		super.strImg1 = strImg1;
		super.strImg2 = strImg2;
		super.strImg3 = "/images/alienMeurt.png";
		// Chargement de l'image de l'alien
		super.ico = new ImageIcon(getClass().getResource(super.strImg1));
		super.img = this.ico.getImage();
    }

    public void choixImage(boolean pos1) {
        // M�thode qui charge l'image de l'alien selon son �tat et sa position (1 ou 2)
        if(this.vivant == true) {
            if(pos1 == true) {super.ico = new ImageIcon(getClass().getResource(strImg1));} 
             else {super.ico = new ImageIcon(getClass().getResource(strImg2));}
           }
           super.img = this.ico.getImage(); // recharge l'image
       }
   
   }

   
	