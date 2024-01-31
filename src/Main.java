import CONTROLLES.TareasController;
import MODELOS.User;

public class Main {
    public static void main(String[] args) {
        TareasController tareasController=new TareasController();
        System.out.println(tareasController.login("admin","12wert34"));
        System.out.println(tareasController.getUserLogged().toString());

    }
}