package muberrra;

public class silah {

	int enuzakMenzil;
	Sarjor sarjor;
	public silah(int enuzakMenzil) {
		this.enuzakMenzil=enuzakMenzil;
	}

	public void Ateset(int menzil) {
		if (menzil>enuzakMenzil) {
			System.out.println("Hedefi vuramadiniz :(  En uzak menzilden disari ates ettiniz.");
			sarjor.atesleme();
		}
		else if(sarjor==null) {
			System.out.println("Silahta sarjor yok.Lütfen sarjoru doldurunuz.");
			sarjor.sarjorDoldurma();
		}
		else {
			if(sarjor.mevcutMermi<0) {
				System.out.println("Merminiz yok. Sarjorunuz dolduruluyor.");
				sarjor.sarjorDoldurma();
			}
			else {
				System.out.println("Hedef vuruldu :)");
				sarjor.atesleme();
			}
		}
	}
}
