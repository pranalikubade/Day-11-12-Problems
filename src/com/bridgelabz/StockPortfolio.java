package com.bridgelabz;

import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {


      //  StockAccountManagement obj1 = new StockAccountManagement();
        // Scanner scanner = new Scanner(System.in);
        StockOperation operation=new StockOperation();
        operation.addStock();
        operation.showStock();
        operation.calculateStock();

    }
}
