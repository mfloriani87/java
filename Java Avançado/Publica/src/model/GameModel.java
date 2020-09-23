package model;

public class GameModel {

	// Atributos
	private int score, minSeason, maxSeason, minRecord, maxRecord;
	
	// Construtor
	public GameModel(int score, int minSeason, int maxSeason, int minRecord, int maxRecord) {
		this.score = score;
		this.minSeason = minSeason;
		this.maxSeason = maxSeason;
		this.minRecord = minRecord;
		this.maxRecord = maxRecord;
	}
	
	// Get e Set
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMinSeason() {
		return minSeason;
	}

	public void setMinSeason(int minSeason) {
		this.minSeason = minSeason;
	}

	public int getMaxSeason() {
		return maxSeason;
	}

	public void setMaxSeason(int maxSeason) {
		this.maxSeason = maxSeason;
	}

	public int getMinRecord() {
		return minRecord;
	}

	public void setMinRecord(int minRecord) {
		this.minRecord = minRecord;
	}

	public int getMaxRecord() {
		return maxRecord;
	}

	public void setMaxRecord(int maxRecord) {
		this.maxRecord = maxRecord;
	}
	
	
}
