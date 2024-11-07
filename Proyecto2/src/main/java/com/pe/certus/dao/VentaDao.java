package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.Venta;

public class VentaDao {

	public List<Venta> listarVentas() {
        List<Venta> listaVentas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM venta";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setCodigoVenta(rs.getInt("codigoventa"));
                venta.setCliente(rs.getString("cliente"));
                venta.setFecha(rs.getDate("fecha"));
                listaVentas.add(venta);
            }

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
            conexionDB.cerrarResultset(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaVentas;
    }

    public void insertar(Venta venta) {
        try {
            String sql = "INSERT INTO venta (codigoventa, cliente, fecha) VALUES (?, ?, ?)";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, venta.getCodigoVenta());
            ps.setString(2, venta.getCliente());
            ps.setTimestamp(3, new Timestamp(venta.getFecha().getTime()));
            ps.executeUpdate();

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(Venta venta) {
        try {
            String sql = "UPDATE venta SET cliente=?, fecha=? WHERE codigoventa=?";
            Connection cn = conexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setString(1, venta.getCliente());
            ps.setTimestamp(2, new Timestamp(venta.getFecha().getTime()));
            ps.setInt(3, venta.getCodigoVenta());
            ps.executeUpdate();

            conexionDB.cerrarConexion(cn);
            conexionDB.cerrarPreparedStatement(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(Integer codigoVenta) {
        try {
            String sql = "DELETE FROM venta WHERE codigoventa=?";
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
