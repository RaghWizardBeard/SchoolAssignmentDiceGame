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
    
    public static void main(String[] args) {

        DicePlayer player = new DicePlayer();

        player.setName("michael");
        player.setCash(100);

        System.out.println("Hello "+ player.getName());
        System.out.printf(player.getName() + ", you have $%.2f on hand\n",player.getCash());


        if(player.addCash(100)) //should work
        {
            System.out.println("Added 100 to cash");
        }
        else
        {
            System.out.println("failed to add 100 to cash");
        }   

        if(player.addCash(-100)) //should fail
        {
            System.out.println("Added -100 to cash");
        }
        else
        {
            System.out.println("failed to add -100 to cash");
        }

        System.out.printf(player.getName() + ", you have $%.2f on hand\n",player.getCash());


        if (player.subtractCash(12)) //should work
        {
            System.out.println("Withdrawal of 12 OK");
        } 
        else
        {
            System.out.println("Withdrawal of 12 fail");
        }

        System.out.printf(player.getName() + ", you have $%.2f on hand\n",player.getCash());

        if (player.subtractCash(300)) //should fail
        {
            System.out.println("Withdrawal of 300 OK");
        } 
        else
        {
            System.out.println("Withdrawal of 300 fail");
        }

         System.out.printf(player.getName() + ", you have $%.2f on hand\n",player.getCash());

        if (player.subtractCash(-1)) //should fail
        {
            System.out.println("Withdrawal of -1 OK");
        } 
        else
        {
            System.out.println("Withdrawal of -1 fail");
        }

        System.out.printf(player.getName() + ", you have $%.2f on hand\n",player.getCash());
    }
    
}
