package consecuencias;

/**
 * 
 * Clase que permite crear un huevo para atarcar al los carros
 * y sumar puntos al impacatarlos. 
 *
 */
public class Huevo {
	
	private int fila;
	private int columna;
	private int puntaje;
	
	public Huevo() { 
		
	}
	
	/**
	 * Método para lanzar huevos y segun donde caigan varia el puntaje.
	 * @param matriz matriz principal
	 * @param fila posicion de la fila ingresada por el usuario
	 * @param columna posicion de la columna ingresada por el usuario
	 */
	public void lanzaHuevo(String matriz[][], int fila, int columna) {
		int puntajeDisparo = 0;
		
		//comprueva en que posicion cae para definir el puntaje
		if (matriz[fila][columna].equals("K ")) {
			matriz[fila][columna] = "H ";
			puntajeDisparo = 3;
		}else if (matriz[fila][columna].equals("C ")) {
			matriz[fila][columna] = "H ";
			puntajeDisparo = 2;
		}else if (matriz[fila][columna].equals("T ")) {
			matriz[fila][columna] = "H ";
			puntajeDisparo = 1;
		}else {
			matriz[fila][columna] = "H ";
		}		 
		this.puntaje = puntajeDisparo;
	}
	

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}
}
