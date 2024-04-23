/*2. Creare una classe Main contenente il metodo main(), 
nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare 
un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.*/

package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		//Aprire il canale di collegamento con la tastiera
		System.out.println("Crea il tuo rettangolo");		
		Scanner input = new Scanner (System.in);
		
		//chiedere all'utente di inserire i valori di base
		System.out.println("Scegli il valore della base del tuo rettangolo");
		int num1 = input.nextInt();
//		System.out.println(num1);
		
		//chiedere all'utente di inserire l'altezza
		System.out.println("Scegli il valore dell'altezza del tuo rettangolo");
		int num2 = input.nextInt();
//		System.out.println(num2);		
		
		//istanziare il rettangolo nuovo con il costruttore
		Rettangolo mioRettangolo = new Rettangolo (num1,num2);
		
		//richiamare i metodi di calcolo di base e area e salvarli in una variabile
		int mioRettangoloPerimetro = mioRettangolo.calcolaPerimetro(num1,num2);
		System.out.println("Il perimetro del mio rettangolo è " + mioRettangoloPerimetro);
		
		int mioRettangoloArea = mioRettangolo.calcolaArea(num1,num2);
		System.out.println("L'area del mio rettangolo è " + mioRettangoloArea);
		
		
		//Chiudere il canale di collegamento con la tastiera 
	     input.close();	
		
	}
	

}
