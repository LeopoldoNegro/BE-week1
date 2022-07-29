package it.epicode.player.multimediale;

import java.util.Scanner;

public class Program {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		System.out.println("scegli l'elemento");
		
		ElementoMultimediale[] m = new ElementoMultimediale[6];
		System.out.println(m.length);
		
		creazioneArray(m);
		
		scegliElementoMultimediale(m);
		
		
		
			
		}
	private static void scegliElementoMultimediale(ElementoMultimediale[] m) {
		for(int i =0; i<5; i++) {
			System.out.println("Creazione oggetto multimediale n:"+ (i + 1)+"/5");
			System.out.println("Tipo");
			System.out.println("(1=audio)");
			System.out.println("(2=video)");
			System.out.println("(3=immagine)");
			int tipologia = Integer.parseInt(scanner.nextLine());
			if(tipologia == 1) {
				System.out.println("Titolo di brano");
				String titolo = scanner.nextLine();
				System.out.println("Volume");
				int volume = Integer.parseInt(scanner.nextLine());
				System.out.println("Durata");
				int durata = Integer.parseInt(scanner.nextLine());
				Audio x = new Audio(titolo, volume, durata);
				m[i] = x;
			}else if(tipologia==2) {
				System.out.println("Titolo del video");
				String titolo = scanner.nextLine();
				System.out.println("Luminosità");
				int lum = Integer.parseInt(scanner.nextLine());
				System.out.println("Durata");
				int durata = Integer.parseInt(scanner.nextLine());
				System.out.println("Volume");
				int volume = Integer.parseInt(scanner.nextLine());
				Video x = new Video(titolo, lum, durata, volume);
				m[i] = x;
			}else {
				System.out.println("Titolo dell'immagine");
				String titolo = scanner.nextLine();
				System.out.println("Luminosità");
				int lum = Integer.parseInt(scanner.nextLine());
				Immagine x = new Immagine(titolo, lum);
				m[i]=x;
				
			}
			System.out.println(m[i].titolo);
			
		}
		
		
	}
	private static void creazioneArray(ElementoMultimediale[] m) {
		int elementoMedia=0;
		do {
			System.out.println("cosa vuoi riprodurre? digita un numero da 1 a 5 oppure 0 per terminare la riproduzione");
			elementoMedia = Integer.parseInt(scanner.nextLine());
			int el=5;
			if(elementoMedia == 1){el = 0;};
			if(elementoMedia == 2){el = 1;};
			if(elementoMedia == 3){el = 2;};
			if(elementoMedia == 4){el = 3;};
			if(elementoMedia == 5){el = 4;};
			if(elementoMedia == 0){System.out.println("Fine riproduzione");};
			if(m[el] instanceof Immagine && el > -1) {m[el].show();}
			
			else if(m[el] instanceof Audio || m[el] instanceof Video) {m[el].play();}
		}while(elementoMedia!=0);
	}
		
	}
	

	

