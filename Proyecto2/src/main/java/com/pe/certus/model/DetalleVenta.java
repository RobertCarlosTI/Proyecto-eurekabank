package com.pe.certus.model;

public class DetalleVenta {
	private Integer codigoVenta;
    private Integer codigoProducto;
    private Integer cantidad;
    private Double descuento;

    public DetalleVenta() {
        super();
    }

    public DetalleVenta(Integer codigoVenta, Integer codigoProducto, Integer cantidad, Double descuento) {
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    // Getters y Setters
    public Integer getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(Integer codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public Integer getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Integer codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}


    @Override
    public String toString() {
        return "DetalleVenta [codigoVenta=" + codigoVenta + ", codigoProducto=" + codigoProducto +
                ", cantidad=" + cantidad + ", descuento=" + descuento + "]";
    }


}