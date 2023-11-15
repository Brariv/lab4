package View;

import java.util.Scanner;

public class MenuUi implements Interface {
    Scanner sc = new Scanner(System.in);

    @Override
    public void menu() {
        int opcion;
        
        do {
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("1. Registrarse");
            System.out.println("2. Seleccion");
            System.out.println("3. Prestamo");
            System.out.println("4. Perfil");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    Registro();
                    break;
                case 2:
                    Login();
                    break;
                case 3:
                    prestamo();
                    break;
                case 4:
                    Perfil();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 5);
    }

    @Override
    public void Registro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Registro'");
    }

    @Override
    public void Login() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Login'");
    }

    @Override
    public void Perfil() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Perfil'");
    }

    @Override
    public void prestamo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prestamo'");
    }

    @Override
    public void seleccion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seleccion'");
    }
}
