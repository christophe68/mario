package com.chris.jeu;

public class Chrono implements Runnable{
	
	private final int PAUSE = 3; // Temps d'attente entre deux tours de boucle, ici 3 milisecondes

	@Override
	public void run() {
		
		while(true) {
			
			Main.scene.repaint();
			
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
