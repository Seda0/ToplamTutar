package Toplam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Merhaba ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen Aracin Kilometrede Yaktigi Kurusu Giriniz (Ornek:0,23) :");
		double kurus = scanner.nextDouble();

		System.out.print("Lutfen Aracin Kac Kilometre Gittigini Giriniz (Ornek:3,50) :");
		double km = scanner.nextDouble();
		
		
		double toplam = km * kurus;
		System.out.println("Odemeniz Gereken Tutar: " + toplam + "tl'dir"  );

	}

}
