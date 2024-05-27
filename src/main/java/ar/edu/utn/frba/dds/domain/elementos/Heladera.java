package ar.edu.utn.frba.dds.domain.elementos;

import ar.edu.utn.frba.dds.domain.datos.Ubicacion;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


public class Heladera {
  private List<Vianda> viandas;
  private Integer capacidad;
  @Getter
  private Ubicacion ubicacion;
  @Setter
  private Boolean estaActiva;
  @Getter
  private LocalDate fechaPuestaEnFuncionamiento;
  private LocalDate fechaFinalizacionFuncionamiento;

  public void agregarVianda(Vianda vianda) {
    viandas.add(vianda);
  }

  public Vianda quitarVianda() {
    return viandas.remove(0);
  }

}

