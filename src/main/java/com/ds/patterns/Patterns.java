package com.ds.patterns;

public class Patterns {
    public static void main(String[] args) {
       /* //n*n Square *
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


      /*  //Pyramid1
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


    /*    //inverted Pyramid
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n -i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


        /*int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0)
                    System.out.print("*");
                else
                    System.out.print(j);

            }
            System.out.println();
        }*/


       /* int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }*/

       /* int n = 3;
        for (int i = 1; i <= n + 1; i++) {
            System.out.print("*");
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }*/

        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
