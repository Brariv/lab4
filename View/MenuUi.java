package View;
import Model.Usuario;
import java.util.Scanner;
import Model.Plan;

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
