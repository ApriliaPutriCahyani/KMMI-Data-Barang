/**
 * @(#)Barang.java
 * UTS KMMI
 * NIM/ID KMMI 	: 1912511100
 * Nama 		: Aprilia Putri Cahyani Sugiarto
 * Kampus Asal 	: Universitas Budi Luhur
 * @author 
 * @version 1.00 2021/9/2
 */

import java.io.*;
public class Barang {
	String[][] databarang = new String[2][4];
   	BufferedReader inObj = new BufferedReader(new InputStreamReader(System.in));
    public Barang() {
    }
        void inputDataBarang(){
		try{
		   	for(int i=0; i<databarang.length; i++){
		    	System.out.print((i+1)+".\tKode Barang   : "); databarang[i][0] = inObj.readLine();
		    	System.out.print("\tNama Barang   : "); databarang[i][1] = inObj.readLine();
		     	System.out.print("Jenis Barang  : "); databarang[i][2] = inObj.readLine();
		     	System.out.print("Harga Barang  : "); databarang[i][3] = inObj.readLine();
		     	System.out.println("-----------------------------------------------------------------");
			}
		}
		catch(Exception e){
		}					
    }
    
    void cetakDataBarang(){
 		System.out.println("=========================================================================");
		System.out.println("No.\tKode Barang\t\tNama Barang\t\tJenis Barang\t\tHarga Barang");
		System.out.println("=========================================================================");
		for(int i=0; i<databarang.length; i++){
			System.out.println((i+1)+".\t\t"+databarang[i][0]+"\t\t\t"+databarang[i][1]+"\t\t\t"+databarang[i][2]+"\t\t\t\t"+databarang[i][3]);
		}
		System.out.println("=========================================================================");
    }
    
    void cariDataBarang(){
		try{
			System.out.print("Masukkan Kode Barang yang mau di cari : ");
			String kode = inObj.readLine();
			boolean ketemu = false;
		   	for(int i=0; i<databarang.length; i++){
		    	if(databarang[i][0].equals(kode)){
			    	System.out.println("\tNama Barang  : "+databarang[i][1]);
			     	System.out.println("\tJenis Barang : "+databarang[i][2]);
			     	System.out.println("\tHarga Barang : "+databarang[i][3]);
			     	ketemu = true;
			     	break;
		    	}
			}
			if(ketemu==false){
				System.out.println("Kode Barang yang di cari tidak ada...........");
			}
		}
		catch(Exception e){
		}					
    }
    
    void ubahDataBarang(){
		try{
			System.out.print("Masukkan Kode Barang yang mau di ubah : ");
			String kode = inObj.readLine();
			boolean ketemu = false;
		   	for(int i=0; i<databarang.length; i++){
		    	if(databarang[i][0].equals(kode)){
			    	System.out.println("\tNama Barang  : "+databarang[i][1]);
			     	System.out.println("\tJenis Barang : "+databarang[i][2]);
			     	System.out.println("\tHarga Barang : "+databarang[i][3]);
					System.out.print("Apakah data mau di ubah {y/t] : ");
					String yaTidak = inObj.readLine();
			     	if(yaTidak.equals("y")){
				    	System.out.print("\tNama Barang  : "); databarang[i][1] = inObj.readLine();
				     	System.out.print("Jenis Barang : "); databarang[i][2] = inObj.readLine();
				     	System.out.print("Harga Barang : "); databarang[i][3] = inObj.readLine();
				     	
				     	
			     	}
			     	ketemu = true;
			     	break;
		    	}
			}
			if(ketemu==false){
				System.out.println("Kode Barang yang di cari tidak ada...........");
			}
		}
		catch(Exception e){
		}					
    }
    
    public static void main(String[] args){
    	Barang myObj = new Barang();
		String pilih = "";
		while(true){
			try{
				System.out.println("=========================================================================");
				System.out.println("\t\t\t\t\t\t\tMenu Data Barang");
				System.out.println("=========================================================================");
				System.out.println("1. Input Data Barang");
				System.out.println("2. Cetak Data Barang");
				System.out.println("3. Cari Data Barang");
				System.out.println("4. Ubah Data Barang");
				System.out.println("5. Keluar");
				System.out.println("=========================================================================");
				System.out.print("Masukan Pilihan [1/2/3/4/5] :"); pilih = myObj.inObj.readLine();
				System.out.println("=========================================================================");
				if(pilih.equals("1")){
					System.out.println("\t\t\t\t\t\t\tInput Data Barang");
					System.out.println("=========================================================================");
					myObj.inputDataBarang();
				}
				else if(pilih.equals("2")){
					System.out.println("\t\t\t\t\t\t\tCetak Data Barang");
					myObj.cetakDataBarang();
 				}
				else if(pilih.equals("3")){
					System.out.println("\t\t\t\t\t\t\tCari Data Barang");
					System.out.println("=========================================================================");
					myObj.cariDataBarang();
 				}
				else if(pilih.equals("4")){
					System.out.println("\t\t\t\t\t\t\tUbah Data Barang");
					System.out.println("=========================================================================");
					myObj.ubahDataBarang();
 				}
				else if(pilih.equals("5")){
					break;
				}
				else{
					System.out.println("Salah Pilih");
				}
			}
			catch(Exception e){
			}
		}
    }
}