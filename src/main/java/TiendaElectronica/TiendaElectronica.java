package TiendaElectronica;

import java.util.ArrayList;
import TiendaElectronica.Producto;

public class TiendaElectronica {
	private String nombre;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void mostrarProductos() {
		throw new UnsupportedOperationException();
	}

	public void buscarProducto() {
		throw new UnsupportedOperationException();
	}

	public void agregarProducto() {
		throw new UnsupportedOperationException();
	}

	public void eliminarProducto() {
		throw new UnsupportedOperationException();
	}

	public void realizarCompra() {
		throw new UnsupportedOperationException();
	}

	public void modificarProducto() {
		throw new UnsupportedOperationException();
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