package ar.edu.utn.frba.dds.domain.elementos;

public class SensorDeTemperatura { //TODO Hacer configurable
  private Integer tempMinHeladera;
  private Integer tempMaxHeladera;
  private Integer temperaturaHeladera;
  private Heladera heladera;

  public void controlarTemperatura() {
    if (this.temperaturaHeladera > this.tempMaxHeladera
        || this.temperaturaHeladera < this.tempMinHeladera) {
      this.heladera.setEstaActiva(false);
    }
  }
}
