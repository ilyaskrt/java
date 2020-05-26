
public class iscisınıfı {

	private String adı, soyadı;
	private int calıs_sa, saat_üc;


public void setAd(String ad) {
this.adı=ad;
}
public String getAd() {
	return adı;
}
public void setSoyad(String soyad) {
	
	this.soyadı=soyad;
}
public String getSoyad() {
	return soyadı;
}
public void setCalıs_sa(int calıs_sa) {
	this.calıs_sa=calıs_sa;
}
public int getCalıs_sa() {
	return calıs_sa;
}
public void setSaat_üc(int saat_üc) {
	this.saat_üc=saat_üc;	
}
public int getSaat_üc() {
	return saat_üc;
}

public int hesap(int calıs_sa,int saat_üc) {
	if(calýs_sa>100) {
		int a=calýs_sa-100;
		return saat_üc*100 + a*25;
	}
	else return calıs_sa*saat_üc;
}
public iscisınıfı() {
	
	adý="girilmedi";
	soyadý="girilmedi";
	calýs_sa=0;
	saat_üc=0;
}
public iscisınıfı(String a_ad,String a_soyad,int a_calıs_sa,int a_saat_üc) {
	ası=a_ad;
	soyadı=a_soyad;
	calıs_sa=a_calıs_sa;
	saat_üc=a_saat_üc;
}

}
