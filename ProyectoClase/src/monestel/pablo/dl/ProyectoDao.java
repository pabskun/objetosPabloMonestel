package monestel.pablo.dl;

import monestel.pablo.bl.entities.Cliente;
import monestel.pablo.bl.entities.Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProyectoDao {
    public ProyectoDao() {}

    public Proyecto buscarPorId(int id) throws Exception {
        Proyecto proyectoEncontrado = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            conn = DataBaseConnection.getConnection();
            String query ="select * from proyecto where id = ?";

            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if(rs.next()){
                int idProyecto = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double costo = rs.getDouble("costo");

                proyectoEncontrado = new Proyecto(idProyecto, nombre, costo);
            }

        }catch(Exception e){
            throw new Exception (e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }
        return  proyectoEncontrado;
    }

    public void asociarProyectoACliente(Cliente cliente, Proyecto proyecto) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = DataBaseConnection.getConnection();

            String query = "insert into proyectos_cliente (correo_cliente, id_proyecto) values(?,?)";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, cliente.getCorreo());
            stmt.setInt(2, proyecto.getId());


            stmt.executeUpdate();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            DataBaseConnection.closeConnection(conn);
        }
    }
}
