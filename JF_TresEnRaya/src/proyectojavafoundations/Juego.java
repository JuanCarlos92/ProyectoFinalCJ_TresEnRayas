package proyectojavafoundations;

import java.util.Scanner;

/**
 *
 * @author JuanCarlos
 */
public class Juego {

    /*Atributos privados "tablero objeto de la clase Tablero 
    y jugadorActual de tipo char"*/
    private Tablero tablero;
    private char jugadorActual;

    /*Constructor vacio "cada vez que se cree un nuevo Juego 
    se crea un tablero nuevo y jugador comienza en X"*/
    public Juego() {
        tablero = new Tablero();
        jugadorActual = 'X';
    }

    //Método para iniciar el Juego
    public void iniciar() {
        /*Bucle mientras no haya ganador ni esté lleno mostrará 
        el tablero, manejará el turno y cambiará de jugador*/
        while (!tablero.hayGanador() && !tablero.estaLleno()) {
            tablero.mostrarTablero();
            manejarTurno();
            cambiarJugador();
        }
        tablero.mostrarTablero();
        mostrarResultado();
    }

    //Método para manejar el Turno
    private void manejarTurno() {
        /*Imprime el jugador actual indicando que se introduzca 
        la fila y la columna que serán recogida con el metodo entradaUsuario*/
        System.out.println("Jugador " + jugadorActual + ", introduce tu movimiento (fila y columna): ");
        int fila = entradaUsuario("Fila");
        int columna = entradaUsuario("Columna");

        //Bucle que si la posición ya está ocupada enviará un mensaje indicandolo
        while (!tablero.ponerMarca(fila, columna, jugadorActual)) {
            System.out.println("Movimiento invalido. Intentalo de nuevo.");
            fila = entradaUsuario("Fila");
            columna = entradaUsuario("Columna");
        }
    }

    //Método para recoger la entrada que introduzca el usuario
    private int entradaUsuario(String entrada) {
        //Declaración del objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        int num;
        //Bucle para comprobar si la entrada intorducida es inválida
        while (true) {
            System.out.print(entrada + ": ");
            //Si el objeto sc contiene un numero... se recoge el numero y se almacena en 'num'
            //Si num está en rango entre 0 y 2... corta el bucle pasando a retornar el 'num'
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 0 && num < 3) {
                    break;
                    //Si no está en el rango entre 0 y 2 muestra el mensaje indicandolo
                } else {
                    System.out.println("Entrada invalida. Debe ser un numero entre 0 y 2.");
                }

                //Si el valor almacenado no es nu numero muestra el mensaje indicandolo    
            } else {
                System.out.println("Entrada invalida. Introduzca un numero.");
                sc.next();
            }
        }
        return num;
    }

    //Método que cambia de jugador entre X y O simultaneamente
    private void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    //Método para mostrar el jugador que ha ganado
    private void mostrarResultado() {
        /*Si el metodo hayGanador es true muestra por pantalla que 
        el jugadorActual ya sea X o O ha ganado*/
        if (tablero.hayGanador()) {
            System.out.println("Jugador " + (jugadorActual == 'X' ? 'O' : 'X') + " ha ganado!");

            /*Si el método retorna false entonces se indica mediante un empate*/
        } else {
            System.out.println("El juego ha terminado en empate.");
        }
    }
}
