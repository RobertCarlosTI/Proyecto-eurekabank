package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.ProductoDao;
import com.pe.certus.model.Producto;

public class ProductoService {
	
	private ProductoDao productoDao = new ProductoDao();
	
	public List<Producto> listarProductos(){
		return productoDao.listarProductos();
	}
	
	public void insertarProducto(Producto producto) {
		productoDao.insertar(producto);
	}
	
	public void actualizarProducto(Producto producto) {
		productoDao.actualizar(producto);
	}
	
	public void eliminarProducto(Integer codigoProducto) {
		productoDao.eliminar(codigoProducto);
	}
}
