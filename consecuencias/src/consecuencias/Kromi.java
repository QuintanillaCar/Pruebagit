package consecuencias;

import java.util.Date;

/**
 * 
 * Subclase de Carro que crea un Kromi
 *
 */
public class Kromi extends Carro  {	
	
	private Date añofabricacion;
	private String marca;	
	
	public Kromi() {
		
	}	
	
	public  Kromi(String matriz[][], int fila, int columna) {
		super(fila, columna);
		creaKromi(matriz);
	}
	
	public  Kromi(int fila, int columna) {
		super(fila, columna);
		
	}
	
	/**
	 * Crea 3 Kromis y valida que no se repitan en coordenadas.
	 * @param matriz matriz principal
	 * @return retorna un arreglo con 3 kromis.
	 */
	public Carro[] creaKromi(String matriz[][]) {
		int a, b;
		Kromi k[] = new Kromi[3];
		
		for (int i = 0; i < 3; i++) {							
			a = (int)(Math.random()*13);
			b = (int)(Math.random()*15);		
			
			//valida que no caigan en la misma posicion
			if (matriz[a][b].equals("[]") && matriz[a+1][b].equals("[]") && matriz[a+2][b].equals("[]")) {		
				k[i] = new Kromi(a,b);//lo va guardando en el arreglo
				
				//genera tres posiciones de manera vertical
				for (int j = 0; j < 3; j++) {						
					matriz[a][b] = "K "; 
					a++;
				}				
			}else {
				i--; //para garantizar que solo salga del for cuando halla tres kromis creados
			}				
		}					
		return k;
	}

	public Date getAñofabricacion() {
		return añofabricacion;
	}

	public void setAñofabricacion(Date añofabricacion) {
		this.añofabricacion = añofabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [añofabricacion=" + añofabricacion + ", marca=" + marca + ", getCantidadOcupantes()="
				+ getCantidadOcupantes() + ", getFechaDeIngreso()=" + getFechaDeIngreso() + ", getFila()=" + getFila()
				+ ", getColumna()=" + getColumna() + "]";
	}
}
