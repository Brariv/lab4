package View;
import Model.Usuario;
import Model.login;

import java.util.Scanner;
import Model.Plan;
import Model.Prestamo;

public class MenuUi implements Interface {
    Scanner sc = new Scanner(System.in);
        login login = new login();

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
                    seleccion();
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
        System.out.print("Ingrese un nombre de usuario: ");
        String username = sc.next();

        System.out.print("Ingrese una contraseña: ");
        String password = sc.next();

        System.out.print("Ingrese su plan (BASE o PREMIUM): ");
        String planInput = sc.next();

        Plan plan;
        try {
            plan = Plan.valueOf(planInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Plan no válido. Se asignará el plan BASE por defecto.");
            plan = Plan.BASE;
        }

        Usuario nuevoUsuario = new Usuario(username, password, plan);
    }


    @Override
    public void Login() {
        System.out.print("Ingrese su nombre de usuario: ");
        String username = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String password = sc.next();
        if (login.verify(username, password)) {
            System.out.println("¡Bienvenido!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }

    @Override
    public void Perfil() {
        System.out.print("Ingrese su nombre de usuario: ");
        String username = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String password = sc.next();
        System.out.print("Ingrese su plan (BASE o PREMIUM): ");
        String planInput = sc.next();
        login.changepriority(username, password, planInput);
    }

    @Override
    public void prestamo() {
        System.out.print("Ingrese su nombre de usuario: ");
        String username = sc.next();
        System.out.print("Ingrese el tipo de producto: ");
        String tipo = sc.next();
        System.out.print("ingrese los dias de prestamo: ");
        String dias = sc.next();
        System.out.print("ingrese la hora de entrega: ");
        String hora = sc.next();
        System.out.print("ingrese la sucursal de entrega: ");
        String sucursal = sc.next();
        System.out.print("ingrese la hora de recibir: ");
        String hora2 = sc.next();
        Prestamo.GuardarPrestamo(username, tipo, dias, hora, sucursal, hora2);

    }




    


}
