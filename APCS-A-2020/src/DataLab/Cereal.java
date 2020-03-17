package DataLab;

public class Cereal {
	private String name;
	private char type;
	private int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
	private double fiber, carbohydrates, weight, cups, rating;
	
	// constructors
	
	public Cereal(String cerealName, char cerealType) {
		this.name = cerealName;
		this.type = cerealType;
		calories = 100;
		protein = 2;
		fat = 2;
		sodium = 100;
		sugar = 10;
		potassium = 10;
		vitamins = 20;
		shelf = 1;
		fiber = 1;
		carbohydrates = 10;
		weight = 1;
		cups = 1;
		rating = 100;
	}
	
	public Cereal(String cerealName, char cerealType, int cerealCals, int cerealProtein, int cerealFat, int cerealNa, double cerealFiber, double cerealCarbs, int cerealSugar, int cerealK, int cerealVitamins, int cerealShelf, double cerealWeight, double cerealCups, double cerealRating) {
		this.name = cerealName;
		this.type = cerealType;
		this.calories = cerealCals;
		this.protein = cerealProtein;
		this.fat = cerealFat;
		this.sodium = cerealNa;
		this.fiber = cerealFiber;
		this.carbohydrates = cerealCarbs;
		this.sugar = cerealSugar;
		this.potassium = cerealK;
		this.vitamins = cerealVitamins;
		this.shelf = cerealShelf;
		this.weight = cerealWeight;
		this.cups = cerealCups;
		this.rating = cerealRating;
	}
	
	// SET/GET METHODS setting is unnecessary probably but also debugging assistance
	
	// name
		public void setName(String cerealName) {
			name = cerealName;
		}
		public String getName() {
			return name;
		}
	
	// type
		public void setType(char cerealType) {
			type = cerealType;
		}
		public char getType() {
			return type;
		}
	
	// calories
		public void setCals(int cerealCals) {
			calories = cerealCals;
		}
		public int getCals() {
			return calories;
		}
		
	// protein
		public void setProtein(int cerealProtein) {
			protein = cerealProtein;
		}
		public int getProtein() {
			return protein;
		}
	
	// fat
		public void setFat(int cerealFat) {
			fat = cerealFat;
		}
		public int getFat() {
			return fat;
		}
		
	// sodium
		public void setSodium(int cerealNa) {
			sodium = cerealNa;
		}
		public int getSodium() {
			return sodium;
		}
	
	// sugar
		public void setSugar(int cerealSugar) {
			sugar = cerealSugar;
		}
		public int getSugar() {
			return sugar;
		}
	
	// potassium
		public void setPotassium(int cerealK) {
			potassium = cerealK;
		}
		public int getK() {
			return potassium;
		}
	
	// vitamins
		public void setVitamins(int cerealVitamins) {
			vitamins = cerealVitamins;
		}
		public int getVitamins() {
			return vitamins;
		}
	
	// shelf
		public void setShelf(int cerealShelf) {
			shelf = cerealShelf;
		}
		public int getShelf() {
			return shelf;
		}
	
	// fiber
		public void setFiber(double cerealFiber) {
			fiber = cerealFiber;
		}
		public double getFiber() {
		return fiber;
		}
	
	// carbs
		public void setCarbs(double cerealCarbs) {
			carbohydrates = cerealCarbs;
		}
		public double getCarbs() {
		return carbohydrates;
	}
	
	// weight
		public void setWeight(double cerealWeight) {
			weight = cerealWeight;
		}
		public double getWeight() {
			return weight;
		}
	// cups
		public void setCupes(double cerealCups) {
			cups = cerealCups;
		}
		public double getCups() {
			return cups;
		}
	
	// rating
		public void setRating(double cerealRating) {
			rating = cerealRating;
		}
		public double getRating() {
			return rating;
		}
	
	// toString
	public String toString() {
		return this.name + " is type " + type + " and has " + calories + " calories, " + protein + " grams of protein.";
	}
}