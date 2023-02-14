package com.guramee;

public class Test1 {
    public static void main(String[] args) {
        for (int abc = 1; abc <= 5; abc++) {
            System.out.println("Test" + abc);
        }
        int i = 1;
        while (i <= 5) {
            System.out.println("While" + i);
            i++;
        }
        String str = "AaBbCc12345.,";
        //System.out.println(str.replaceAll("[^a-zA-Z1-3.]", ""));
        System.out.println(str.replaceAll("\\d", ""));

        int a = 10;
        int b = 4;
        double c = (double)a/ (double)b;
        System.out.printf("%d / %d = %f \n%s",a,b,c, "Mantaps");
    }
}
