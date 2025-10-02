

package com.mycompany.lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] hoten = new String[n];
        double[] diem = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            hoten[i] = sc.nextLine();
            System.out.print("Diem: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // Bo dong new line
        }

        
        System.out.println("\nDanh sach sinh vien da nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoten[i] + " - " + diem[i] + " diem - Hoc luc: " + xepLoai(diem[i]));
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    
                    String tempTen = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = tempTen;
                }
            }
        }

        
        System.out.println("Danh sach sinh vien sau khi sap xep theo diem tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoten[i] + " - " + diem[i] + " diem - Hoc luc: " + xepLoai(diem[i]));
        }

        sc.close();
    }

   
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
}
