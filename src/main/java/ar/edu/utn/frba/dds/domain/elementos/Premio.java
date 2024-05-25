package ar.edu.utn.frba.dds.domain.elementos;

public class Premio {
  private String rubro;
  private String nombre;
  private Double montoEnPuntos;
  private String urlImagen;
  private Integer stock;

  public Double getMontoEnPuntos() {
    return montoEnPuntos;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public Integer getStock() {
    return stock;
  }
}