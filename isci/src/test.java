import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int sonuc;
		Scanner giris= new Scanner(System.in);
		iscis�n�f� i1 = new iscis�n�f�("�lyas","Kurt",60,7);
		iscis�n�f� i2= new iscis�n�f�();
		System.out.println("S�rayla �sim Soyisim �al��ma saati ve Saatlik �creti giriniz.");
		i2.setAd(giris.nextLine());
		i2.setSoyad(giris.nextLine());
		i2.setCal�s_sa(giris.nextInt());
		i2.setSaat_�c(giris.nextInt());
		System.out.println("Ad� "+i2.getAd()+" Soyad� "+i2.getSoyad()+" Toplam �cret= "+i2.hesap(i2.getCal�s_sa(),i2.getSaat_�c()));
		System.out.println("Ad� "+i1.getAd()+" Soyad� "+i1.getSoyad()+" Toplam �cret= "+i1.hesap(i1.getCal�s_sa(),i1.getSaat_�c()));
		
	
	}
	
}
