package View;

import java.util.Scanner;

public class MenuUi implements Interface{
    Scanner sc = new Scanner(System.in);

    @Override
    public void menu(){
        System.out.println("Bienvenido a la biblioteca");
        System.out.println("1. Registrarse");
        System.out.println("2. Seleccion");
        System.out.println("3. Prestamo");
        System.out.println("4. Perfil");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");
        

    }
}
