package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.DetalleVentaDao;
import com.pe.certus.model.DetalleVenta;

public class DetalleVentaService {
	private DetalleVentaDao detalleVentaDao = new DetalleVentaDao();

    public List<DetalleVenta> listarDetalleVenta() {
        return detalleVentaDao.listarDetalleVenta();
    }

    public void insertarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaDao.insertar(detalleVenta);
    }

    public void actualizarDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaDao.actualizar(detalleVenta);
    }

    public void eliminarDetalleVenta(Integer codigoVenta, Integer codigoproducto) {
        detalleVentaDao.eliminar(codigoVenta, codigoproducto);
    }

}