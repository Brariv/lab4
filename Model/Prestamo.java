package Model;
import java.util.ArrayList;

public class Prestamo {
    

    public static void GuardarPrestamo(String usuario, String producto, String dias, String horaE, String sucursal, String horap){
        ArrayList<String> prestamo = new ArrayList<>();
        prestamo.add(usuario);
        prestamo.add(producto);
        prestamo.add(dias);
        prestamo.add(horaE);
        prestamo.add(sucursal);
        prestamo.add(horap);
        FilesManager.appendlineCSV("prestamos.csv", prestamo);
    }
}
