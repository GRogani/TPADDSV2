package ar.edu.utn.frba.dds.domain.tipodecolaborador;

import ar.edu.utn.frba.dds.domain.elementos.Heladera;
import java.time.LocalDate;
import java.util.List;

public class Juridico extends TipoDeColaborador {
  private String razonSocial;
  private TipoDeEnte tipoDeEnte;
  private String rubro;
  private LocalDate fechaInicioActividades;
  public List<Heladera> heladerasActivas;

  enum TipoDeEnte {
    ONG,
    EMPRESA,
    GUBERNAMENTAL,
    INSTITUCION
  }

  public LocalDate getFechaInicioActividades() {
    return fechaInicioActividades;
  }

  public void setFechaInicioActividades(LocalDate fechaInicioActividades) {
    this.fechaInicioActividades = fechaInicioActividades;
  }

  public List<Heladera> getHeladerasActivas() {
    return heladerasActivas;
  }

  public void setHeladerasActivas(List<Heladera> heladerasActivas) {
    this.heladerasActivas = heladerasActivas;
  }

  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public String getRubro() {
    return rubro;
  }

  public void setRubro(String rubro) {
    this.rubro = rubro;
  }

  public TipoDeEnte getTipoDeEnte() {
    return tipoDeEnte;
  }

  public void setTipoDeEnte(TipoDeEnte tipoDeEnte) {
    this.tipoDeEnte = tipoDeEnte;
  }
}
