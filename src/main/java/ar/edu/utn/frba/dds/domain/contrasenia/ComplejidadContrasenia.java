package ar.edu.utn.frba.dds.domain.contrasenia;

import ar.edu.utn.frba.dds.domain.utils.CargarConfiguracion;
import java.util.regex.Pattern;

public class ComplejidadContrasenia implements ValidadorContraseniasStrategy {
  private static final Pattern patronContrasenia;

  static {
    patronContrasenia = CargarConfiguracion.getPatternProperty("patronContrasenia");
  }

  @Override
  public Boolean validarContrasenia(String contrasenia) {
    return patronContrasenia.matcher(contrasenia).matches();
  }
}