package ar.edu.utn.frba.dds.domain.elementos;

import ar.edu.utn.frba.dds.domain.datos.RegistroUsoDeTarjeta;
import ar.edu.utn.frba.dds.domain.usuarios.PersonaVulnerable;
import java.util.List;

public class Tarjeta {
  private String codigo;
  private List<RegistroUsoDeTarjeta> historialUsos;
  private Integer cantidadDeUsosDiarios;
  private PersonaVulnerable personaVulnerableAsociadaALaTarjeta;

  public Boolean puedeUsarseTarjeta() {
    return this.cantidadDeUsosDiarios > 0 && this.personaVulnerableAsociadaALaTarjeta != null;
  }

  public void calcularCantidadDeUsosDiarios() {
    this.cantidadDeUsosDiarios = 4 + 2*(personaVulnerableAsociadaALaTarjeta.cantidadDeMenoresACargo());
  }
}
