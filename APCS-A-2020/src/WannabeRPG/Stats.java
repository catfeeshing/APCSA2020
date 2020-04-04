package WannabeRPG;

public class Stats{
	
	private String cardRating;
	private int atk;
	private int def;
	private double rate;
	
	public Stats() {
		setRating("R");
		setATK(100);
		setDEF(100);
		setRate(20.0);
	}
	
	public Stats(String rarity, int attack, int defence, double dropRate) {
		setRating(rarity);
		setATK(attack);
		setDEF(defence);
		setRate(dropRate);
	}
	
	
	//card rarity
	public String getRating(){
		return cardRating;
	}
	
	public void setRating(String rating){
		this.cardRating = rating;
	}
	
	//atk
	public int getATK() {
		return atk;
	}
	
	public void setATK(int attack) {
		this.atk = attack;
	}
	
	//def
	public int getDEF() {
		return def;
	}
	
	public void setDEF(int defence) {
		this.def = defence;
	}
	
	//drop rate
	public double getRate() {
		return rate;
	}
	
	public void setRate(double dropRate) {
		this.rate = dropRate;
	}
	
}