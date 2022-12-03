package com.curso;

public class Pagina implements Imprimible {
	
	private int nPaginas;
	private int nLineas;
	
	

	public Pagina(int nPaginas, int nLineas) {
		super();
		this.nPaginas = nPaginas;
		this.nLineas = nLineas;
	}
	
	

	@Override
	public void informeCorto() {
		
		System.out.println("El informe corto tiene " + nPaginas + " paginas."); //Como estoy dentro de la propia clase no tengo porque poner el this
	}

	@Override
	public void informeLargo() {
		
		System.out.println("El informe largo tiene " + nPaginas + " paginas " + "y " + nLineas + " lineas.");
	}

}
