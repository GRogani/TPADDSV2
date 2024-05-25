package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.datos.Frecuencia;
import ar.edu.utn.frba.dds.domain.datos.RegistroDonacionDeDinero;
import java.time.LocalDate;

public class DonacionDinero extends Contribucion {
  private double monto;
  private Frecuencia frecuencia;

  @Override
  public void registrarContribucion() {
    colaborador.getTipo().getHistorialDineroDonado().add(new RegistroDonacionDeDinero(fecha, monto, frecuencia));
    colaborador.getTipo().setPesosDonados(colaborador.getTipo().getPesosDonados() + monto);
  }
}
