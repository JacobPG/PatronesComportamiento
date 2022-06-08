package Mediador;

import Componentes.Componente;
import Componentes.Nucleo;
import Componentes.Pieza;

public interface Mediador {
	public void registrarNucleo(Nucleo nucleo);
	public void registrarPiezas(Pieza pieza);
	public boolean isOkAcoplar();
	public boolean isOkDesacoplar();
	public void setStatus(boolean status);
	public boolean isAcoplada(Pieza pieza);
	public boolean isDesacoplada(Pieza pieza);
}
