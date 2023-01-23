package com.bridgelabz;

public class Shuffle {
    public void Shufflecards(String[][] arr) {
        String var;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int x = (int) (Math.random() * 10 % 4);
                int y = (int) (Math.random() * 10 % 13);
                var = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = var;

            }
        }
    }

}

