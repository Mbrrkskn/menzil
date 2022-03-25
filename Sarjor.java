package muberrra;

public class Sarjor {
	int mermiSayisi;
	int mevcutMermi;
	public Sarjor(int mermiSayisi,int mevcutMermi) {
		this.mermiSayisi=mermiSayisi;
		this.mevcutMermi=mevcutMermi;
	}
	
	public void atesleme() {
		if(mevcutMermi==0) {
			System.out.println("Merminiz bitti. Sarjor degistiriniz.");	
		}
		else {
			mevcutMermi--;
			System.out.println("Atis yapildi. Mermi sayiniz:" +mevcutMermi);
		}
	}
	
	public void sarjorDoldurma(){
		mevcutMermi=mermiSayisi;
		System.out.println("Sarjor dolduruldu.Mermi sayiniz:"+mevcutMermi);	
	}

}

