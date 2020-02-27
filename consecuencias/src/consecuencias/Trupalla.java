package consecuencias;

import java.util.Date;

/**
 * 
 * Subclase  de Carro que crea un trupalla
 *
 */
public class Trupalla extends Carro  {	
	
	private int nivelArmadura;
	private String nombreCofer;	
	
	public Trupalla() {
		
	}
	
	public  Trupalla(int fila, int columna) {
		super(fila, columna);
		
	}
	
	/**
	 * Crea 10 trupallas y valida que no se repitan en coordenadas.
	 * @param matriz matriz principal
	 * @return retorna un arreglo con 10 trupallas.
	 */
	public Trupalla[] creaTrupalla(String matriz[][]) {
		int a, b;
		Trupalla T[] = new Trupalla[10];
			
		for (int i = 0; i < 10; i++) {
			a = (int)(Math.random()*15);
			b = (int)(Math.random()*14);
			
			//valida que no caigan en la misma posicion	
			if (matriz[a][b].equals("[]") ) {
					
				T[i] = new Trupalla(a,b);//lo va guardando en el arreglo						
				matriz[a][b] = "T "; 										
			}else {
				i--;//para garantizar que solo salga del for cuando halla diez trupallas creados
			}			
		}	
		return T;		
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreCofer() {
		return nombreCofer;
	}

	public void setNombreCofer(String nombreCofer) {
		this.nombreCofer = nombreCofer;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreCofer=" + nombreCofer + ", getCantidadOcupantes()="
				+ getCantidadOcupantes() + ", getFechaDeIngreso()=" + getFechaDeIngreso() + ", getFila()=" + getFila()
				+ ", getColumna()=" + getColumna() + "]";
	}	
}
