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

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
