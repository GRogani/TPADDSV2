package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.elementos.Heladera;
import ar.edu.utn.frba.dds.domain.elementos.Vianda;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Humano;

public class RedistribucionViandas extends Contribucion {
  private Heladera heladeraOrigen;
  private Heladera heladeraDestino;
  private Integer cantidadViandas;
  private String motivo;

  @Override
  public void registrarContribucion() {
    for (int i = 0; i < cantidadViandas; i++) {
      Vianda viandaSacada = heladeraOrigen.quitarVianda();
      heladeraDestino.agregarVianda(viandaSacada);
      ((Humano) colaborador.getTipo()).setViandasDistribuidas(((Humano) colaborador.getTipo()).getViandasDistribuidas() + 1);
    }
  }
}
