package Mediador;

import java.util.ArrayList;

import Componentes.Componente;
import Componentes.Nucleo;
import Componentes.Pieza;

public class mediadorNucleo implements Mediador{
	private Nucleo nucleo;
	private ArrayList<Pieza> piezas = new ArrayList();
	public boolean status;
	

	@Override
	public boolean isOkAcoplar() {
		return status;
	}

	@Override
	public boolean isOkDesacoplar() {
		return !status;
	}

	@Override
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public void registrarNucleo(Nucleo nucleo) {
		this.nucleo = nucleo;
	}

	@Override
	public void registrarPiezas(Pieza pieza) {
		piezas.add(pieza);
	}

	@Override
	public boolean isAcoplada(Pieza pieza) {
		if (piezas.contains(pieza)) {
			Pieza sPieza = piezas.get(piezas.indexOf(pieza));
			if(sPieza.status)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public boolean isDesacoplada(Pieza pieza) {
		if (piezas.contains(pieza)) {
			Pieza sPieza = piezas.get(piezas.indexOf(pieza));
			if(!sPieza.status)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}
