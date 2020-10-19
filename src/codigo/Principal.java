package codigo;
 
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.cfg.Config;
import codigo.db.DbObject;
import codigo.models.Persona;
import codigo.models.Producto;
import codigo.models.Usuario;

public class Principal {

	public static void main(String[] args) { 
				
		Config.getInstance();
		
		try {
			
			//Declaramos una persona			
			Persona per = new Persona();
			
			//listamos la persona que hay en la bd
			ArrayList lista = per.list();
			ArrayList<Persona> lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println( persona.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Creamos una Persona Nueva
			per.setName("Jose"); 
			per.setLastname("Pepito");
			per.setId(2);
			per.insertar();
			
			//Vemos que se ha creado la persona
			for (Persona persona : lista2) {
				System.out.println( persona.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//modificamos la persona creada			
			per.setName("PericoPalotes");
			per.setLastname("Jose");
			per.setId(4);
			
			//actualizamos el usuario en la bd
			per.update();
			
			//volvemos a listar las personas que hay
			for (Persona persona : lista2) {
				System.out.println( persona.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Borramos a la persona que creamos
			per.setId(5);
			per.delete();
			
			//volvemos a listar las personas que hay
			for (Persona persona : lista2) {
				System.out.println( persona.toString());
			}
			
			System.out.println( "-------------------------------");
			
			
			//Declaramos un usuario			
			Usuario user = new Usuario();
			
			//listamos los usuario que hay en la bd
			lista = user.list();
			ArrayList<Usuario> lista3 = lista;
			for (Usuario usuario : lista3) {
				System.out.println( usuario.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Creamos un Usuario Nuevo
			user.setName("David"); 
			user.setTelefono(9563214);
			user.setDireccion("Juan Florez");
			user.insertar();
			
			//Vemos que se ha creado el usuario
			for (Usuario usuario : lista3) {
				System.out.println( usuario.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//modificamos el usuario creada			
			user.setName("Pedro");
			user.setTelefono(5874);
			user.setDireccion("Ronda Nelle");
			user.setId(1);
			
			//actualizamos el usuario en la bd
			user.update();
			
			//volvemos a listar los usuarios que hay
			for (Usuario usuario : lista3) {
				System.out.println( usuario.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Borramos el usuario que creamos
			per.setId(2);
			per.delete();
			
			//volvemos a listar los usuarios que hay
			for (Usuario usuario : lista3) {
				System.out.println( usuario.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Declaramos un producto			
			Producto prod = new Producto();
			
			//listamos los productos que hay en la bd
			lista = prod.list();
			ArrayList<Producto> lista4 = lista;
			for (Producto producto : lista4) {
				System.out.println( producto.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Creamos unProducto Nuevo
			prod.setName("Alcohol"); 
			prod.setDesc("10%");
			prod.setPrecio(10);
			prod.setStock(20);
			prod.insertar();
			
			//Vemos que se ha creado el producto
			for (Producto producto : lista4) {
				System.out.println( producto.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//modificamos el producto creado			
			prod.setName("Zumito"); 
			prod.setDesc("50%");
			prod.setPrecio(30);
			prod.setStock(500);
			prod.setId(2);
			
			//actualizamos el producto en la bd
			prod.update();
			
			//volvemos a listar los productos que hay
			for (Producto producto : lista4) {
				System.out.println( producto.toString());
			}
			
			System.out.println( "-------------------------------");
			
			//Borramos el producto que creamos
			prod.setId(2);
			prod.delete();
			
			//volvemos a listar las personas que hay
			for (Producto producto : lista4) {
				System.out.println( producto.toString());
			}
			
			System.out.println( "-------------------------------");
			
			
			
		}catch(SQLException e) {
			System.out.println( e.getMessage() );
		}  

		// create a database connection

		/*
		 * 
		 * statement.executeUpdate("drop table if exists person");
		 * 
		 * statement.executeUpdate("create table person (id integer, name string)");
		 * 
		 * statement.executeUpdate("insert into person values(1, 'leo')");
		 * statement.executeUpdate("insert into person values(2, 'yui')");
		 * 
		 * 
		 * 
		 * ResultSet rs = statement.executeQuery("select * from person");
		 * while(rs.next()) { // read the result set System.out.println("name = " +
		 * rs.getString("name")); }
		 * 
		 * 
		 * //
		 */

	}

}
