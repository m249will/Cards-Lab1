// Lab11bvst.java
// This is the Student starting version for the <Deck> class lab 11b assignment. 
import java.util.*;

public class DeckProgram
{
   public static void main(String[] args)
   {
      Deck deck = new Deck();
      System.out.println(deck);
   }
}


class Deck 
{
   private Card[] cards;
   private int size=0;
   private int Rank = 0;
   
   public Deck() 
   {
      size = 0;
      cards = new Card[52];
      
      String suit[] = {"Clubs","Diamonds","Hearts","Spades"};
      String rank[] = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
      int value[] = {2,3,4,5,6,7,8,9,10,10,10,10,11};
      // add all cards
      
      //Loop for all club suit cards
      for(int k = 0; k < 13; k++){
    	  add(suit[0],rank[Rank],value[k]);
    	  Rank += 1;
      }
      //Loop for all Diamonds
      Rank = 0;
      for(int k = 0; k < 13; k++){
    	  add(suit[1],rank[Rank],value[k]);
    	  Rank += 1;
      }
      //Loop for all Hearts
      Rank = 0;
      for(int k = 0; k < 13; k++){
    	  add(suit[2],rank[Rank],value[k]);
    	  Rank += 1;
      }
      //Loop for all Spades
      Rank = 0;
      for(int k = 0; k < 13; k++){
    	  add(suit[3],rank[Rank],value[k]);
    	  Rank += 1;
      }
      shuffle();
   }    
   
   public void add(String suit, String rank, int value){
	   Card temp = new Card(suit,rank,value);
	   cards[size] = temp;
	   size++;
   }
   
   private void shuffle(){
	   for (int k = 0; k <= 1000; k++){
		   int firstIndex = (int)(Math.random()*52);
		   int secondIndex = (int)(Math.random()*52);
		   Card temp = cards[firstIndex];
		   cards[firstIndex] = cards[secondIndex];
		   cards[secondIndex] = temp;
	   }
	   
   }
   
	public String toString()
   	{
      		String temp = "";
      		for (int k = 0; k < size; k++)
         		temp = temp + cards[k].toString() + "\n";
      		return temp;   
   	}

 }
