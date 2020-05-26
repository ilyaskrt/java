import java.util.Scanner;
//bir iscinin bilgileri tanımlanmistir
//bir iscinin bilgileride kullanicidan alınıyor ve aylik kazanc hesaplaniyor
public class test {
	
	public static void main(String[] args) {
		int sonuc;
		Scanner giris= new Scanner(System.in);
		iscisýnýfý i1 = new iscisinifi("ilyas","Kurt",60,7);
		iscisýnýfý i2= new iscisinifi();
		System.out.println("Sirayla isim Soyisim Çaliþma saati ve Saatlik ücreti giriniz.");
		i2.setAd(giris.nextLine());
		i2.setSoyad(giris.nextLine());
		i2.setCalýs_sa(giris.nextInt());
		i2.setSaat_üc(giris.nextInt());
		System.out.println("Adý "+i2.getAd()+" Soyadi "+i2.getSoyad()+" Toplam ücret= "+i2.hesap(i2.getCalis_sa(),i2.getSaat_üc()));
		System.out.println("Adý "+i1.getAd()+" Soyadi "+i1.getSoyad()+" Toplam ücret= "+i1.hesap(i1.getCalis_sa(),i1.getSaat_üc()));
		
	
	}
	
}
