package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.elementos.Heladera;
import ar.edu.utn.frba.dds.domain.elementos.Vianda;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Humano;

public class DonacionVianda extends Contribucion {
  private Vianda viandaParaDonar;
  private Heladera heladeraEnLaQueSeVaAEncontrar;

  @Override
  public void registrarContribucion() {
    heladeraEnLaQueSeVaAEncontrar.agregarVianda(viandaParaDonar);
    ((Humano) colaborador.getTipo()).setViandasDonadas(((Humano) colaborador.getTipo()).getViandasDonadas() + 1);
  }
}
