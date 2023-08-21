package TiendaElectronica;

import java.util.ArrayList;
import TiendaElectronica.Producto;

public class TiendaElectronica {
	private String nombre;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void mostrarProductos() {
		for (Producto producto : productos) {
			producto.mostrarInformacion();
		}
	}
	public void buscarProductoNombreCategoria(String nombre,String categoria) {
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)&&producto.getCategoria().equalsIgnoreCase(categoria)) {
				producto.mostrarInformacion();
				return;
			}
		}
		System.out.println("Producto no encontrado: " + nombre+","+categoria);
	}
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	public void eliminarProducto(String nombre) {
		Producto productoEliminar = null;
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				productoEliminar = producto;
				break;
			}
		}
		if (productoEliminar != null) {
			productos.remove(productoEliminar);
			System.out.println("Producto eliminado: " + nombre);
		} else {
			System.out.println("Producto no encontrado: " + nombre);
		}
	}

	public void modificarProducto(String nombre, String nuevaDescripcion, String nuevaCategoria, int nuevoStock, int nuevoPrecio) {
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				producto.setDescripcion(nuevaDescripcion);
				producto.setCategoria(nuevaCategoria);
				producto.setStock(nuevoStock);
				producto.setPrecio(nuevoPrecio);
				System.out.println("Producto modificado: " + producto.getNombre());
				return;
			}
		}
		System.out.println("Producto no encontrado: " + nombre);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TiendaElectronica(String nombre) {
		this.nombre=nombre;
		this.productos=new ArrayList<Producto>();
	}
}