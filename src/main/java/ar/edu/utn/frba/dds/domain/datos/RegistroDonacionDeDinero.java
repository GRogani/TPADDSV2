package ar.edu.utn.frba.dds.domain.datos;

import java.time.LocalDate;

public class RegistroDonacionDeDinero {
  private LocalDate fecha;
  private Double monto;
  private Frecuencia frecuencia;


  public RegistroDonacionDeDinero(LocalDate fecha, Double monto, Frecuencia frecuencia) {
    this.fecha = fecha;
    this.monto = monto;
    this.frecuencia = frecuencia;
  }
}
