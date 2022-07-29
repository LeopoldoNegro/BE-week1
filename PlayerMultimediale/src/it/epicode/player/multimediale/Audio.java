package it.epicode.player.multimediale;

public class Audio extends ElementoMultimediale implements ElementoRiproducibile {
	
	private int durata;	
	private int volume;


public Audio(String titolo, int  durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		
	}



	@Override
	public void play() {
        String esclamativo = "";
        for(int i=1; i<volume; i++) {
            esclamativo += "!";
        }
        for(int i=1; i<=durata; i++) {
            System.out.println("Canzone:"+titolo+" "+esclamativo+ "riprodotti:"+i+"secondi, restanti altri:" + (durata-i)+"secondi");
            }
        System.out.println("Canzone Finita");
		
	}



	@Override
	public void abbassaVolume() {
		this.volume--;
		
	}



	@Override
	public void alzaVolume() {
		this.volume++;
		
	}
	
	
}