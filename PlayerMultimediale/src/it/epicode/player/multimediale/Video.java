package it.epicode.player.multimediale;

public class Video extends ElementoMultimediale implements ElementoRiproducibile, ElementoVisualizzabile{
	
	private int luminosita;
	private int durata;
	private int volume;

	public Video(String titolo, int luminosita, int durata, int volume) {
		super(titolo);
		this.luminosita = luminosita;
		this.durata = durata;
		this.volume = volume;
		
	} 

	@Override
	public void play() {
		String esclamativo = "";
		String asterisco = ""; 
		for (int i = 0; i < luminosita; i ++) {
			asterisco += "*";
			
		}
        for(int i=0; i<volume; i++) {
            esclamativo += "!";
        }
        for(int i=1; i<=durata; i++) {
            System.out.println("Video:"+titolo+" "+esclamativo+ "riprodotti:"+(i+1)+"secondi, restanti altri:" + (durata-i)+"secondi"+asterisco);
            }
        System.out.println("Video Finito");
		
	}

	@Override
	public void abbassaVolume() {
		this.volume --;
		
	}

	@Override
	public void alzaVolume() {
		this.volume++;
		
	}



	@Override
	public void aumentaLuminosita() {
		this.luminosita++;
		
	}

	@Override
	public void diminuisciLuminosita() {
		this.luminosita--;
		
	}	
	
	@Override
	public void show() {
		play();
		
	}

}
