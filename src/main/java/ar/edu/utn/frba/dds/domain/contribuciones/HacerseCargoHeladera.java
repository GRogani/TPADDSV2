package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.elementos.Heladera;
import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Juridico;

public class HacerseCargoHeladera extends Contribucion {
  private Heladera heladera;

  @Override
  public void registrarContribucion() {
    ((Juridico) colaborador.getTipo()).getHeladerasActivas().add(heladera);
  }

}
