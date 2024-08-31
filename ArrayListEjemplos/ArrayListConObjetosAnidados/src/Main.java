//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona objPersona = new Persona("Pablo", 37);
        objPersona.agregarMetodoPago("8888-9999-4444", "Visa");
        objPersona.agregarMetodoPago("7777-1111-6666", "MasterCard");

        //Imprimir el objeto persona completo
        System.out.println(objPersona);

        //Imprimir el primer método de pago de la persona
        System.out.println(objPersona.getTarjetas().get(0));
        System.out.println(objPersona.getTarjetas().get(1));

        //Imprimir la información del método de pago dentro de la persona
        System.out.println(objPersona.getTarjetas().get(0).getNumero());
        System.out.println(objPersona.getTarjetas().get(0).getTipo());
    }
}