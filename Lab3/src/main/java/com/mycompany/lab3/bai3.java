
package com.mycompany.lab3;


import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Mang co bao nhieu thanh phan: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // sap xep mang tang dan

        
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();


        // phan tu nho nhat sau khi sap xep la phan tu dau  tien
        System.out.println("Phan tu nho nhat trong mang: " + arr[0]);

        
        int tong = 0;
        int dem = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                tong += num;
                dem++;
            }
        }

        if (dem > 0) {
            double trungBinh = (double) tong / dem;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + trungBinh);
        } else {
            System.out.println("Khong co phan tu chia het cho 3 trong mag.");
        }

        sc.close();
    }
}
