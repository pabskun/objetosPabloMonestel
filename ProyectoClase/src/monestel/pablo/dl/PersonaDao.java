package monestel.pablo.dl;

import monestel.pablo.bl.entities.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonaDao {
    public PersonaDao(){}

    public void insertar(Persona objP) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = DataBaseConnection.getConnection();

            String query = "insert into persona(cedula,nombre,edad) values(?,?,?)";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, objP.getCedula());
            stmt.setString(2, objP.getNombre());
            stmt.setInt(3,objP.getEdad());

            stmt.executeUpdate();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }

    }

    public ArrayList<Persona> listarPersonas() throws Exception{
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{
            conn = DataBaseConnection.getConnection();
            String query = "select * from persona";
            stmt = conn.prepareStatement(query);

            rs = stmt.executeQuery();

            while(rs.next()){
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");

                Persona objP = new Persona(cedula,nombre,edad);
                listaPersonas.add(objP);
            }

        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }
        return listaPersonas;
    }
}
