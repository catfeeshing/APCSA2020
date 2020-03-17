package DataLab;
/*
 Represents information about a NWS weather station
*/

public class FarmersMarket {
   private String name, day, monthsopen, monthsclose, openingtime, closingtime, numVendors;
   
   FarmersMarket(String name, String day, String monthsopen, String monthsclose, String openingtime, String closingtime, String vendors) {
	   this.name = name;
	   this.day = day;
	   this.monthsopen = monthsopen;
	   this.monthsclose = monthsclose;
	   this.openingtime = openingtime;
	   this.closingtime = closingtime;
	   this.numVendors = vendors;
   }
	
   // accessors + setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getMonthsopen() {
		return monthsopen;
	}
	
	public void setMonthsopen(String monthsopen) {
		this.monthsopen = monthsopen;
	}
	
	public String getMonthsclose() {
		return monthsclose;
	}
	
	public void setMonthsclose(String monthsclose) {
		this.monthsclose = monthsclose;
	}
	
	public String getOpenTime() {
		return openingtime;
	}
	
	public void setOpeningtime(String openingtime) {
		this.openingtime = openingtime;
	}
	
	public String getCloseTime() {
		return closingtime;
	}
	
	public void setClosingtime(String closingtime) {
		this.closingtime = closingtime;
	}
	
	public String getNumVendors() {
		return numVendors;
	}
	
	public void setNumVendors(String numVendors) {
		this.numVendors = numVendors;
	}
	
	public boolean open(String day) {
		if (this.day.equals(day)) {
			return true;
		}
		return false;
	}
   
   
}