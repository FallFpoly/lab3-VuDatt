package com.mycompany.lab3;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Nhap mot so nguyen: ");
        int so = sc.nextInt();

        if (laSoNguyenTo(so)) {
            System.out.println("La so nguyen to.");
        } else {
            System.out.println("Khong phai so nguyen to.");
        }

        sc.close();
    }

    
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }

        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
