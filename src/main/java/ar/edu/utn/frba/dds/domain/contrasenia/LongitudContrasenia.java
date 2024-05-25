package ar.edu.utn.frba.dds.domain.contrasenia;

import ar.edu.utn.frba.dds.domain.utils.CargarConfiguracion;

public class LongitudContrasenia implements ValidadorContraseniasStrategy {
  private static final Integer longitudMinima;
  private static final Integer longitudMaxima;

  static {
    longitudMinima = CargarConfiguracion.getIntProperty("longitudMinimaContrasenias");
    longitudMaxima = CargarConfiguracion.getIntProperty("longitudMaximaContrasenias");
  }

  @Override
  public Boolean validarContrasenia(String contrasenia) {
    Integer longitud = contrasenia.length();
    return longitud >= longitudMinima && longitud <= longitudMaxima;
  }
}