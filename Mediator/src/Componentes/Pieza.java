package Componentes;

import Mediador.Mediador;
import Mediador.mediadorNucleo;

public class Pieza implements Componente{
	private Mediador mediador;
	private String nombre;
	public boolean status;
	
	public Pieza (Mediador mediador,String nombre) {
		this.mediador = mediador;
		this.nombre = nombre;
		this.status = false;
	}
	
	@Override
	public void acoplar() {
		if(mediador.isOkAcoplar()) {
			System.out.println("Acoplando " + nombre + "...");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.status = true;
			mediador.setStatus(true);
		}
		else
			System.out.println("Esperando a ser acoplado...");
	}
	@Override
	public void desacoplar() {
		if(mediador.isOkDesacoplar()) {
			System.out.println("Desacoplando " + nombre + "...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.status = false;
		}
		else
			System.out.println("Esperando a ser desacoplado...");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void getReady() {
		System.out.println("La pieza esta lista");
	}
}
