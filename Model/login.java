package Model;
import java.util.ArrayList;

public class login {
    
    public boolean verify(String usuario, String password) {
        Boolean verificado = false;
        ArrayList<ArrayList<String>> users = FilesManager.readFilesCSV("users.csv");
        for (ArrayList<String> user : users) {
            if (user.get(0).equals(usuario) && user.get(1).equals(password)) {
                verificado = true;
            }else{
                verificado = false;
            }
        }
        return verificado;
    }

    public void changepriority(String usuario, String password, String plan) {
        ArrayList<ArrayList<String>> users = FilesManager.readFilesCSV("users.csv");
        for (ArrayList<String> user : users) {
            if (user.get(0).equals(usuario) && user.get(1).equals(password)) {
                user.set(2, plan);
            }
        }
        FilesManager.writeFilesCSV("users.csv", users);
    }
}
