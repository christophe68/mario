package com.chris.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	private ImageIcon icoFond; // Stockage de l'image de fond
	private Image imgFond1;
	private Image imgFond2;
	
	private ImageIcon icoMario; // Stockage de l'image de Mario code provisoire
	private Image imgMario; //code provisoire
	
	private int xFond1; // Abcisse coin superieur gauche de notre fenetre
	private int xFond2;
	private int dx; // Deplace l'ecran horizontalement
	
	//**** CONSTRUCTEUR ****//
	
	public Scene() {
		
		super();
		
		this.xFond1 = -50; // Initialisation du fond qui va déborder de chaque cote de l'ecran
		this.xFond2 = 750; // Image fait 800 de large donc 800-50=750
		this.dx = 0; // Initialisation du deplacement horizontal
		
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage(); // Associe notre icoFond a notre imageIcon
		this.imgFond2 = this.icoFond.getImage(); // Associe notre icoFond a notre imageIcon
		icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		this.imgMario = this.icoMario.getImage(); // Associe notre icoMario à notre imageIcon 
		
		this.setFocusable(true); // Ecoute l'ecran
		this.requestFocusInWindow(); // Recupere le focus
		this.addKeyListener(new Clavier()); // Permets d'ecouter la class clavier par rapport a la class scene
		
		Thread chronoEcran = new Thread(new Chrono()); // construit le fond avec la boucle
		chronoEcran.start(); // Demarrage de la boucle
		
	}
	
	//**** GETTERS ****//
	
	public int getDx() {return dx;} // Accede a la valeur de dx
	
	
	
	//**** SETTERS ****//
	
	public void setDx(int dx) {this.dx = dx;} // Modifie la valeur de dx
	
	
	
	//**** METHODES ****//
	
	public void deplacementFond(){
		
		
		
		this.xFond1 = this.xFond1 - this.dx; // Mets à jour la position du fond	
		this.xFond2 = this.xFond2 - this.dx; // Deplace fond2 en meme temps que fond1
	}
	

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); // Methode heritee 
		Graphics g2 = (Graphics2D)g; // Meilleur rendu cote graphique
		
		this.deplacementFond(); // Recalcule la position du fond
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de fond, -50 en X, 0 en Y, 
		g2.drawImage(this.imgFond2, this.xFond2, 0, null); // Dessin de l'image de fond2, 750 en X, 0 en Y, 

		g2.drawImage(imgMario, 400, 245, null); // Dessin de mario qui sera placé en dessous en premier, 300 c'est le milieu de l'ecran, 245 c'est la hauteur de mario
	}

}
