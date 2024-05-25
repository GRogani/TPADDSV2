package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;
import java.time.LocalDate;

public abstract class Contribucion {
  protected Colaborador colaborador;
  protected LocalDate fecha;

  public abstract void registrarContribucion();
}
