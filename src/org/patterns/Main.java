package org.patterns;

public class Main {

    public static void main(String[] args) {
        square(5);
        System.out.println();
        rightangle(5);
        System.out.println();
        rightanglereverse(5);

    }
    public static void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A  ");
            }
            System.out.println();
        }
    }
    public static void rightangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("A  ");
            }
            System.out.println();
        }
    }
    public static void rightanglereverse(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }

}
