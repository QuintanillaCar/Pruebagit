package consecuencias;

import java.util.*;

/**
 * 
 * Clase que crea, llena y muestra la matriz donde se realiza el juego,
 * además de hacer los lanzamientos de huevos.
 *
 */
public class Tablero {
	
	private  Carro carros[];
	private ArrayList<Integer> puntajeHuevos;
	private String matriz[][];
	private Kromi kromi ;
	private Caguano caguano ;
	private Trupalla trupalla ;	

	
	public static final int FILA = 15;
	public static final int COLUMNA = 15;

	/**
	 * Constructor por defecto
	 */
	public Tablero() {
		this.carros = new Carro[18];
		matriz = new String[FILA][COLUMNA];		
		this.puntajeHuevos = new ArrayList<>();
		this.kromi = new Kromi();
		this.caguano = new Caguano();
		this.trupalla = new Trupalla();	
	}
	
	/**
	 * Crea los 18 carros de manera aleatoria y los 
	 * guarda en el arreglo carro	
	 */
	public  void crearCarro() {		
		int aux = 0;				
		//guarda 3 Kromis en el arreglo carro
		for (Carro k : kromi.creaKromi(this.matriz)) {
			carros[aux]=k;
			aux++;
		}
		
		//guarda 5 caguanos en el arreglo carro
		for (Carro C :caguano.creaCaguano(this.matriz)) {
			carros[aux]=C;
			aux++;
		}
		
		//guarda 10 trupallas en el arreglo carro
		for (Carro T : trupalla.creaTrupalla(this.matriz)) {
			carros[aux]=T;
			aux++;
		}
	}		
		
	/**
	 * Define el lanzamiento de cada huevo y muestra el puntaje individual	
	 * @param linea posicion en la linea de la matriz
	 * @param columna posicion en la columna de la matriz
	 */
	public  void lanzarHuevo(int linea, int columna) {
		Huevo h = new Huevo();		
		h.lanzaHuevo(this.matriz, linea, columna);
		//Se van guardando todo los puntajes
		this.puntajeHuevos.add(h.getPuntaje()); 		
		
		escribir("\n", true);
		escribir("Puntaje obtenido con este lazamiento: " +( h.getPuntaje()),true);	
	}
	
	/**
	 * Muestra la matriz con todos los datos ingresados,
	 * el puntaje total acumulado y ademas, valida que los caguanos y/o
	 * los kromis sean eliminados por completo para obteneer un bono de puntos extra.
	 * 
	 */
	public void mostrarMatriz() {	 			
		//muestra la matriz
		for (int i = 0; i < matriz.length; i++) {			
			escribir("", true);		
			for (int j = 0; j < matriz.length; j++) {				
				escribir(matriz[i][j] + " ", false);				
			}			
		}	
		
		int bono = 0;
		for (int i = 0; i < 3; i++) {
			//valida si se elimina un Kromi completamente
			if(matriz[carros[i].getFila()][carros[i].getColumna()].equals("H ")&&
				matriz[carros[i].getFila()+1][carros[i].getColumna()].equals("H ")&&
				matriz[carros[i].getFila()+2][carros[i].getColumna()].equals("H ")) {
						
				bono += 10;			
				escribir("\n\nPor eliminar el Kromi número: " + (i+1) + " completo,\n"
						+ "tienes un bono de: 10pts.\n" , true);
			}		
		}	
				
		for (int i = 3; i < 8; i++) {
			//valida si se elimina un caguano completamente
			if(matriz[carros[i].getFila()][carros[i].getColumna()].equals("H ")&&
				matriz[carros[i].getFila()][carros[i].getColumna()-1].equals("H ")) {
						
				bono += 7;		
				escribir("\n\nPor eliminar el Caguano número: " + (i-2) + " completo,\n"
						+ "tienes un bono de: 7pts.\n" , true);
			}		
		}
		
		escribir("\n", true);		
		escribir("El puntaje total acumulado es: " + (bono + calculaPuntaje(puntajeHuevos)),  true);// muestra el puntaje total		
	}
	
	/**
	 * Crea la matriz vacia para ser utilizada
	 */
	public  void creaMatriz() {			
		
		for (int i = 0; i < matriz.length; i++) {					
			for (int j = 0; j < matriz.length; j++) {				
				matriz[i][j]="[]";			
			}			
		}				 
		this.matriz=  matriz;
	}
	
	/**
	 * Calcula el puntaje total de los lanzamientos de huevos
	 * @param puntaje arrayList con todos los puntajes
	 * @return retorna la suma de todos los puntajes obtenidos
	 */
	private int calculaPuntaje(ArrayList<Integer> puntaje) {	
		int puntajeTotal = 0;		
		for (Integer punto : puntaje) {			
			puntajeTotal += punto;
		}		
		return puntajeTotal;		 
	}
	

	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	public ArrayList<Integer> getPuntajeHuevos() {
		return puntajeHuevos;
	}

	public void setPuntajeHuevos(ArrayList<Integer> puntajeHuevos) {
		this.puntajeHuevos = puntajeHuevos;
	}

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}
	
	/**
	 * Muestra mensaje por pantalla
	 * @param mens mensaje para mostrar
	 * @param salto elije con salto o sin salto de línea
	 */
	public static void escribir(String mens, boolean salto) {		
		if (salto) {
			System.out.println(mens);
		}else {
			System.out.print(mens);
		}
	}

	public static int generaRamdon() {
		return (int)(Math.random()*13);
	}

	public ArrayList<Integer> getHuevos() {
		return this.puntajeHuevos;
	}

	public void setHuevos(ArrayList<Integer> huevos) {
		this.puntajeHuevos = huevos;
	}

	@Override
	public String toString() {
		return "Tablero [carros=" + Arrays.toString(carros) + ", puntajeHuevos=" + puntajeHuevos + ", matriz="
				+ Arrays.toString(matriz) + "]";
	}

}
