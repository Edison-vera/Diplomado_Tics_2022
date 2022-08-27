import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        Connection conn = conectar_bd();
        mostrarEmpleados(conn);
        System.out.println("\n--------------------------JOBS--------------------\n");
        crearPuestoTrabajo(conn,"Marketing", 2000, 8000);
        eliminarPuestoTrabajo(conn, 23);
        actualizarPuestoTrabajo(conn, 18, "Hola", 100, 5000);
        mostrarPuestoTrabajos(conn);

    }

    public static Connection conectar_bd() {
        Connection conn;
        try {
            // Crear objeto de conexión
            conn = DriverManager.getConnection("jdbc:sqlite:hr.db");

        } catch (SQLException error) {
            conn = null;
            error.printStackTrace();
            System.out.println(error.getMessage());
        }
        return conn;
    }

    public static void mostrarEmpleados(Connection conn) {
        try {
            System.out.println("Conexion exitosa a la base de datos");
            // Crear objeto Statement
            Statement statement = conn.createStatement();
            // Ejecutar consulta sql
            ResultSet result = statement.executeQuery("SELECT * FROM employees");
            // Iterar mientras tenga registros
            while (result.next()) {
                // Obtener los datos del ResultSet
                int id = result.getInt("employee_id");
                String nombre = result.getString("first_name");
                String apellido = result.getString("last_name");
                // Mostrar información en consola
                String info = "Id: " + id;
                info += "\nNombre: " + nombre;
                info += "\nApellido: " + apellido;
                info += "\n-------------------------------\n";
                System.out.println(info);
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public static void crearPuestoTrabajo(Connection conn, String job_title,int min_salary,int max_salary ) {
        try {
            // Estructura del QUERY
            String query = "INSERT INTO jobs(job_title, min_salary, max_salary) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            // Setear los signos de interrogación / indicar los valores que tendrá el query
            ps.setString(1, job_title);
            ps.setDouble(2, min_salary);
            ps.setDouble(3, max_salary);
            // Ejecutar consulta
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarPuestoTrabajos(Connection conn) {
        try {
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM jobs");
            while (result.next()) {
                System.out.println("Job title: " + result.getString("job_title"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo para eliminar un puesto de trabajo por id
    public static void eliminarPuestoTrabajo (Connection conn, int job_id){
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM jobs WHERE job_id =?");
            ps.setInt(1, job_id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //Actualizar puesto de
    
    //Actualizar puesto de trabajo
    public static void actualizarPuestoTrabajo(Connection conn, int job_id, String job_title, int min_salary, int max_salary ){
            
        try {
            // Estructura del QUERY
            PreparedStatement ps = conn.prepareStatement("UPDATE jobs SET job_title = ?, min_salary = ?,max_salary = ? WHERE job_id = ?");
            // Setear los signos de interrogación / indicar los valores que tendrá el query
            ps.setString(1, job_title);
            ps.setDouble(2, min_salary);
            ps.setDouble(3, max_salary);
            ps.setInt(4, job_id); 
            // Ejecutar consulta
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}