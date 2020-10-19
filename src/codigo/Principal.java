package codigo;
 
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.cfg.Config;
import codigo.db.DbObject;
import codigo.models.Persona;
import codigo.models.Usuario;

public class Principal {

	public static void main(String[] args) { 
				
		Config.getInstance();
		
		try {
			
			
			
			
			Persona per = new Persona();

			ArrayList lista = per.list();
			ArrayList<Persona> lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println( persona.getId() + "-Persona:"+persona.getName());
			}
			
			
			per.setName("Jose"); 
			per.setLastname("Pepito"); 
			per.insertar();
			
			
			
			//ArrayList lista = per.list();
			//ArrayList<Persona> lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println("1-Persona:"+persona.getName());
			}
			
			
			
			per.setName("PericoPalotes");
			per.setLastname("Jose");
			
			per.setId(5);
			per.update();
			
			lista = per.list();
			lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println("Persona:"+persona.getName());
			}
			
			per.delete();
			
			
		/*	
			
			Usuario user = new Usuario();
			
			user.setName("David");
			user.setDireccion("Coruna");
			user.setTelefono(23554);
			
			user.insertar();
			
			ArrayList listUser = user.list();
			ArrayList<Usuario> lista = listUser;
			for(Usuario usuario:lista) {
				System.out.println("1-Persona:"+usuario.getName());
			}
			
		*/	
			
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
