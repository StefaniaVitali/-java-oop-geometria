/* Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria in cui inserire le classi
1. Creare una classe Rettangolo con due attributi interi: base e altezza. 
Aggiungere un opportuno costruttore con parametri. 
Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
2. Creare una classe Main contenente il metodo main(), 
nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare 
un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna 
in console il rettangolo con le sue dimensioni, come nell’immagine allegata
 * 
 * */

package org.lessons.java.geometria;

//CLASSE RETTANGOLO CON DEFINIZIONE DELLE SUE PROPRIETA'
public class Rettangolo {
	
	 public int base;
	 public int altezza;

	//COSTRUTTORE CLASSE RETTANGOLO CON I PARAMETRI NECESSARI PER COSTRUIRLO	 
	 public Rettangolo(int base, int altezza){
		 
		 this.base = base;
		 this.altezza = altezza;		 
		 
	 }
	 
	//METODO PER CALCOLARE IL PERIMETRO -> RITORNA UN INT 
	 int calcolaPerimetro (int a, int b) {
		 int perimetro = 2*a + 2*b;
		 return perimetro;
	 }
	 
	//METODO PER CALCOLARE L'AREA -> RITORNA UN INT
	 int calcolaArea (int a, int b) {
		 int area = a * b;
		 return area;
	 }

}
