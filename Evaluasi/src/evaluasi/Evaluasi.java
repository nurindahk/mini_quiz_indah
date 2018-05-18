/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluasi;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nip,gp = 0,bt = 0,bp,gt,ng,gol,tunjangan = 0,pot = 0,total;
        String nama;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gaji Pegawai");
        System.out.println("=======================");
        System.out.print("Masukkan Nomor Induk Pegawai : ");
        nip=scan.nextInt();scan.nextLine();
        System.out.print("Masukkan Nama : ");
        nama=scan.nextLine();
        System.out.print("Masukkan Golongan [1/2/3/4] : ");
        ng=scan.nextInt();
        
        
        switch (ng) {
            case 1 :
                gp=2000000;
                tunjangan=gp*40/100;
                pot=40000;
                break;
            case 2 :
                gp=2500000;
                tunjangan=gp*40/100;
                pot=40000;
                break;
            case 3 :
                gp=3000000;
                tunjangan=gp*50/100;
                pot=50000;
                break;
            case 4 :
                gp=4000000;
                tunjangan=gp*60/100;
                pot=55000;
                break;
            default :
                System.out.print("Golongan yang di inputkan tidak tersedia");
                
        }
       total=gp+tunjangan-pot;
       
        System.out.println("Gaji Pokoknya : Rp."+gp);
        System.out.println("Besar Tunjangan : Rp."+tunjangan);
        System.out.println("Besar Potongan : Rp."+pot);
        System.out.println("Gaji Total : "+total);
    }
    
    
}
