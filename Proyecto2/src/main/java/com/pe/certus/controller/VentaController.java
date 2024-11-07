package com.pe.certus.controller;

//import java.sql.Date;
import java.util.Date;

import com.pe.certus.model.Venta;
import com.pe.certus.service.VentaService;

public class VentaController {

	public static void main(String[] args) {
		

		System.out.println("Proyecto 2");
		VentaService ventaService = new VentaService();
		System.out.println("Lista de todos mis Ventas");
		System.out.println(ventaService.listarVentas());


		System.out.println("Insertando nueva venta");
        ventaService.insertarVenta(new Venta(2, "Flor", new Date()));
        System.out.println(ventaService.listarVentas());

//		System.out.println("Actualizando las Ventas");
//		ventaService.actualizarVenta(new Venta(3,"Juan",new Date()));
//		System.out.println(ventaService.listarVentas());

//		System.out.println("Eliminando la Venta");
//		ventaService.eliminarVenta(1);
//		System.out.println(ventaService.listarVentas());

    }

}
