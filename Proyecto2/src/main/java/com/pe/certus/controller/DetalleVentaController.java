package com.pe.certus.controller;


import com.pe.certus.model.DetalleVenta;
import com.pe.certus.service.DetalleVentaService;


public class DetalleVentaController {
	
	public static void main(String[] args) {
		
		
//        System.out.println("Gestion de Detalle de Ventas");
//        DetalleVentaService detalleVentaService = new DetalleVentaService();

//        System.out.println("Listar todos los detalles de ventas:");
//        System.out.println(detalleVentaService.listarDetalleVenta());

//        System.out.println("Insertando nuevo detalle de venta");
//        detalleVentaService.insertarDetalleVenta(new DetalleVenta(1, 2, 10, 0.10));
//        System.out.println(detalleVentaService.listarDetalleVenta());

   //     System.out.println("Actualizando un detalle de venta");
   //     detalleVentaService.actualizarDetalleVenta(new DetalleVenta(1, 2, 15, 0.15));
   //     System.out.println(detalleVentaService.listarDetalleVenta());

   //     System.out.println("Eliminando un detalle de venta");
   //     detalleVentaService.eliminarDetalleVenta(1);
   //     System.out.println(detalleVentaService.listarDetalleVenta());
        
        System.out.println("Proyecto 2");
        DetalleVentaService detalleventaService = new DetalleVentaService();
		System.out.println("Lista de todos los Detalles de Ventas");
		System.out.println(detalleventaService.listarDetalleVenta());
		

		System.out.println("Insertando nuevo Detalle de venta");
        detalleventaService.insertarDetalleVenta(new DetalleVenta(3, 3, 90, 0.10));
        System.out.println(detalleventaService.listarDetalleVenta());
        
//		System.out.println("Actualizando los Detalles de Ventas");
//		detalleventaService.actualizarDetalleVenta(new DetalleVenta(3, 4, 100, 0.20));
//      System.out.println(detalleventaService.listarDetalleVenta());
		
/*		System.out.println("Eliminando los Detalles de Venta");
		detalleventaService.eliminarDetalleVenta(3);
		System.out.println(detalleventaService.listarDetalleVenta());

 */       
    }

}
