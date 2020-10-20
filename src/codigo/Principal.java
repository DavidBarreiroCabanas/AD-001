package codigo;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import codigo.cfg.Config;
import codigo.db.DbObject;
import codigo.models.Persona;
import codigo.models.Producto;
import codigo.models.Usuario;

public class Principal {

	public static void main(String[] args) { 
				
		Config.getInstance();
			
		try {
			
			Persona per = new Persona();
			Usuario user = new Usuario();
			Producto prod = new Producto();
			
			Scanner teclado = new Scanner(System.in);
			String respuesta;
			
			ArrayList lista;
			
			int opcion = 0;
			
			while ( opcion != 13 ) {
				
				System.out.println("");
				System.out.println("1 - Añade PERSONA");
				System.out.println("2 - Lista PERSONA");
				System.out.println("3 - Actualiza PERSONA");
				System.out.println("4 - Borra PERSONA");
				System.out.println("5 - Añade PRODUCTO");
				System.out.println("6 - Lista PRODUCTO");
				System.out.println("7 - Actualiza PRODUCTO");
				System.out.println("8 - Borra PRODUCTO");
				System.out.println("9 - Añade Usuario");
				System.out.println("10 - Lista USUARIO");
				System.out.println("11 - Actualiza USUARIO");
				System.out.println("12 - Borra USUARIO");
				System.out.println("13 - SALIR");
				System.out.println("");
				
				System.out.print("Seleccione una opcion = ");
				respuesta = teclado.nextLine();
				opcion = Integer.parseInt(respuesta);
				
				switch(opcion) {
				
				case 1:
					System.out.print("Dime el nombre de la persona = ");
					respuesta = teclado.nextLine();
					per.setName(respuesta);
					
					System.out.print("Dime el apellido de la persona = ");
					respuesta = teclado.nextLine();
					per.setLastname(respuesta);	
					
					per.insertar();
					System.out.println("PERSONA INSERTADA");
					break;
					
				case 2:
					lista = per.list();
					ArrayList<Persona> lista2 = lista;
					for (Persona persona : lista2) {
						System.out.println( persona.toString());
					}
					break;
					
				case 3:
					System.out.print("Dime el id de la persona que quieres modificar = ");
					respuesta = teclado.nextLine();
					per.setId(Integer.parseInt(respuesta));
					
					System.out.print("Dime el nombre de la persona = ");
					respuesta = teclado.nextLine();
					per.setName(respuesta);
					
					System.out.print("Dime el apellido de la persona = ");
					respuesta = teclado.nextLine();
					per.setLastname(respuesta);	
					
					per.update();
					System.out.println("PERSONA MODIFICADA");
					break;
				
				case 4:
					System.out.print("Dime el id de la persona que quieres eliminar = ");
					respuesta = teclado.nextLine();
					per.setId(Integer.parseInt(respuesta));
					
					per.delete();
					System.out.println("PERSONA ELIMINADA");
					break;
					
				case 5:
					System.out.print("Dime el nombre del producto = ");
					respuesta = teclado.nextLine();
					prod.setName(respuesta);
					
					System.out.print("Dime el descuento del producto XX%= ");
					respuesta = teclado.nextLine();
					prod.setDesc(respuesta);
					
					System.out.print("Dime el precio del producto = ");
					respuesta = teclado.nextLine();
					prod.setPrecio(Integer.parseInt(respuesta));
					
					System.out.print("Dime el Stock del producto = ");
					respuesta = teclado.nextLine();
					prod.setStock(Integer.parseInt(respuesta));
					
					prod.insertar();
					System.out.println("PRODUCTO INSERTADO");
					break;
					
				case 6:
					lista = prod.list();
					ArrayList<Producto> lista4 = lista;
					for (Producto producto : lista4) {
						System.out.println( producto.toString());
					}
					break;
					
				case 7:
					System.out.print("Dime el id deproducto que quieres modificar = ");
					respuesta = teclado.nextLine();
					prod.setId(Integer.parseInt(respuesta));
					
					System.out.print("Dime el nombre del producto = ");
					respuesta = teclado.nextLine();
					prod.setName(respuesta);
					
					System.out.print("Dime el descuento del producto XX%= ");
					respuesta = teclado.nextLine();
					prod.setDesc(respuesta);
					
					System.out.print("Dime el precio del producto = ");
					respuesta = teclado.nextLine();
					prod.setPrecio(Integer.parseInt(respuesta));
					
					System.out.print("Dime el Stock del producto = ");
					respuesta = teclado.nextLine();
					prod.setStock(Integer.parseInt(respuesta));
					
					prod.update();
					System.out.println("PRODUCTO MODIFICADO");					
					break;
					
				case 8:
					System.out.print("Dime el id deproducto que quieres eliminar = ");
					respuesta = teclado.nextLine();
					prod.setId(Integer.parseInt(respuesta));
					
					prod.delete();
					System.out.println("PRODUCTO ELIMINADO");
					break;
					
				case 9:
					System.out.print("Dime el nombre del usuario = ");
					respuesta = teclado.nextLine();
					user.setName(respuesta);
					
					System.out.print("Dime la direccion del usuario = ");
					respuesta = teclado.nextLine();
					user.setDireccion(respuesta);
					
					System.out.print("Dime el Tlfn del usuario = ");
					respuesta = teclado.nextLine();
					user.setTelefono(Integer.parseInt(respuesta));
					
					user.insertar();
					System.out.println("USUARIO INSERTADO");					
					break;
					
				case 10:
					lista = user.list();
					ArrayList<Usuario> lista3 = lista;
					for (Usuario usuario : lista3) {
						System.out.println( usuario.toString());
					}
					break;
					
				case 11:
					System.out.print("Dime el id del usuario que quieres modificar = ");
					respuesta = teclado.nextLine();
					user.setId(Integer.parseInt(respuesta));
					
					System.out.print("Dime el nombre del usuario = ");
					respuesta = teclado.nextLine();
					user.setName(respuesta);
					
					System.out.print("Dime la direccion del usuario = ");
					respuesta = teclado.nextLine();
					user.setDireccion(respuesta);
					
					System.out.print("Dime el Tlfn del usuario = ");
					respuesta = teclado.nextLine();
					user.setTelefono(Integer.parseInt(respuesta));					
					
					user.update();
					System.out.println("USUARIO MODIFICADO");
					break;
					
				case 12:
					System.out.print("Dime el id del usuario que quieres eliminar = ");
					respuesta = teclado.nextLine();
					user.setId(Integer.parseInt(respuesta));
					
					user.delete();
					System.out.println("USUARIO ELIMINADO");
					break;
					
				case 13:
					break;
					
				default:
					System.out.println("OPCION EQUIVOCADA");
			
				}
				
				
				
			}
			
		
			
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
