package controller;

import javax.swing.table.DefaultTableModel;

import data.DataGame;
import model.GameModel;

public class GameController {

	// Add new game
	public static void addGame(GameModel obj) {
		
		// Add data to ArrayList
		DataGame.gameList.add(obj);
		
	}
	
	// List all games
	public static DefaultTableModel listGames() {
		
		// Object DefaultTableModel
		DefaultTableModel list = new DefaultTableModel();
		
		// Columns
		list.addColumn("Jogo");
		list.addColumn("Placar");
		list.addColumn("Mínimo de temporada");
		list.addColumn("Máximo de temporada");
		list.addColumn("Quebra de recorde mínimo");
		list.addColumn("Quebra de recorde máximo");
		
		// Game id
		int gameId = 0;
		
		// Loop
		for(int i=0; i<DataGame.gameList.size(); i++) {
			list.addRow(new Object[] {
				gameId++,
				DataGame.gameList.get(i).getScore(),
				DataGame.gameList.get(i).getMinSeason(),
				DataGame.gameList.get(i).getMaxSeason(),
				DataGame.gameList.get(i).getMinRecord(),
				DataGame.gameList.get(i).getMaxRecord(),
			});
		}
		
		// Return
		return list;
		
	}
	
}







