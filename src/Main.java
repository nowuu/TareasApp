import CONTROLLES.TareasController;
import MODELOS.Rol;
import MODELOS.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
 TareasController tareasController=new TareasController();

    tareasController.login("jose","1234");
//    tareasController.createTask("me gusta","la fruta",LocalDate.now());
    System.out.println(tareasController.getAllTask());



    }
}