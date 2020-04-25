package com.gm.ventas;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private static final int MAX_PRODUCTO = 10;
	private static int contadorOrden;
	private int contadorProductos;
	
	public Orden() {
		this.idOrden = ++contadorOrden;
		productos = new Producto[MAX_PRODUCTO];
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < MAX_PRODUCTO) {
			productos[this.contadorProductos++] = producto;
		}else {
			System.out.println("No se pueden agregar mas de "+MAX_PRODUCTO+" productos a su orden");
			System.out.println("El siguiente producto, queda fuera de su orden ("+producto.getNombre()+")");
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i=0; i < this.contadorProductos; i++) {
			total += productos[i].getPrecio();
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("+----------------------------+");
		System.out.println("| Orden #: "+this.idOrden);
		 double totalOrden = this.calcularTotal();
		System.out.println("| Total de la orden $"+totalOrden);
		System.out.println("| Productos comprados:");
		for(int i=0; i < this.contadorProductos; i++) {
			System.out.println("| -"+productos[i].getNombre());
		}
		System.out.println("+----------------------------+");
	}

	
	
}
