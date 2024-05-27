package ar.edu.utn.frba.dds.domain.datos;

import lombok.Getter;

public class Ubicacion {
  private Double latitud;
  private Double longitud;

  @Getter
  private Direccion direccion;


}
