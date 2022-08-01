package MoreOnClasses;

public class BoardGameAttributes {

/*A board game company creates new board games every year. While all the games have different rules, they also are all similar in that they each have a name and a play() method.
*We need to create 3 different games - Monopoly, Chess and Battleships. In the play() method Monopoly should print “Buy all property.”, Battleships - “Sink all ships.”, and Chess - “Kill the enemy king.”
*Complete the code by implementing the getName() and play() methods inherited from abstract Game class.
*To give a name to games just return the name string inside the getName() function. */
	
	public static void main(String[] args) {
	       //do not touch this code
	       Monopoly monopoly = new Monopoly();
	       Chess chess = new Chess();
	       Battleships battleships = new Battleships();
	       
	       monopoly.play();
	       chess.play();
	       battleships.play();
	   }
	}

	abstract class Game {
	   public String name;
	   abstract String getName();
	   abstract void play();
	}

	class Monopoly extends Game {

	  
	   String getName() {
	      return name;
	       
	   }

	  
	   void play() {
	       System.out.println("Buy all property.");
	   }
	}

	class Chess extends Game {

	   
	   String getName() {
	       return name;
	   }

	 
	   void play() {
	       System.out.println("Kill the enemy king.");
	   }
	}

	 class Battleships extends Game {

	  
	   String getName() {
		   return name;
	   }

	  
	   void play() {
	       System.out.println("Sink all ships.");
	   }
	
}
	
