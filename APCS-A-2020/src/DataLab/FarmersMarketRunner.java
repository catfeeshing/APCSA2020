package DataLab;
import java.util.ArrayList;
import java.util.Scanner;

import core.data.*;

public class FarmersMarketRunner {
   public static void main(String[] args) {
	   DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/atzp-3tnt/rows.xml").load();
	   ds.printUsageString();
	      ArrayList<FarmersMarket> allMarkets = ds.fetchList(FarmersMarket.class, "row/row/name", "row/row/day_", "row/row/monthsopen", 
	    		  "row/row/monthsclose", "row/row/openingtime", "row/row/closingtime", "row/row/numberofvendors");
	      
	      System.out.println("Total number of Farmers' Markets: " + allMarkets.size() + "\n");
	      
	      ArrayList<String> openNine = new ArrayList<String>();
	      for (FarmersMarket fm : allMarkets) {
	         //if(fm.getDay().equals("openNine")) {
	        	 if (fm.getOpenTime().equals("9:00 a.m.")) {
	        	 openNine.add(fm.getName());
	        	 //System.out.println(fm.getOpenTime());
	        	 //System.out.println(Integer.parseInt(fm.getNumVendors()));
	         	}
	         //}
	      }
	      System.out.println("How many farmers markets open on openNine at 9:00am in Baltimore? ");
	      System.out.println(openNine.size() + " farmers markets open on openNine at 9:00am. They are: " + openNine);
	      
	      System.out.println("\nThese are all the farmers markets in Baltimore!");
	      for(FarmersMarket fm : allMarkets) {
	    	  System.out.println(fm.getName());
	      }
	      
	      
   }
}