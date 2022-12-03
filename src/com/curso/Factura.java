package com.curso;

public class Factura implements Imprimible {
	
	private int nFactura;
	private int codigoCliente;
	
	
	public Factura(int nFactura, int codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	@Override
	public void informeCorto() {
		System.out.println("Número de factura del informe corto " + nFactura);

	}

	@Override
	public void informeLargo() {
		System.out.println("Número de factura del informe largo " + nFactura + " que corresponde al cliente " + codigoCliente);
	}

}
