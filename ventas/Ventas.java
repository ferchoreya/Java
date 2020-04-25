package ventas;

import com.gm.ventas.*;

public class Ventas {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Camisa",100);
		Producto producto2 = new Producto("Pantalon",50);
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		
		orden1.mostrarOrden();
		
		Producto producto3 = new Producto("Saco",350);
		Producto producto4 = new Producto("Conjunto Deportivo",250);
		Producto producto5 = new Producto("Zapatos",180);
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto1);
		orden2.agregarProducto(producto3);
		orden2.agregarProducto(producto4);
		orden2.agregarProducto(producto5);
		
		orden2.mostrarOrden();

		Producto producto6 = new Producto("Corbata",350);
		Producto producto7 = new Producto("Traje Sastre",250);
		Producto producto8 = new Producto("Short",180);
		Producto producto9 = new Producto("Bermudas",350);
		Producto producto10 = new Producto("Sandalias",250);
		Producto producto11 = new Producto("Cinturon",180);
		Producto producto12 = new Producto("Tenis",180);
		Orden orden3 = new Orden();
		orden3.agregarProducto(producto1);
		orden3.agregarProducto(producto2);
		orden3.agregarProducto(producto3);
		orden3.agregarProducto(producto4);
		orden3.agregarProducto(producto5);
		orden3.agregarProducto(producto6);
		orden3.agregarProducto(producto7);
		orden3.agregarProducto(producto8);
		orden3.agregarProducto(producto9);
		orden3.agregarProducto(producto10);
		orden3.agregarProducto(producto11);
		orden3.agregarProducto(producto12);
		
		orden3.mostrarOrden();
	}

}
