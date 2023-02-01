package com.guramee;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bunga1 {
    public static void main(String args[]){
        //Create new scanner
        Scanner scannerTOTO = new Scanner(System.in);

        //Questions
        System.out.println("Jumlah Biaya");
        int biaya = scannerTOTO.nextInt();
        System.out.println("Bunga (Dalam persen)");
        double bunga = scannerTOTO.nextDouble();
        System.out.println("Jangka Waktu (Bulan)");
        int waktuBulan = scannerTOTO.nextInt();

        //Logic
        NumberFormat rupiah = NumberFormat.getCurrencyInstance();
        double jumlahBunga = (biaya * bunga/100);
        double totalBiaya = biaya + (jumlahBunga * waktuBulan);
        double biayaBulanan = totalBiaya / waktuBulan;

        //Answer
        System.out.println("Biaya bulananmu adalah " + rupiah.format(biayaBulanan));
    }
}
