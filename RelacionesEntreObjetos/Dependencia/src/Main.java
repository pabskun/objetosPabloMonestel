public class Main {
    public static void main(String[] args) {
        Persona objP1 = new Persona("111", "Pablo");
        Persona objP2 = new Persona("222", "Paula", 29, 'F');

        //Llamada al método que ejecuta la dependencia
        System.out.println(objP1.jugar(objP2));

    }
}