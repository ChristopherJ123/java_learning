package com.guramee;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bunga2 {
    public static void main(String[] args){
        //Create new scanner
        Scanner scannerTOTO = new Scanner(System.in);

        //Questions
        System.out.println("Jumlah Biaya");
        String biayaSTR = scannerTOTO.nextLine();
        System.out.println("Bunga (Dalam persen)");
        String bungaSTR = scannerTOTO.nextLine();
        System.out.println("Jangka Waktu (Bulan)");
        String waktuBulanSTR = scannerTOTO.nextLine();

        //Logic
            //Formatting
        NumberFormat rupiah = NumberFormat.getCurrencyInstance();
        int biayaINT = Integer.parseInt(biayaSTR.replaceAll("\\D", ""));
        double bungaDBL = Double.parseDouble(bungaSTR.replaceAll("[^0-9.]", ""));
        int waktuBulanINT = Integer.parseInt(waktuBulanSTR.replaceAll("\\D", ""));

            //
        double jumlahBunga = biayaINT * (bungaDBL/100);
        double totalBiaya = biayaINT + (jumlahBunga * waktuBulanINT);
        double biayaBulanan = totalBiaya / waktuBulanINT;

        //Answer
        System.out.println("Biaya bulananmu adalah " + rupiah.format(biayaBulanan));
        System.out.println(bungaDBL);
    }
}
