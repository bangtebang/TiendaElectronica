package TiendaElectronica;

public class Producto {
	private String nombre;
	private String descripcion;
	private int precio;
	private int stock;
	private String categoria;
	private TiendaElectronica tiendaElectronica;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Producto (String descripcion,String nombre,String categoria,int stock,int precio,TiendaElectronica tiendaElectronica) {
		this.descripcion=descripcion;
		this.nombre=nombre;
		this.stock=stock;
		this.categoria=categoria;
		this.precio=precio;
		this.tiendaElectronica=tiendaElectronica;
	}
}