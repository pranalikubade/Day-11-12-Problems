package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockOperation {
    Scanner sc=new Scanner(System.in);
    StockAccountManagement account=new StockAccountManagement();
    List<StockAccountManagement> stockList=new ArrayList<>();
    public void addStock(){

        System.out.println("Enter Stock Name");
        String StockName=sc.next();
        System.out.println("Enter Number of Shares");
        int numberOfShare= sc.nextInt();
        System.out.println("Enter Share Price");
        double sharePrice= sc.nextInt();
       account.setStockNames(StockName);
       account.setNumberOfShares(numberOfShare);
       account.setSharePrice(sharePrice);

        stockList.add(account);

    }
    public  void showStock(){
        System.out.println(account.getStockNames());
        System.out.println(account.getNumberOfShares());
        System.out.println(account.getSharePrice());
    }
    public void calculateStock(){
double value=account.getNumberOfShares() * account.getSharePrice();
        System.out.println(value);
    }
}
