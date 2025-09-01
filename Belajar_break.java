/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_break;
import java.util.Scanner;

public class Belajar_break {

    public static void main(String[] args) {
        int paketMakan;

        Scanner in = new Scanner(System.in);
        System.out.print("Pilihan : \n 1. Paket Ayam \n 2. Paket Ikan \n 3. Paket Daging \n 4. Paket Sayur \n Masukan pilihan : ");
        paketMakan = in.nextInt();

        switch (paketMakan) {
            case 1:
                System.out.println("Paket Ayam Rp.15.000");
                break;
            case 2:
                System.out.println("Paket Ikan Rp.20.000");
                break;
            case 3:
                System.out.println("Paket Daging Rp.30.000");
                System.out.print("Berapa paket daging yang ingin dibeli? ");
                int jumlah = in.nextInt();
                if (jumlah >= 3) {
                    System.out.println("Anda mendapatkan potongan sebesar Rp.5.000");
                    int total = 30_000 * jumlah - 5_000;
                    System.out.println("Total harga setelah potongan: Rp." + total);
                } else {
                    int total = 30_000 * jumlah;
                    int potongan = total - 5_000;
                    System.out.println("Total harga: Rp." + potongan);
                }
                break;
            case 4:
                System.out.println("Paket Sayur Rp.10.000");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    }
    
  
