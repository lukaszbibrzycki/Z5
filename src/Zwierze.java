
public abstract class Zwierze implements Odglosy{
	private String imie;
	private int wiek;
	
	public String getImie() {
		return imie;
	}

	public int getWiek() {
		return wiek;
	}

	public Zwierze(String imie, int wiek) {
		super();
		this.imie = imie;
		this.wiek = wiek;
	}
	
}
