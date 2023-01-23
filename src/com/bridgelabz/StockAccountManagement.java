package com.bridgelabz;

public class StockAccountManagement {
private   String stockNames;
private  int numberOfShares;
private double sharePrice;

public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
}
