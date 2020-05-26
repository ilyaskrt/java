import java.util.Scanner;

public class Banka {

	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int bakiye=1000;
	int islem;
	
	System.out.println("1: Bakiye göster");
	System.out.println("2: Para yatır");
	System.out.println("3: Para çek");
	System.out.println("4: Cikis");
	System.out.println("0: Kapat..");
	islem = scan.nextInt();
	while (islem != 0) {
	switch(islem) {
		
	case 1:
		System.out.println("Bakiyeniz: "+ bakiye + "tl dir");
		islem = scan.nextInt();
		break;

		
	case 2:
		System.out.println("yatırılmak istenen miktar: ");
		int a = scan.nextInt();
		bakiye+=a;
		System.out.println("Toplam tutar: " + bakiye);
		islem = scan.nextInt();
		break;
		
	case 3:
		System.out.println("çekilmek istenen miktar");
		int b= scan.nextInt();
		bakiye -=b;
		System.out.println("Güncel bakiyeniz "+ bakiye + "tl dir");
		islem = scan.nextInt();
		break;
		
	case 4:
		System.out.println("Güle güle");
		islem = scan.nextInt();
		break;
	default:
		System.out.println("Yanlış seçim yaptınız.");
		islem = scan.nextInt();
		break;
	
	   }
	  }
	}

 }
