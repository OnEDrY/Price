package com.company;

public class Main {


    public static void main(String[] args) {
        {
            Price[] arr = new Price[10];

            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = new Price();
                arr[i].setPrice(50 * i);
            }
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i].getPrice());
            }
        }
    }
}
