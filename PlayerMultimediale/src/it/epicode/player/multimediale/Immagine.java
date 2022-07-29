package it.epicode.player.multimediale;

public class Immagine extends ElementoMultimediale implements ElementoVisualizzabile {
	
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
		
	}

	@Override
	public void show() {
		
		String asterisco = ""; 
		for (int i = 0; i < luminosita; i ++) {
			asterisco += "*";
			
		}
		
		System.out.println(titolo + asterisco);
		
	}

	@Override
	public void aumentaLuminosita() {
		this.luminosita++;
		
	}

	@Override
	public void diminuisciLuminosita() {
		this.luminosita--;
		
	}

}
