package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;
import java.time.LocalDate;

public abstract class Contribucion {
  protected Colaborador colaborador;
  protected LocalDate fecha;

  public Colaborador getColaborador() {
    return colaborador;
  }

  public void setColaborador(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public abstract void registrarContribucion();
}
