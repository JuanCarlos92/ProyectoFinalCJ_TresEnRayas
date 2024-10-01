package proyectojavafoundations;

/**
 *
 * @author JuanCarlos
 */
public class Tablero {

    //Se declara un array bidimensional siendo este el tablero
    private char[][] tablero;

    /*Constructor sin parámetro para inicializar el tablero siendo 3x3
    dibujando cada posición mediante '-'*/
    public Tablero() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    //Método para mostrar el Tablero creado con Tablero()
    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Método para rellenar el tablero como haya indicado el jugador en su turno
    public boolean ponerMarca(int fila, int columna, char marca) {
        if (tablero[fila][columna] == '-') {
            tablero[fila][columna] = marca;
            return true;
        }
        return false;
    }

    //Método para comprobar si hay ganador comprobado todas las soluciones posibles
    public boolean hayGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != '-')
                    || (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != '-')) {
                return true;
            }
        }

        // Verificar diagonales
        if ((tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != '-')
                || (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != '-')) {
            return true;
        }

        return false;
    }

    /*Método para comprobar si el tablero ya está lleno retorna false 
    'en cada posición se comprueba si hay '-''*/
    public boolean estaLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
