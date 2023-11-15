package Model;
import java.util.ArrayList;

public class Registro {
    

    public static Usuario nuevousuario(String nombre, String contrasena, Plan plan) {
        Usuario usuario = new Usuario(nombre, contrasena, plan);
        ArrayList<String> newUser = new ArrayList<String>();
        newUser.add(nombre);
        newUser.add(contrasena);
        newUser.add(usuario.getPlan().toString());
        FilesManager.appendlineCSV("usuarios.csv", newUser);
        return usuario;
    }
}
