/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bank;

/**
 *
 * @author James E. Davis
 */
public class Bank {

    double payoutTotal;
    
    public double getTotal()
    {
        return payoutTotal;        
    }
    public boolean placeBet(double anti)
    {   boolean banker;
        if (anti <= 0)
        {
            banker = false;
        }
        else
        {
            payoutTotal = payoutTotal * 2;
            banker = true;
        }
        return banker;
    }
    public double payout()
    {   
        double takeMyMoney = payoutTotal;
        payoutTotal = 0.0;
        return takeMyMoney;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
