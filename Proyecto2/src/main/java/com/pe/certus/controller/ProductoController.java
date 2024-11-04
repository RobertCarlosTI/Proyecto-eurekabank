package com.pe.certus.controller;

import com.pe.certus.model.Producto;
import com.pe.certus.service.ProductoService;

public class ProductoController {

public static void main(String[] args) {
		
		System.out.println("Proyecto 2");
		ProductoService productoService = new ProductoService();
		System.out.println("Lista de todos mis Productos");
		System.out.println(productoService.listarProductos());
		
		
//		System.out.println("Actualizando Producto");
//		productoService.actualizarProducto(new Producto(?,?,?));
//		System.out.println(productoService.listarProductos());
		
		System.out.println("Eliminando Producto");
		productoService.eliminarProducto(8);
		System.out.println(productoService.listarProductos());
	}
}
