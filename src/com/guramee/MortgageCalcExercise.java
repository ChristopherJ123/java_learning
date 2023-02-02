package com.guramee;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class MortgageCalcExercise {
    public static void main (String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int jumlahBulanDalamTahun = 12;
        String jumlahHutangSTR = "";
        String jumlahBungaSTR = "";
        String jumlahTahunSTR = "";
        long jumlahHutangINT = 0;
        double jumlahBungaINT = 0;
        int jumlahTahunINT = 0;
        double hasil = 0;

        System.out.println("Selamat datang di Bank Toto :)");

        //First Question
        System.out.print("Input jumlah hutang: ");
        jumlahHutangSTR = scanner.nextLine().replaceAll("\\D", "");
        jumlahHutangINT = Long.parseLong(jumlahHutangSTR);
        while (jumlahHutangINT < 100000000 || jumlahHutangINT > 10000000000L) {
            System.out.println("Input jumlah hutang dalam range Rp.100,000,000 - Rp.10,000,000,000");
            System.out.print("Input jumlah hutang: ");

            jumlahHutangSTR = scanner.nextLine().replaceAll("\\D", "");
            jumlahHutangINT = Long.parseLong(jumlahHutangSTR);
        }

        //
        System.out.print("Input jumlah bunga per tahun: ");
        jumlahBungaSTR = scanner.nextLine().replaceAll("[^0-9.]", "");
        jumlahBungaINT = Double.parseDouble(jumlahBungaSTR);
        while (jumlahBungaINT == 0 || jumlahBungaINT > 30) {
            System.out.println("Please input a number between 0 - 30.");
            System.out.print("Input jumlah bunga per tahun: ");
            jumlahBungaSTR = scanner.nextLine().replaceAll("[^0-9.]", "");
            jumlahBungaINT = Double.parseDouble(jumlahBungaSTR);
        }

        //
        System.out.print("Input jangka tahun hutang: ");
        jumlahTahunSTR = scanner.nextLine().replaceAll("\\D", "");
        jumlahTahunINT = Integer.parseInt(jumlahTahunSTR);
        while (jumlahTahunINT < 1 || jumlahTahunINT > 50) {
            System.out.println("Please input a number between 1 - 50");
            System.out.print("Input jangka tahun hutang: ");
            jumlahTahunSTR = scanner.nextLine().replaceAll("\\D", "");
            jumlahTahunINT = Integer.parseInt(jumlahTahunSTR);
        }

        //Logic
        hasil = ((jumlahHutangINT + (((jumlahHutangINT * jumlahBungaINT) / 100) * jumlahTahunINT)) / (jumlahTahunINT * jumlahBulanDalamTahun));
        System.out.println("Biaya bulananmu adalah " + currency.format(hasil));
    }
}
