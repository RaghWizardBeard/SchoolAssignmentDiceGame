/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package diceplayer;

/**
 *
 * @author James E. Davis
 */


public class DicePlayer {
    String playerName;
    double playerCash;
    
    public DicePlayer(String name, double cash)
    {
    playerName = name;
    playerCash= cash;
    }
    
        public DicePlayer(String name)
    {
    playerName = name;
    playerCash = 0;
    }
        
    public void setName(String requestedName)
    {
        playerName = requestedName;
    }
    public String getName()
    {
        return playerName;
    }
    public void setCash(double deposit)
    {
        playerCash = deposit;
    }
    
    public double getCash()
    {
      return playerCash;
    }
    public boolean addCash(double deposit)
    {
      boolean depositSlip;
      if (deposit <= 0)
      {
          depositSlip = false;
      }
      else
      {
        playerCash = playerCash + deposit;
        depositSlip = true;  
      }
    return depositSlip;
    }
        public boolean subtractCash(double deposit)
    { boolean depositSlip;
      if (deposit <= 0 || playerCash < deposit)
      {
          depositSlip = false;
      }
      else
      {
        playerCash = playerCash - deposit;
        depositSlip = true;  
      }
    return depositSlip;
    }
    
    public static void main(String[] args)
    {
     DicePlayer player1 = new DicePlayer("Ada");

       if(player1.getName().equals("Ada"))
       {
           System.out.println("OK");
       }
       else
       {
           System.out.println("ERROR");
       }

       DicePlayer player2 = new DicePlayer("Anita", 100);

       if(player2.getName().equals("Anita") && player2.getCash()-100 < 0.00001)
       {
           System.out.println("OK");
       }
       else
       {
           System.out.println("ERROR");
       }

        System.out.println("Done");
    }
}
