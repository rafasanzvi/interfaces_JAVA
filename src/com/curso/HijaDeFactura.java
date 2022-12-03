package com.curso;

public class HijaDeFactura extends Factura implements Imprimible {

	public HijaDeFactura(int nFactura, int codigoCliente) {
		super(nFactura, codigoCliente);
		// TODO Auto-generated constructor stub
	} //El extends siempre se pone antes que el implements, porque yo puedo implementar de varias interfaces

	

}
