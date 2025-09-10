package week02.chandra.id.ac.umn;

import java.util.Scanner;

public class MainTryinMadeupthings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int bulan;
		
		System.out.print("Pilih Bulan dalam setahun: ");
		bulan = scanner.nextInt();
		
		switch(bulan) {
		case 1 -> System.out.print ("Bulan Januari memiliki 31 hari.");
        case 2 -> System.out.print ("Bulan Februari memiliki 28 hari.");
        case 3 -> System.out.print ("Bulan Maret memiliki 31 hari.");
        case 4 -> System.out.print ("Bulan April memiliki 30 hari.");
        case 5 -> System.out.print ("Bulan Mei memiliki 31 hari.");
        case 6 -> System.out.print ("Bulan Juni memiliki 30 hari.");
        case 7 -> System.out.print ("Bulan Juli memiliki 31 hari.");
        case 8 -> System.out.print ("Bulan Agustus memiliki 31 hari.");
        case 9 -> System.out.print ("Bulan September memiliki 30 hari.");
        case 10 -> System.out.print ("Bulan Oktober memiliki 31 hari.");
        case 11 -> System.out.print ("Bulan November memiliki 30 hari.");
        case 12 -> System.out.print ("Bulan Desember memiliki 31 hari.");
        default -> System.out.print ("Tidak ada bulan ke 13.");
		};
	}
}

