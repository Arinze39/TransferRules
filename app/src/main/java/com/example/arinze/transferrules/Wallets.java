package com.example.arinze.transferrules;

/**
 * Created by Arinze on 9/23/2017.
 */
public class Wallets {
    public int Serial_No;
    public String Currency;
    public double Balance;
    public String Id;
    public String Wallet_Name;

    Wallets(int Serial_No,String Currency,double Balance,String Id,String Wallet_Name){
        this.Serial_No = Serial_No;
        this.Currency = Currency;
        this.Balance = Balance;
        this.Id = Id;
        this.Wallet_Name = Wallet_Name;
    }
}
