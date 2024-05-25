package ar.edu.utn.frba.dds.domain.datos;

public class Ubicacion {
  private Double latitud;
  private Double longitud;
  private Direccion direccion;

  public Direccion getDireccion() {
    return direccion;
  }
}
