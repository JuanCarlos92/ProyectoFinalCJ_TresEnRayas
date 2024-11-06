# Tres en Raya - Proyecto Java

Este proyecto consiste en el desarrollo de un juego de Tres en Raya (Tic-Tac-Toe) en Java, realizado en el entorno de NetBeans 21 como parte de las prácticas del primer año de DAM. En este juego, dos jugadores (X y O) se turnan para colocar sus marcas en una cuadrícula de 3x3, y el primero en lograr tres en línea (horizontal, vertical o diagonal) es el ganador.

## Características del Proyecto

- **Lenguaje**: Java
- **Entorno de desarrollo**: NetBeans 21
- **Clases principales**:
  - `Juego`: Contiene la lógica del juego, gestionando los turnos y el cambio de jugadores.
  - `Tablero`: Representa la cuadrícula del juego y controla las posiciones de las marcas, así como la verificación de un ganador.
  - `TresEnRayas`: Clase principal que ejecuta el juego, iniciando el flujo desde el método `main`.

## Descripción de las Clases

### Clase `Juego`
Esta clase gestiona el flujo del juego, incluyendo:
- Cambios de turno entre los jugadores "X" y "O".
- Solicitud de entrada al usuario para seleccionar una posición (fila y columna).
- Verificación de si un jugador ha ganado o si se ha producido un empate.

### Clase `Tablero`
Esta clase representa la cuadrícula 3x3 y ofrece métodos para:
- Colocar la marca del jugador en las posiciones elegidas.
- Comprobar si existe un ganador revisando filas, columnas y diagonales.
- Verificar si el tablero está lleno para determinar un empate.

### Clase `TresEnRayas`
La clase principal que inicializa y ejecuta el juego:
- Crea una instancia de `Juego` y llama a su método `iniciar()` para comenzar la partida.

## Ejecución del Proyecto

1. **Abrir en NetBeans**: Clona este repositorio y ábrelo en NetBeans 21.
2. **Compilar y Ejecutar**: Ejecuta la clase `TresEnRayas` para iniciar el juego.
3. **Jugar**: Sigue las instrucciones que aparecen en la consola para ingresar las coordenadas de cada movimiento.

## Instrucciones del Juego

1. El juego comienza con un tablero vacío.
2. Los jugadores se turnarán para introducir las coordenadas de fila y columna donde quieren colocar su marca (X o O).
3. Si un jugador logra tres marcas seguidas, el juego anuncia un ganador.
4. Si todas las casillas se llenan sin un ganador, el juego termina en empate.


## Contribuciones

Este proyecto es parte de una práctica educativa. No obstante, cualquier sugerencia para mejorar la estructura o lógica del juego es bienvenida.

## Autor

Desarrollado por Juan Carlos Filter Martín para el curso de Fundamentos Java de Programación.
