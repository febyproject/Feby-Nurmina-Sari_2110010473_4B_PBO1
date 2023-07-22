package pbo1;

import java.util.Scanner;


public class BukuBeraksi {
    public static void main(String[] args) {
        
        //object
        //Buku buku = new Buku("Kimia"," 2110010001");
        
        //System.out.println(buku.displayInfo());
       // System.out.println(buku.displayInfo(" Juriadi"));
       
       //error Handling
       try{
            //IO sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            BukuDetail[] buku = new BukuDetail[2];


            //perulangan biasa
            for(int i=0; i<buku.length; i++){
                 System.out.print("Masukkan Nama Buku  "+(i+1)+" : ");
                 String Nama_Buku = scanner.nextLine();
                 System.out.print("Masukkan Kode Buku "+(i+1)+" : ");
                 String Kode_Buku = scanner.nextLine();

                 //object
                 buku[i] = new BukuDetail(Nama_Buku,Kode_Buku);
            }

            //perulangan array
            for(BukuDetail data: buku){
                System.out.println("______________________");
                System.out.println("_______Data Buku_______");
                 System.out.println(data.displayInfo());
            }
       } catch (NumberFormatException e){
           System.out.println("Error Nomer : "+e.getMessage());
       } catch (StringIndexOutOfBoundsException e){
           System.out.println("Error Kode Buku : "+e.getMessage());
       } catch (Exception e){
            System.out.println("Error umum: "+e.getMessage());
    }
    }
}
