package monestel.pablo.dl;

import monestel.pablo.bl.entities.Cliente;
import monestel.pablo.bl.entities.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDao {
    public ClienteDao(){};

    public void insertar(Cliente objC) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = DataBaseConnection.getConnection();

            String query = "insert into cliente (correo, saldo, ced_persona) values(?,?,?)";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, objC.getCorreo());
            stmt.setDouble(2, objC.getSaldo());
            stmt.setString(3,objC.getCedula());

            stmt.executeUpdate();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }

    }

    public ArrayList<Cliente> listarClientes() throws Exception{
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{
            conn = DataBaseConnection.getConnection();
            String query = "select p.*, c.correo, c.saldo from persona as p inner join cliente as c on (p.cedula = c.ced_persona)";
            stmt = conn.prepareStatement(query);

            rs = stmt.executeQuery();

            while(rs.next()){
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String correo = rs.getString("correo");
                double saldo = rs.getDouble("saldo");

                Cliente objCliente = new Cliente(cedula,nombre,edad,correo,saldo);
                listaClientes.add(objCliente);
            }

        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }
        return listaClientes;
    }
}
