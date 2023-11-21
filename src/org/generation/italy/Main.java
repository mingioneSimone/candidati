package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String risposta, candidato;
		HashMap<String, Integer> candidati = new HashMap<>() {
			{

				put("Mario Rossi", 0);
				put("Franco Verdi", 0);
				put("Pino Gialli", 0);
				put("Gino Marroni", 0);

			}
		};
		
		System.out.println("i candidati disponibili sono:");
		
		for (String n : candidati.keySet()) {

			System.out.println(n);

		}

		
		do {
			System.out.println("per chi vuoi votare?");
			candidato = sc.nextLine();
			if (candidati.containsKey(candidato)) {

			}

			else {

				while (!candidati.containsKey(candidato))
					
				{

					System.out.println("candidato non disponibile riprova:");
					candidato = sc.nextLine();

				}

			}

			candidati.put(candidato, candidati.get(candidato) + 1);

			System.out.println("vuoi inserire una nuova votazione(s/n)?");

			risposta = sc.nextLine();
		} while (risposta.equals("s"));

		for (String n : candidati.keySet()) {

			System.out.println(n +": "+ candidati.get(n));

		}

		sc.close();
	}

}
