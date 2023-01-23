package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] card={"Clubs", "Diamonds","Hearts","Spades"};
        String[] rank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String [][] ArrayCard=new String[4][13];
        for (int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                ArrayCard[i][j]=card[i]+ ' '+rank[j];
            }
        }
        Shuffle shuffle=new Shuffle();
        shuffle.Shufflecards(ArrayCard);
        for (int i=0;i<4;i++){
            System.out.println();
            System.out.println("Cards of Player" +(i+1));
            for (int j=0;j<4;j++){
                System.out.println(ArrayCard[i][j]);
            }
        }
    }
}
