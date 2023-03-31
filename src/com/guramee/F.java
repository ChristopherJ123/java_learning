package com.guramee;

public class F {
    static int[] arrayF = {5, 2, 5, 2, 2};

    public static void main (String[] args) {

//        for (int i = 0; i < arrayF.length; i++) {
//            String answer = "";
//            for (int j = 0; j < arrayF[i]; j++) {
//                answer = answer.concat("F");
//            }
//            System.out.println(answer);
//        }

        for (int i = 0; i < arrayF.length; i++) {
            for (int j = 0; j < arrayF[i]; j++) {
                System.out.print('F');
            }
            System.out.println();
        }
    }
}
