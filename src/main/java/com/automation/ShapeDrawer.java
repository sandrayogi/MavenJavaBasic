package com.automation;
import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII drawing");
        System.out.println("Pilih Bentuk yang mau digambar");
        System.out.println("1. Segitiga Siku-Siku");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.println("5. Exit");
    }

    public void drawShape(int choice) {
        switch(choice){
        case 1:
        System.out.println("Masukkan Panjang segitiga siku-siku: ");
        int height = scanner.nextInt();
        drawTriangleSS(height);
        break;
        case 2:
        System.out.println("Masukkan Panjang segitiga sama kaki: ");
        int height2 = scanner.nextInt();
        drawTriangleSK(height2);
        break;
        case 3:
        System.out.println("Masukkan sisi persegi: ");
        int sisi = scanner.nextInt();
        drawSquare(sisi);
        break;
        case 4:
        System.out.println("Masukkan sisi persegi panjang: ");
        int panjang = scanner.nextInt();
        int lebar = scanner.nextInt();
        drawRectangle(panjang, lebar);
        break;
        case 5:
        System.exit(0);
        break;
        default:
        System.out.println("Invalid input");
        break;
        }
    }

    public void drawTriangleSS(int height) {
        //nested loop
        for (int i = 1; i <= height; i++) {
            //inner loop (untuk column)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

        public void drawTriangleSK (int height){
            //nested loop
            for (int i = 1; i <= height; i++) {
                //inner loop (untuk column)
                for (int j = height - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public void drawSquare (int sisi){
        for (int i = 1; i <= sisi; i++) {
            // Loop untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawRectangle (int panjang, int lebar){
        for (int i = 1; i <= panjang; i++) {
            // Loop untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

            public void run () {
                while (true) {
                    displayMenu();
                    System.out.println("Masukkan pilihan anda: ");
                    int choice = scanner.nextInt();
                    drawShape(choice);
                    System.out.println();
                }
            }
            public static void main (String[] Args){
                ShapeDrawer drawer = new ShapeDrawer();
                drawer.run();
            }
        }

