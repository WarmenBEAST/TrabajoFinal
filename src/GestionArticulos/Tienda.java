package GestionArticulos;
import java.util.ArrayList;
/*
 * SGB 09/04/2024
 */

public class Tienda {
	//Atributos
	private String nombre;
	private String localidad;
	private String nif;
	//Matriz mejorada = ArrayList
	ArrayList<Articulo> listadoArticulo = new ArrayList<Articulo>();
	
	//Metodos
	/**
	 * Metodo que sirve para anyadir nuevos articulos a la lista, si el articulos que se intenta poner 
	 * ya existe, lanza error
	 * @param articuloNuevo
	 */
	public void anyadirArticulo(Articulo articuloNuevo) {
		//Insertamos el articulo en el ArrayList
		//Este int servira para decirle al programa si existe el articulo
		int proceso= 0;
		try {
			//Aqui hay que recorrer la lista para ver si este articulo exite
			//Si se da el caso, no se actualiza
			for (Articulo i: listadoArticulo) {
				if (i.equals(articuloNuevo))
					proceso = 1;
				else proceso = 0;
			}
			//Si el proceso de eleccion detecto que hay coincidencias, saca error
			if (proceso == 1)
				throw new Exception("Este artículo ya existe");
			else listadoArticulo.add(articuloNuevo);
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}
	/**
	 * Metodo que sera usado para eliminar un articulo de la lista,
	 * si este articulo no existe, se lanza una exepcion
	 * @param articuloEliminar
	 */
	public void eliminarArticulo(Articulo articuloEliminar) {
		int proceso= 0;
		try {
			//Aqui hay que recorrer la lista para ver si este articulo no existe
			//Si detecta que existe, lo elimina
			for (Articulo i: listadoArticulo) {
				if (i.equals(articuloEliminar))
					proceso = 1;
				else proceso = 0;
			}
			//Si el proceso de eleccion detecto que hay coincidencias, saca error
			if (proceso == 0)
				throw new Exception("Este artículo no existe");
			else listadoArticulo.remove(articuloEliminar);
		} catch (Exception e) {
			System.out.println("Error");
		}
		
	}
	
	public void mostrarArticulosCateg(Articulo tipoCategoria) {
		//Puede ser que funcione
		for (Articulo i: listadoArticulo) {
			if (tipoCategoria.equals("ALIMENTACION")) {
				System.out.println(i.ALIMENTACION);
			} else if (tipoCategoria.equals("TEXTIL")) {
				System.out.println(i.TEXTIL);
			}else if (tipoCategoria.equals("HOGAR")) {
				System.out.println(i.HOGAR);
			}else if (tipoCategoria.equals("BAZAR")) {
				System.out.println(i.BAZAR);
			} else {
				System.out.println("No existe esa categoria");
			}
		}
	}
	
}
