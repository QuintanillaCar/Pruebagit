package consecuencias;

import java.util.Date;

/**
 * 
 * Subclase  de Carro que crea un caguano
 *
 */
public class Caguano extends Carro  {
	
	private Date alcanceDetiro;
	private String color;

	
	public Caguano() {
		
	}
	
	public Caguano(String[][] matriz) {
		creaCaguano(matriz);
	}
	
	public  Caguano(int fila, int columna) {
		super(fila, columna);
		
	}
	
	/**
	 * Crea 2 caguanos y valida que no se repitan en coordenadas.
	 * @param matriz matriz principal
	 * @return retorna un arreglo con 2 caguanos.
	 */
	public Caguano[] creaCaguano(String matriz[][]) {		
		int a, b;
		Caguano c[] = new Caguano[5];
		
		for (int i = 0; i < 5; i++) {		
			a = (int)(Math.random()*15);
			b = (int)(Math.random()*14);
			
			//valida que no caigan en la misma posicion	
			if (matriz[a][b].equals("[]") && matriz[a][b+1].equals("[]")) {
				
				//genera dos posiciones de manera horizontal
				for (int j = 0; j < 2; j++) {
					c[i] = new Caguano(a,b);//lo va guardando en el arreglo						
					matriz[a][b] = "C "; 
					b++;
				}					
			}else {
				i--;//para garantizar que solo salga del for cuando halla cinco caguanos creados
			}
		}		
		return c;
	}
	
	public Date getAlcanceDetiro() {
		return alcanceDetiro;
	}
	public void setAlcanceDetiro(Date alcanceDetiro) {
		this.alcanceDetiro = alcanceDetiro;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Caguano [alcanceDetiro=" + alcanceDetiro + ", color=" + color + ", getCantidadOcupantes()="
				+ getCantidadOcupantes() + ", getFechaDeIngreso()=" + getFechaDeIngreso() + ", getFila()=" + getFila()
				+ ", getColumna()=" + getColumna() + "]";
	}
}
