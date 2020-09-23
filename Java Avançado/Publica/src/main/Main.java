package main;

import java.awt.EventQueue;

import view.Form;

public class Main {

	public static void main(String[] args) {
		
		// Call Form
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
}
