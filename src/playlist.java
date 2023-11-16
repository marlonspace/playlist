import javax.swing.*;
import java.util.Scanner;

public class playlist{
    Scanner Entrada = new Scanner(System.in);
    int Op;
    int [] canciones = new int[2];
    public void GuardarCanciones(){
        System.out.println("Digite la cancion que va a ingresar");
        for(int i=0;i<2;i++){
            System.out.println("Escriba la canción que va a Agregar: ");
            canciones[i] = Entrada.nextInt();
        }
    }
    public void MostrarCanciones(){
        System.out.println("Las canciones de la PlayList son: ");
        for (int i=0;i>2;i++){
            System.out.print(canciones[i]);
        }
    }
    public void EditarCanciones(){
        System.out.println("Digite la cancion que va a ingresar");
        for(int i=0;i<2;i++){
            System.out.println("Escriba la canción que va a Agregar: ");
            canciones[i] = Entrada.nextInt();
        }
    }
    public void casos() {
        while (Op !=4){

            System.out.print("Digite el número de la opción de lo que desea hacer:\n" +
                    "1:Guardar canciones\n" +
                    "2:Mostrar canciones\n" +
                    "3:Editar canciones\n" +
                    "4:Salir\n");
            Op = Entrada.nextInt();

            switch (Op) {
                case 1:
                    GuardarCanciones();
                    break;
                case 2:
                    MostrarCanciones();
                    break;
                case 3:
                    EditarCanciones();
            }

        }
    }
}