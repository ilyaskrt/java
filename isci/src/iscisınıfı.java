
public class iscisýnýfý {

	private String adý, soyadý;
	private int calýs_sa, saat_üc;


public void setAd(String ad) {
this.adý=ad;
}
public String getAd() {
	return adý;
}
public void setSoyad(String soyad) {
	
	this.soyadý=soyad;
}
public String getSoyad() {
	return soyadý;
}
public void setCalýs_sa(int calýs_sa) {
	this.calýs_sa=calýs_sa;
}
public int getCalýs_sa() {
	return calýs_sa;
}
public void setSaat_üc(int saat_üc) {
	this.saat_üc=saat_üc;	
}
public int getSaat_üc() {
	return saat_üc;
}

public int hesap(int calýs_sa,int saat_üc) {
	if(calýs_sa>100) {
		int a=calýs_sa-100;
		return saat_üc*100 + a*25;
	}
	else return calýs_sa*saat_üc;
}
public iscisýnýfý() {
	
	adý="girilmedi";
	soyadý="girilmedi";
	calýs_sa=0;
	saat_üc=0;
}
public iscisýnýfý(String a_ad,String a_soyad,int a_calýs_sa,int a_saat_üc) {
	adý=a_ad;
	soyadý=a_soyad;
	calýs_sa=a_calýs_sa;
	saat_üc=a_saat_üc;
}

}
