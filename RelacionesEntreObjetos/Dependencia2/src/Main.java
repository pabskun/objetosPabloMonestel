
public class Main {
    public static void main(String[] args) {
        Persona objPersona1 = new Persona("111","Pablo");
        Persona objPersona2 = new Persona("222","Isabel");
        Vehiculo objVehiculo1 = new Vehiculo("abc-123", "Hyundai");
        Vehiculo objVehiculo2 = new Vehiculo("def-456", "Nissan", "Versa", 2020);


        //Llamadas a los métodos manejar que implementan la relación de dependencia entre Persona y Vehículo
        System.out.println(objPersona1.manejar(objVehiculo1));
        System.out.println(objPersona2.manejar(objVehiculo2));
    }
}