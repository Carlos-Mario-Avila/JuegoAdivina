
import java.util.Scanner;

public class JuegoAdivina {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Llamado del juego
        juego(leer);
    }

    public static void juego(Scanner leer) {
        System.out.println("JUEGO ADIVINAR UN NUMERO");
        //Declaracion de variables
        int option = 0, player, number, life = 3;
        do {
            //Menu de opciones 
            System.out.println("----------------------------------");
            System.out.println("|    Selecciona una dificultad:   |");
            System.out.println("|    1. Facil                     |");
            System.out.println("|    2. Medio                     |");
            System.out.println("|    3. Dificil                   |");
            System.out.println("|    4. Legendario`               |");
            System.out.println("|    0. Salir                     |");
            System.out.println("----------------------------------");

            //Se valida que el jugador no coloque letras en las opciones
            if (leer.hasNextInt() == true) {
                option = leer.nextInt();
                switch (option) {
                    case (1):
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Nivel: Facil");
                            System.out.println("Vidas: " + life);
                            System.out.println("(Adivina un numero entre el 0 y el 5)");
                            System.out.println("Dijite el numero: ");
                            player = leer.nextInt();
                            number = (int) (Math.random() * 6);
                            if (player == number) {
                                System.out.println("----------------------------------");
                                System.out.println("*** ENHORABUANA!!! HAS ADIVINADO ***");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            } else {
                                life--;
                                System.out.println("----------------------------------");
                                System.out.println("    :( :( NUMERO INCORRECTO :( :(");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("          Vuelve a intentarlo");
                                System.out.println("----------------------------------");
                            }
                            if (life == 0) {
                                System.out.println("----------------------------------");
                                System.out.println("        :( :( GAME OVER :( :(");
                                System.out.println("      Te has quedado sin vidas");
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            }
                        }
                        break;
                    case (2):
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Nivel: Medio");
                            System.out.println("Vidas: " + life);
                            System.out.println("(Adivina un numero entre el 0 y el 10)");
                            System.out.println("Dijite el numero: ");
                            player = leer.nextInt();
                            number = (int) (Math.random() * 11);
                            if (player == number) {
                                System.out.println("----------------------------------");
                                System.out.println("*** ENHORABUANA!!! HAS ADIVINADO ***");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            } else {
                                life--;
                                System.out.println("----------------------------------");
                                System.out.println("    :( :( NUMERO INCORRECTO :( :(");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("          Vuelve a intentarlo");
                                System.out.println("----------------------------------");
                            }
                            if (life == 0) {
                                System.out.println("----------------------------------");
                                System.out.println("        :( :( GAME OVER :( :(");
                                System.out.println("      Te has quedado sin vidas");
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            }
                        }
                        break;
                    case (3):
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Nivel: Dificil");
                            System.out.println("Vidas: " + life);
                            System.out.println("(Adivina un numero entre el 0 y el 20)");
                            System.out.println("Dijite el numero: ");
                            player = leer.nextInt();
                            number = (int) (Math.random() * 21);
                            if (player == number) {
                                System.out.println("----------------------------------");
                                System.out.println("*** ENHORABUANA!!! HAS ADIVINADO ***");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            } else {
                                life--;
                                System.out.println("----------------------------------");
                                System.out.println("    :( :( NUMERO INCORRECTO :( :(");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("          Vuelve a intentarlo");
                                System.out.println("----------------------------------");
                            }
                            if (life == 0) {
                                System.out.println("----------------------------------");
                                System.out.println("        :( :( GAME OVER :( :(");
                                System.out.println("      Te has quedado sin vidas");
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            }
                        }
                        break;
                    case (4):
                        for (int i = 0; i < 4; i++) {
                            System.out.println("Nivel: Legendario");
                            System.out.println("Vidas: " + life);
                            System.out.println("(Adivina un numero entre el 0 y el 50)");
                            System.out.println("Dijite el numero: ");
                            player = leer.nextInt();
                            number = (int) (Math.random() * 51);
                            if (player == number) {
                                System.out.println("----------------------------------");
                                System.out.println("*** ENHORABUANA!!! HAS ADIVINADO ***");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            } else {
                                life--;
                                System.out.println("----------------------------------");
                                System.out.println("    :( :( NUMERO INCORRECTO :( :(");
                                System.out.println("            Numero a adivinar: " + number);
                                System.out.println("            Su numero: " + player);
                                System.out.println("          Vuelve a intentarlo");
                                System.out.println("----------------------------------");
                            }
                            if (life == 0) {
                                System.out.println("----------------------------------");
                                System.out.println("        :( :( GAME OVER :( :(");
                                System.out.println("      Te has quedado sin vidas");
                                System.out.println("----------------------------------");
                                life = 3;
                                break;
                            }
                        }
                        break;
                    case (0):
                        System.out.println(":) :) ;) GRACIAS POR JUGAR CON NOSOTROS :) :) ;)");
                        break;
                    default:
                        System.out.println("Opcion no valida");

                }
            } else {
                System.out.println("Opcion no valida");
            }
        } while (option != 0);

    }

}
