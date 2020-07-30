package com.chris.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750); // Si on est completement collé a gauche on execute de nouveau le fond
			}
			Main.scene.setDx(1); // Mario se deplace a droite
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.setDx(-1); // Mario se deplace à gauche
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.setDx(0); // Quand je relache la touche Dx reviens a 0
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
