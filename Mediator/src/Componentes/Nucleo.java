package Componentes;

import Mediador.Mediador;
import Mediador.mediadorNucleo;

public class Nucleo implements Componente {
	private Mediador mediador;
	public boolean status;
	
	public Nucleo (Mediador mediador) {
		this.mediador = mediador;
		this.status = false;
		mediador.setStatus(true);
	}
	
	@Override
	public void acoplar() {
		if(mediador.isOkAcoplar()) {
			System.out.println("Acoplando nucleo...");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Nucleo Acoplado");
			this.status = true;
			mediador.setStatus(true);
		}
		else
			System.out.println("Esperando a ser acoplado...");
	}
	@Override
	public void desacoplar() {
		if(mediador.isOkDesacoplar()) {
			System.out.println("Desacoplando nucleo...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Nucleo Desacoplado");
			this.status = false;
			mediador.setStatus(false);
		}
		else
			System.out.println("Esperando a ser desacoplado...");
	}
	
	public void isPiezaAcoplada(Pieza pieza) {
		if (mediador.isAcoplada(pieza)) 
			System.out.println(pieza.getNombre() + " acoplado");
		else
			System.out.println(pieza.getNombre() + " no ha sido acoplado");
	}
	
	public void isPiezaDesacoplada(Pieza pieza) {
		if (mediador.isDesacoplada(pieza)) 
			System.out.println(pieza.getNombre() + " desacoplado");
		else
			System.out.println(pieza.getNombre() + " no ha sido desacoplado");
	}
}
