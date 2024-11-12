package monestel.pablo.bl.logic;

import monestel.pablo.bl.entities.Cliente;
import monestel.pablo.bl.entities.Persona;
import monestel.pablo.bl.entities.Proyecto;
import monestel.pablo.dl.ClienteDao;
import monestel.pablo.dl.PersonaDao;
import monestel.pablo.dl.ProyectoDao;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    private PersonaDao personaDao = new PersonaDao();
    private ClienteDao clienteDao = new ClienteDao();
    private ProyectoDao proyectoDao = new ProyectoDao();

    public String agregarPersona(String cedula, String nombre, int edad ){
        String msj = "";
        try{
            if(buscarPersona(cedula) == null){
                Persona objP = new Persona(cedula, nombre, edad);
                //listaPersonas.add(objP);
                personaDao.insertar(objP);
                msj = "\u001B[32m Persona agregada con exito \u001B[0m";
            }else{
                msj = "\u001B[31m No se pudó registrar la persona debido a que ya existe una persona con la cédula: " + cedula + "\u001B[0m";
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return msj;
    }

    public ArrayList<Persona> obtenerListaPersonas() throws Exception {
        return personaDao.listarPersonas();
    }

    public Persona buscarPersona(String cedula) throws Exception {
        Persona objPEncontrado = null;
        for(Persona objP : personaDao.listarPersonas()){
            if(objP.getCedula().equals(cedula)){
                objPEncontrado = objP;
            }
        }
        return objPEncontrado;
    }

    public int buscarIndicePersona(String cedula) throws Exception {
        int indiceEncontrado = -1;
        ArrayList<Persona> listaPersonas = personaDao.listarPersonas();
        for(int i = 0; i<listaPersonas.size(); i++){
            if(listaPersonas.get(i).getCedula().equals(cedula)){
                indiceEncontrado = i;
            }
        }
        return indiceEncontrado;
    }

    public String eliminarPersona(String cedula) throws Exception {
        int i = buscarIndicePersona(cedula);
        String msj = "";
        if(i != -1){
            listaPersonas.remove(i);
            msj = "\u001B[32m Persona eliminada con exito \u001B[0m";
        }else{
        msj = "\u001B[31m No se pudó eliminar la persona debido a que no existe una persona con la cédula: " + cedula + "\u001B[0m";
        }
        return msj;
    }

    public String agregarCliente(String cedula, String nombre, int edad, String correo, double saldo){
        String msj;
        try{
            agregarPersona(cedula, nombre, edad);
            Cliente objCliente = new Cliente(cedula,nombre, edad,correo, saldo);
            clienteDao.insertar(objCliente);
            msj = "Cliente registrado con exito";
        }catch(Exception e){
            msj = "Cliente no se logró registrar";
            System.out.println(e.getMessage());
        }

        return msj;
    }
    public ArrayList<Cliente> obtenerListaClientes() throws Exception {
        return clienteDao.listarClientes();
    }
    public Cliente buscarClientePorCedula(String cedula) throws Exception {
        Cliente objCliente = null;
        try{
            objCliente = clienteDao.buscarPorCedula(cedula);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return objCliente;
    }
    public Proyecto buscarProyectoPorId(int id) throws Exception {
        Proyecto objProyecto = null;
        try{
            objProyecto = proyectoDao.buscarPorId(id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return objProyecto;
    }
    public String asociarProyectoACliente(String cedulaCliente, int idProyecto){
        String msj = "";
        try{
            Cliente objCliente = buscarClientePorCedula(cedulaCliente);
            Proyecto objProyecto = buscarProyectoPorId(idProyecto);

            proyectoDao.asociarProyectoACliente(objCliente,objProyecto);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return msj;
    }
}
