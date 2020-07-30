package com.chris.jeu;

import javax.swing.JFrame;

public class Main {
	
	public static Scene scene;

	public static void main(String[] args) {

		//Création de la fenetre de l'application
		JFrame fenetre = new JFrame("Jeu Mario"); // Nouvelle fenetre avec un titre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme le programme avec la croix rouge
		fenetre.setSize(700, 360); // Taille Horizontale de 700 et 360 de Hauteur
		fenetre.setLocationRelativeTo(null); // Centrer à l'ecran
		fenetre.setResizable(false); // Interdiction de redimensionnement
		fenetre.setAlwaysOnTop(true); // Priorise la fenetre au premier plan
		
		// Instanciation de l'objet scene
		scene = new Scene();
		
		fenetre.setContentPane(scene); // On associe la scene à la fenetre de l'application
		fenetre.setVisible(true); // Rendre visible la fenetre
	}

}