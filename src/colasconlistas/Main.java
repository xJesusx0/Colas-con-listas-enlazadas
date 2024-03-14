package colasconlistas;

import static colasconlistas.Metodos.*;
import static colasconlistas.ListasEnlazadas.*;

public class Main {

    static Nodo cabeza = null;
    public static void main(String[] args){

        while (true) {
            
            menu();
            byte opcion = inputByte("Ingrese una opcion");

            switch (opcion) {
                case 0 -> mostrarAviso("Saliendo...");
                case 1 -> imprimirLista();
                case 2 -> iniciarLista();
                case 3 -> insertarAlFinal();
                case 4 -> eliminarPrimero();
            }

            if(opcion == 0){
                break;
            }
        }

    }
}