package myProject10;
import java.util.Scanner;

public class PassingSituationComparedToAverage {
	public static void main(String[]args) {
		int mat,fizik,turkce,kimya,muzik,toplam,dersSayisi;
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen matematik notunuzu giriniz:");
		mat=input.nextInt();
		System.out.print("Lütfen fizik notunuzu giriniz:");
		fizik=input.nextInt();
		System.out.print("Lütfen Türkçe notunuzu giriniz:");
		turkce=input.nextInt();
		System.out.print("Lütfen kimya notunuzu giriniz:");
		kimya=input.nextInt();
		System.out.print("Lütfen müzik notunuzu giriniz:");
		muzik=input.nextInt();
		toplam=0;
		dersSayisi=0;
		if(mat>=0&&mat<=100) {
			toplam+=mat;
			dersSayisi++;
			
		}
		if(fizik>=0&&fizik<=100) {
			toplam+=fizik;
			dersSayisi++;
			
		}
		if(turkce>=0&&turkce<=100) {
			toplam+=turkce;
			dersSayisi++;
			
		}
		if(kimya>=0&&kimya<=100) {
			toplam+=kimya;
			dersSayisi++;
			
		}
		if(muzik>=0&&muzik<=100) {
			toplam+=muzik;
			dersSayisi++;
			
		}
		double genelOrt=toplam/dersSayisi;
		System.out.println("Genel ortalamanız:"+genelOrt);
		if(genelOrt>=55) {
			System.out.println("Sınıfı geçtiniz!");
			
		}
		else {
			System.out.println("Sınıfta kaldınız!");
		}
	}
	

}
