/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan17.tunjangan;
import java.util.Scanner;

/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Tunjangan
 */
public class PBOIF210119060Latihan17Tunjangan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String status;
        int gajipokok;
        double tunjangan, totalgaji;
        
         System.out.println("================= Program Tunjangan =================== ");
         System.out.print("Berapa gaji Pokok anda perbulan? : Rp.");
         gajipokok =input.nextInt();
         
         System.out.print("Status Anda ? (menikah/belum)    :");
         status = input.next();
         
         if ("menikah".equals(status)){
                tunjangan = 0.35 * gajipokok;
          } else {
                tunjangan = 0;
          }
          totalgaji = gajipokok + tunjangan;
          System.out.println("");
          System.out.println("============ Hasil Perhitungan gajih Anda ============ ");
          System.out.println("Gaji Poko  :Rp. "+gajipokok);
          System.out.println("Tunjangan  :Rp. "+tunjangan);
          System.out.println("Total Gaji :Rp. "+totalgaji);
            
    }
    
}
