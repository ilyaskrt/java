
public class iscis�n�f� {

	private String ad�, soyad�;
	private int cal�s_sa, saat_�c;


public void setAd(String ad) {
this.ad�=ad;
}
public String getAd() {
	return ad�;
}
public void setSoyad(String soyad) {
	
	this.soyad�=soyad;
}
public String getSoyad() {
	return soyad�;
}
public void setCal�s_sa(int cal�s_sa) {
	this.cal�s_sa=cal�s_sa;
}
public int getCal�s_sa() {
	return cal�s_sa;
}
public void setSaat_�c(int saat_�c) {
	this.saat_�c=saat_�c;	
}
public int getSaat_�c() {
	return saat_�c;
}

public int hesap(int cal�s_sa,int saat_�c) {
	if(cal�s_sa>100) {
		int a=cal�s_sa-100;
		return saat_�c*100 + a*25;
	}
	else return cal�s_sa*saat_�c;
}
public iscis�n�f�() {
	
	ad�="girilmedi";
	soyad�="girilmedi";
	cal�s_sa=0;
	saat_�c=0;
}
public iscis�n�f�(String a_ad,String a_soyad,int a_cal�s_sa,int a_saat_�c) {
	ad�=a_ad;
	soyad�=a_soyad;
	cal�s_sa=a_cal�s_sa;
	saat_�c=a_saat_�c;
}

}
