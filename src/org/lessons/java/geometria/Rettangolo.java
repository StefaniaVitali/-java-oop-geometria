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
	
	 private int base;
	 private int altezza;
	 
	 
	//GETTER E SETTER
	 
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}	 
	 

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
	 
	//METODO PER DISEGNARE IL RETTANGOLO
		 void rettangoloDisegno (int a, int b) {
			 
			 //disegno base superiore
			for (int i = 0; i < a; i++){
			    System.out.print("O ");
	
			}			
			System.out.println("");
			
			
			//disegno altezza 
			for (int i = 0; i < b-2; i++){	
				
			    //per ogni iterazione controlla 
			    for (int j = 0; j < a; j++) {
                   
			       //SE j è uguale a 0	stampa O + spazio
                   if (j == 0) {
                	   
                      System.out.print("O "); 
                   
                    //ALTRIMENTI SE j è uguale ad a-1	stampa O + spazio  
                   } else if (j == a-1) {
                	   
                      System.out.println("O ");  
                   
                   //ALTRIMENTI stampa due spazi 
                   }else {
                	   
                	  System.out.print("  ");
                   }
			    }
			   
			} 
			
			
			//disegno base inferionre
			for (int i = 0; i < a; i++){
			    System.out.print("O ");
	
			}
			
			
			
		 }

//CHIUSURA  CLASSE RETTANGOLO
}
