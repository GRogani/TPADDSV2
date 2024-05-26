package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.elementos.Tarjeta;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Humano;

public class RegistroPersonaVulnerable extends Contribucion {

  private Tarjeta tarjetaEntregada;

  @Override
  public void registrarContribucion() {
    ((Humano) colaborador.getTipo()).setTarjetasRepartidas(((Humano) colaborador.getTipo()).getTarjetasRepartidas() + 1);
  }
}
