package ar.edu.utn.frba.dds.domain.usuarios;

import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;
import java.time.LocalDate;

public class MenorACargo {
  private String nombre;
  private LocalDate fechaDeNacimiento;
  private TipoDeDocumento tipoDeDocumento;
  private String nroDocumento;

  public Integer getEdad() {
    return LocalDate.now().getYear() - fechaDeNacimiento.getYear();
  }

  public Boolean esMenor() {
    return this.getEdad() < 18;
  }
}
