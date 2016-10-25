/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package die;

/**
 *
 * @author James E. Davis
 */
import java.util.Random;
public class Die 
{
   Random rollRando = new Random();
   
  int dieSides = 6;
  int  value = 1;
  
  public Die(int sides)
  {
      dieSides = sides;
  }
   public Die()
  {
      dieSides = 6;
      value = 1;
  }
  
  
  public int roll()
  {
   value = rollRando.nextInt(dieSides) + 1; 
   return value;
  }
  public int getValue(){
     return value;
  }
   
  
   public void setSides(int sideNum){
       dieSides =  sideNum;
   }
      public int getSides(){
       return dieSides;
   }

    public static void main(String[] args)     {

        //test die constructors
       Die die1 = new Die(20);
       if(die1.getSides() != 20 && die1.getValue()!=1)
       {
           System.out.println("Error");
       }

       Die die2 = new Die();
       if(die2.getSides() != 6 && die2.getValue()!=1)
       {
           System.out.println("Error");
       }

       Die die3 = new Die(6);
       if(die3.getSides() != 6 && die3.getValue()!=1)
       {
           System.out.println("Error");
       }
    }
    
}
