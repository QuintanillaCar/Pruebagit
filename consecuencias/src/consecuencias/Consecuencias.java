package consecuencias;

import java.util.Scanner;

/**
 * Clase ejecutable 
 *  @author Carlos Quintanilla--- Javier Neus--- Gonzalo Escobar --- Germán Illanes
 *
 */
public class Consecuencias {
	
	/**
	 * Método de la clase Consecuencias que ejecuta el programa a travez de un menú,
	 * para elejir hacer un lanzamiento y obtener puntos o también acceder 
	 * a la matriz principal. 
	 *
	 */

	public static void main(String[] args) {		
		
		Tablero tablero = new Tablero();
		tablero.creaMatriz();//Crea la mtriz vacía
		tablero.crearCarro();//Agrega los 18 carros aleatorios
		int op = 0, fila = 0, columna =0;
		
		escribir("Bienvenido al juego coincidencias...!!!\n \nIntroduce una coordenada,"
				+ " primero la fila y luego la columna. Trata de acertar a los vehiculos de la PKS", true);
		
		do {//Muestra el menú hasta que el jugardo quiera salir.
			op = muestraMenu();	
			
			switch (op) {
			case 1:
				fila = pideNumero("Introduce un número para la fila: (entre 0 y 14)", true);
				columna = pideNumero("Introduce un número para la columna: (entre 0 y 14)", true);
				tablero.lanzarHuevo(fila, columna);
				break;	
				
			case 2:				
				tablero.mostrarMatriz();
				break;
				
			case 3:
				escribir("\n Gracias por jugar", true);
				break;
	
			default:
				escribir("Opcion incorrecta...", true);
				break;
			}
			
		} while (op != 3);		
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
	
	/**
	 * Pide un número de tipo entero
	 * @param mens uso del número solicitado 
	 * @param salto con o sin salto de linea (para el mensaje)
	 * @return devuelve el numero ingresado por el usuario
	 */
	public static int pideNumero(String mens , boolean salto) {
		escribir(mens ,salto);
		int numero = 0;
		boolean salida = false;
		
		do { 
			try { // validar que solo introduzca números				
				Scanner n = new Scanner(System.in);			
					numero =  n.nextInt();
					
					// para validar que ingrese un numero entre 0 14
					if (numero >= 0 && numero <= 14) {
						salida = true;
					}else {
						escribir("Ingresa un número entre 0 y 14", true);
					}
					
			} catch (Exception e) {
				escribir("Ingresa Un valor numérico entre 0 y 14", true);
			}			
		} while (!salida);		
		return numero;
	}
	
	/**
	 * Muestra el menú de opciones 
	 * @return devuelve el valor de la opcion elegida
	 */
	public static int muestraMenu() {				
		escribir("", true);
		escribir("", true);
		
		escribir("Menú", true);
		escribir("", true);
		
		escribir(" 1-.Lanzar huevo\n 2-.Mostrar tablero\n 3-.Salir", true);
		
		int op = 0;
		try {//validar que solo se introduzcan números
			Scanner n = new Scanner(System.in);
			op =  n.nextInt();			
		} catch (Exception e) {
			escribir("Ingresa un valor válido...", true);
		}		
		return op;		
	}	
}
