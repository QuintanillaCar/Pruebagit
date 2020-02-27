Proyecto Java Fullstack Trainee.

Consecuencias: First Line vs PKS:

Se solicita desarrollar un programa que permita al usuario-jugador poder definir posiciones de lanzamiento y ejecutarlos (“lanzamiento de huevos”) dentro de una matriz en búsqueda de “carros” de diferente longitud y orientación. Los lanzamientos son ilimitados y cada acierto arroja un puntaje acumulable predeterminado y al cual se le agrega una bonificación en caso de eliminar un “carro” completo. La finalidad es cumplir con el objetivo de atacar vehículos los cuales otorgan un puntaje al finalizar

Inicio

	El jugador es bienvenido y debe indicar una coordenada de lanzamiento a través de la opción “Lanzar Huevo”. La inicialización del programa implica el posicionamiento de los “carros” en el tablero. Para identificar los objetos dentro del tablero se elaboró la siguiente clasificación:

1.	Kromis (3)

		K
		K
		K

2.	Caguanos (5)

		CC

3.	Trupallas(10) 

		T

4.	Huevos(ilimitado) = H


Desarrollo del juego
La coordenada de lanzamiento permite asignar puntaje ya sea en caso de acierto o error. Cada uno de los distintos tipos de carros tienen asignado distinto puntaje por aciertos, a saber:

1.	Kromis: Cada acierto en una de las "K" que compone una Kromi, asigna 3 puntos. Además existe una bonificación adicional de 10 puntos si eliminas una Kromi completa, es decir, si 	eliminas su tres "K" que la componen.

2.	Caguanos: Cada acierto en una de las "C" que compone un Caguano, asigna 2 puntos. Además, existe una bonificación adicional de 7 puntos si eliminas un Caguano completo, es decir, si 	eliminas sus dos "C" que lo componen.

3.	Trupallas: Cada acierto en una Trupalla, es decir, en una "T" en el tablero, asigna 1 punto. 


Esta operación se podar repetir las veces que el usuario-jugador decida. También podrá optar por visualizar el tablero con sus respectivos lanzamientos (indicados con una letra H) y  el posicionamiento de los “carros” o bien finalizar la partida con la opción “salir”.
 

Lenguaje de programación Java utilizando POO. Entorno de desarrollo Eclipse.

Desarrolladores.
Javier Neus
neusjavier@gmail.com
Germán Illanes
illanes@gmail.com
Gonzalo Escobar
gonzalo.escobar.gh@gmail.com
Carlos Quintanilla
quintanillati@gmail.com
