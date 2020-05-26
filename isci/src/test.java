import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int sonuc;
		Scanner giris= new Scanner(System.in);
		iscisýnýfý i1 = new iscisýnýfý("Ýlyas","Kurt",60,7);
		iscisýnýfý i2= new iscisýnýfý();
		System.out.println("Sýrayla Ýsim Soyisim Çalýþma saati ve Saatlik ücreti giriniz.");
		i2.setAd(giris.nextLine());
		i2.setSoyad(giris.nextLine());
		i2.setCalýs_sa(giris.nextInt());
		i2.setSaat_üc(giris.nextInt());
		System.out.println("Adý "+i2.getAd()+" Soyadý "+i2.getSoyad()+" Toplam ücret= "+i2.hesap(i2.getCalýs_sa(),i2.getSaat_üc()));
		System.out.println("Adý "+i1.getAd()+" Soyadý "+i1.getSoyad()+" Toplam ücret= "+i1.hesap(i1.getCalýs_sa(),i1.getSaat_üc()));
		
	
	}
	
}
