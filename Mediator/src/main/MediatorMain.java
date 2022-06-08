package main;

import Componentes.Nucleo;
import Componentes.Pieza;
import Mediador.Mediador;
import Mediador.mediadorNucleo;

public class MediatorMain {

	public static void main(String[] args) {
		//Creo el mediador
		Mediador mediador = new mediadorNucleo();
		
		//Creo el nucleo
		Nucleo nucleo = new Nucleo(mediador);
		
		
		//Creo las piezas
		Pieza torso = new Pieza(mediador,"torso");
		Pieza brazoIzq = new Pieza(mediador,"brazoIzq");
		Pieza brazoDer = new Pieza(mediador,"brazoDer");
		Pieza piernaIzq = new Pieza(mediador,"piernaIzq");
		Pieza piernaDer = new Pieza(mediador,"piernaDer");
		Pieza casco = new Pieza(mediador,"casco");
		
		//Registro en el mediador
		mediador.registrarNucleo(nucleo);
		mediador.registrarPiezas(torso);
		mediador.registrarPiezas(brazoIzq);
		mediador.registrarPiezas(brazoDer);
		mediador.registrarPiezas(piernaIzq);
		mediador.registrarPiezas(piernaDer);
		mediador.registrarPiezas(casco);
		
		//Acoplo el nucleo
		nucleo.acoplar();
		
		//Acoplo las piezas y el nucleo recibe que fue acoplada
		torso.acoplar();
		nucleo.isPiezaAcoplada(torso);
		brazoIzq.acoplar();
		nucleo.isPiezaAcoplada(brazoIzq);
		brazoDer.acoplar();
		nucleo.isPiezaAcoplada(brazoDer);
		piernaIzq.acoplar();
		nucleo.isPiezaAcoplada(piernaIzq);
		piernaDer.acoplar();
		nucleo.isPiezaAcoplada(piernaDer);
		casco.acoplar();
		nucleo.isPiezaAcoplada(casco);
		
		//Simulo tiempo de espera
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Se activa modo desacople
		mediador.setStatus(false);
		
		//Desacopla las piezas
		casco.desacoplar();
		nucleo.isPiezaDesacoplada(casco);
		piernaDer.desacoplar();
		nucleo.isPiezaDesacoplada(piernaDer);
		piernaIzq.desacoplar();
		nucleo.isPiezaDesacoplada(piernaIzq);
		brazoDer.desacoplar();
		nucleo.isPiezaDesacoplada(brazoDer);
		brazoIzq.desacoplar();
		nucleo.isPiezaDesacoplada(brazoIzq);
		torso.desacoplar();
		nucleo.isPiezaDesacoplada(torso);
		nucleo.desacoplar();
	}

}
