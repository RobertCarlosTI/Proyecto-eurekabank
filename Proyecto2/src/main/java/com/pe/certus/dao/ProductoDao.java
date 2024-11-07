package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.Producto;

public class ProductoDao {

	public List<Producto> listarProductos() {

		List<Producto> listaProducto = new ArrayList<>();
		try {
			String sql = "SELECT * FROM producto";
			Connection cn = conexionDB.getConexion();

			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Producto p = new Producto();
				p.setCodigoProducto(rs.getInt("codigoproducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				listaProducto.add(p);
			}

			conexionDB.cerrarConexion(cn);
			conexionDB.cerrarPreparedStatement(ps);
			conexionDB.cerrarResultset(rs);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaProducto;
	}

	public void insertar(Producto producto) {
		try {

			String sql = "INSERT INTO producto (codigoproducto,nombre,precio) VALUES (?,?,?)";
			Connection cn = conexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);

			ps.setInt(1, producto.getCodigoProducto());
			ps.setString(2, producto.getNombre());
			ps.setDouble(3, producto.getPrecio());
			ps.executeUpdate();
			conexionDB.cerrarConexion(cn);
			conexionDB.cerrarPreparedStatement(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actualizar(Producto producto) {
		try {
			String sql = "UPDATE producto SET nombre=?, precio=? WHERE codigoproducto=?";
			Connection cn = conexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, producto.getNombre());
			ps.setDouble(2, producto.getPrecio());
			ps.setInt(3, producto.getCodigoProducto());
			ps.executeUpdate();
			conexionDB.cerrarConexion(cn);
			conexionDB.cerrarPreparedStatement(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void eliminar(Integer codigoPorductop) {
		try {
			String sql = "DELETE FROM producto WHERE codigoproducto=?";
			Connection cn = conexionDB.getConexion();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setInt(1, codigoPorductop);
			ps.executeUpdate();
			conexionDB.cerrarConexion(cn);
			conexionDB.cerrarPreparedStatement(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
