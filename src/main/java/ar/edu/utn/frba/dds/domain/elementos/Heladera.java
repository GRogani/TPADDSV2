package ar.edu.utn.frba.dds.domain.elementos;

import ar.edu.utn.frba.dds.domain.datos.Ubicacion;
import java.time.LocalDate;
import java.util.List;

public class Heladera {
  private List<Vianda> viandas;
  private Integer capacidad;
  private Ubicacion ubicacion;
  private Boolean estaActiva;
  private LocalDate fechaPuestaEnFuncionamiento;
  private LocalDate fechaFinalizacionFuncionamiento;

  public void agregarVianda(Vianda vianda) {
    viandas.add(vianda);
  }

  public Vianda quitarVianda() {
    return viandas.remove(0);
  }

  public LocalDate getFechaPuestaEnFuncionamiento() {
    return fechaPuestaEnFuncionamiento;
  }

  public void setEstaActiva(Boolean estaActiva) {
    this.estaActiva = estaActiva;
  }

  public Ubicacion getUbicacion() {
    return ubicacion;
  }
}
