package com.BridgeLabz;

import java.util.Scanner;

public class VendingMachineProg {
    public static void main(String[] args) {
        int note;
        int[] VendingMachineNotes = {1, 2, 5,10, 50, 100, 500, 1000};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mony that you want to get from vending Machine");
        double money = s.nextInt();
        int minnote = 0;
        for (int i = 7; i >= 0; i--) {
            if (money >= VendingMachineNotes[i]) {
                note=(int) (money/VendingMachineNotes[i]);
                money=money-note*VendingMachineNotes[i];
                minnote=minnote+note;
                System.out.println("note of "+VendingMachineNotes[i]+"="+note);

            }
    }
        System.out.println("total number of notes "+ minnote);
}}