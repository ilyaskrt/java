//girilen boy ve kilo degerlerine göre endeks hesaplaması yapılır.
import java.util.Scanner;

public class Kütle {

public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		double boy,kilo,sonuç;
		
		System.out.println("Boyunuzu santimetre cinsinden giriniz. ");
		boy = tara.nextDouble();
		System.out.println("kilonuzu giriniz. ");
		kilo = tara.nextDouble();
		sonuç=kilo/(boy*boy);
		
		System.out.println("kitle endexiniz : " + sonuç + " dır.");
		tara.close();
 }
}
