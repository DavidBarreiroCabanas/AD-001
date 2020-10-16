package codigo.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.db.DbObject;

public class Usuario extends DbObject{
	  
	private static final String TABLE = "usuario";
	private static final ArrayList COLS = getArrayCols();
	
	private int id;
	private String name;
	private int telefono;
	private String direccion;	
	
	
	private static ArrayList getArrayCols() {
		
		ArrayList lista = new ArrayList<>();
		lista.add("name");
		lista.add("telefono");
		lista.add("direccion");
		
		return lista;
	}
		
	
	@Override
	public int getId() {
		return this.id;
	}
	
	@Override
	public String getTable() {
		return TABLE;
	}
	
	@Override
	public ArrayList getCols() {
		return COLS;
	}
	
	@Override
	public ArrayList getValues() {
		ArrayList lista = new ArrayList<>();
		lista.add(this.name);
		lista.add(this.telefono);
		lista.add(this.direccion);
		
		return lista;
	}
	
	@Override
	public DbObject parse(ResultSet rs) throws SQLException {
		
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



}
