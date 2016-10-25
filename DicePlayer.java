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
        
    }
}
