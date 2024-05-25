package ar.edu.utn.frba.dds.domain.tipodecolaborador;

import ar.edu.utn.frba.dds.domain.contribuciones.Contribucion;
import ar.edu.utn.frba.dds.domain.datos.RegistroDonacionDeDinero;
import java.util.List;

public abstract class TipoDeColaborador {
  private List<RegistroDonacionDeDinero> historialDineroDonado;
  private Double puntos = 0.0;
  private Double pesosDonados;
  private List<Contribucion> constribucionesPermitidas;

  public List<Contribucion> getConstribucionesPermitidas() {
    return constribucionesPermitidas;
  }

  public List<RegistroDonacionDeDinero> getHistorialDineroDonado() {
    return historialDineroDonado;
  }

  public Double getPesosDonados() {
    return pesosDonados;
  }

  public Double getPuntos() {
    return puntos;
  }

  public void setConstribucionesPermitidas(List<Contribucion> constribucionesPermitidas) {
    this.constribucionesPermitidas = constribucionesPermitidas;
  }

  public void setHistorialDineroDonado(List<RegistroDonacionDeDinero> historialDineroDonado) {
    this.historialDineroDonado = historialDineroDonado;
  }

  public void setPesosDonados(Double pesosDonados) {
    this.pesosDonados = pesosDonados;
  }

  public void setPuntos(Double puntos) {
    this.puntos = puntos;
  }
}
