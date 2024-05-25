package ar.edu.utn.frba.dds.domain.contrasenia;

public interface ValidadorContraseniasStrategy {
  Boolean validarContrasenia(String contrasenia);
}