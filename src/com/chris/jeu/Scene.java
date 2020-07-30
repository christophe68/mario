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
	
	private ImageIcon icoMario; // Stockage de l'image de Mario code provisoire
	private Image imgMario; //code provisoire
	
	private int xFond1; // Abcisse coin superieur gauche de notre fenetre
	
	//**** CONSTRUCTEUR ****//
	public Scene() {
		
		super();
		
		this.xFond1 = -50; // Initialisation du fond qui va déborder de chaque cote de l'ecran
		
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage(); // Associe notre icoFond a notre imageIcon
		icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		this.imgMario = this.icoMario.getImage(); // Associe notre icoMario à notre imageIcon 
		
	}
	
	
	//**** METHODES ****//
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); // Methode heritee 
		Graphics g2 = (Graphics2D)g; // Meilleur rendu cote graphique
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de fond, -50 en X, 0 en Y, 
		g2.drawImage(imgMario, 400, 245, null); // Dessin de mario qui sera placé en dessous en premier, 300 c'est le milieu de l'ecran, 245 c'est la hauteur de mario
	}

}
