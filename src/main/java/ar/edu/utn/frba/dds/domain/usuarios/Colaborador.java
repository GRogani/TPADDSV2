package ar.edu.utn.frba.dds.domain.usuarios;

import ar.edu.utn.frba.dds.domain.contribuciones.Contribucion;
import ar.edu.utn.frba.dds.domain.datos.Contacto;
import ar.edu.utn.frba.dds.domain.datos.Direccion;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.TipoDeColaborador;

public class Colaborador {
  protected Contacto contacto;
  protected Direccion direccion;
  private TipoDeColaborador tipo;

  public TipoDeColaborador getTipo() {
    return tipo;
  }

  public void realizarContribucion(Contribucion contribucion) {
    contribucion.registrarContribucion();
  }
}
