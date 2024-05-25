package ar.edu.utn.frba.dds.domain.contrasenia;

public class ValidadorDeContrasenias {
  private final ValidadorContraseniasStrategy[] estrategias;

  public ValidadorDeContrasenias(ValidadorContraseniasStrategy... estrategias) {
    this.estrategias = estrategias;
  }

  public Boolean esValida(String contrasenia) {
    for (ValidadorContraseniasStrategy estrategia : estrategias) {
      if (!estrategia.validarContrasenia(contrasenia)) {
        return false;
      }
    }
    return true;
  }
}