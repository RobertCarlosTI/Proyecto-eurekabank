package com.pe.certus.model;

//import java.sql.Date;
import java.util.Date;

public class Venta {
	private Integer codigoVenta;
    private String cliente;
    private Date fecha;

    public Venta() {
        super();
    }

    public Venta(Integer codigoVenta, String cliente, Date fecha) {
        this.codigoVenta = codigoVenta;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Integer getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(Integer codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


    @Override
    public String toString() {
        return "Venta [codigoVenta=" + codigoVenta + ", cliente=" + cliente + ", fecha=" + fecha + "]";
    }


}
