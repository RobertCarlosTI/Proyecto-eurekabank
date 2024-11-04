package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.DetalleVenta;

public class DetalleVentaDao {
	
	public List<DetalleVenta> listarDetalleVenta() {
        List<DetalleVenta> listaDetalleVenta = new ArrayList<>();
        try {
            String sql = "SELECT * FROM detalleventa";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                DetalleVenta dv = new DetalleVenta();
                dv.setCodigoVenta(rs.getInt("codigoventa"));
                dv.setCodigoProducto(rs.getInt("codigoproducto"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setDescuento(rs.getDouble("descuento"));
                listaDetalleVenta.add(dv);
            }

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
            conexionDB.cerrarResultset(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaDetalleVenta;
    }

    public void insertar(DetalleVenta detalleVenta) {
        try {
            String sql = "INSERT INTO detalleventa (codigoventa, codigoproducto, cantidad, descuento) VALUES (?, ?, ?, ?)";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, detalleVenta.getCodigoVenta());
            ps.setInt(2, detalleVenta.getCodigoProducto());
            ps.setInt(3, detalleVenta.getCantidad());
            ps.setDouble(4, detalleVenta.getDescuento());
            ps.executeUpdate();

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(DetalleVenta detalleVenta) {
        try {
            String sql = "UPDATE detalleventa SET codigoproducto=?, cantidad=?, descuento=? WHERE codigoventa=?";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, detalleVenta.getCodigoProducto());
            ps.setInt(2, detalleVenta.getCantidad());
            ps.setDouble(3, detalleVenta.getDescuento());
            ps.setInt(4, detalleVenta.getCodigoVenta());
            ps.executeUpdate();

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(Integer codigoVenta) {
        try {
            String sql = "DELETE FROM detalleventa WHERE codigoventa=?";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, codigoVenta);
            ps.executeUpdate();

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}