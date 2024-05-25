package ar.edu.utn.frba.dds.domain.elementos;


public class SensorDeMovimiento {

  private Heladera heladera;

  public Notificacion notificarMovimiento() {
    return new Notificacion("Movimiento detectado en: "
        + this.heladera.getUbicacion().getDireccion().getCalle()
        + this.heladera.getUbicacion().getDireccion().getAltura());
  }
}
