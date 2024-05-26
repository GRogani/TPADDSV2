package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.datos.Frecuencia;
import ar.edu.utn.frba.dds.domain.datos.RegistroDonacionDeDinero;
import java.time.LocalDate;

public class DonacionDinero extends Contribucion {
  private double monto;
  private Frecuencia frecuencia;

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public Frecuencia getFrecuencia() {
    return frecuencia;
  }

  public void setFrecuencia(Frecuencia frecuencia) {
    this.frecuencia = frecuencia;
  }

  @Override
  public void registrarContribucion() {
    colaborador.getTipo().getHistorialDineroDonado().add(new RegistroDonacionDeDinero(fecha, monto, frecuencia));
    colaborador.getTipo().setPesosDonados(colaborador.getTipo().getPesosDonados() + monto);
  }
}
