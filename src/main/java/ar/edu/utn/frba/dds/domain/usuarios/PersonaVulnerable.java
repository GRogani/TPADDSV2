package ar.edu.utn.frba.dds.domain.usuarios;

import ar.edu.utn.frba.dds.domain.datos.Direccion;
import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;
import java.time.LocalDate;
import java.util.List;

public class PersonaVulnerable {
  private String nombre;
  private LocalDate fechaDeNacimiento;
  private LocalDate fechaEnLaQueFueRegistrado;
  private Direccion domicilio = null;
  private TipoDeDocumento tipoDeDocumento;
  private String nroDocumento;
  private List<MenorACargo> menoresACargo;

  public Boolean tieneMenoresACargo() {
    return !menoresACargo.isEmpty();
  }

  public Integer cantidadDeMenoresACargo() {
    return menoresACargo.size();
  }


}
