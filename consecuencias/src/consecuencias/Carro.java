package consecuencias;

import java.util.Date;

/**
 * 
 * Superclase de Kromi, caguano y trupalla que permite instanciar
 * varios carros con diferentes caracteristicas
 *
 */
public class Carro {

	private int cantidadOcupantes;
	private Date fechaDeIngreso;
	private int fila;
	private int columna;
	
	
	public Carro() {
		
	}
	
	public Carro(int fila, int columna) {		
		this.fila = fila;
		this.columna = columna;
		this.fechaDeIngreso = new Date();
	}
		
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
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

	public void muestraDatos() {
		
	}

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaDeIngreso=" + fechaDeIngreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}
}
