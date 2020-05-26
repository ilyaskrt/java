import java.util.Scanner;

public class toplam {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("sayi giriniz: ");
		
		int a = giris.nextInt();
		
		int b = giris.nextInt();
		
		int toplam= a+b;
		if(a==b) {
			System.out.println("degerler esit");
		}
		else {
			System.out.println("degerler toplami"+ toplam);
		}
	}
	}
