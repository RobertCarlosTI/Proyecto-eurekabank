package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.VentaDao;
import com.pe.certus.model.Venta;

public class VentaService {
	private VentaDao ventaDao = new VentaDao();

    public List<Venta> listarVentas() {
        return ventaDao.listarVentas();
    }

    public void insertarVenta(Venta venta) {
        ventaDao.insertar(venta);
    }

    public void actualizarVenta(Venta venta) {
        ventaDao.actualizar(venta);
    }

    public void eliminarVenta(Integer codigoVenta) {
        ventaDao.eliminar(codigoVenta);
    }

}
