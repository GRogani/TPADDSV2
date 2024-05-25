package ar.edu.utn.frba.dds.domain.contrasenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PeoresContrasenias implements ValidadorContraseniasStrategy,
    CargadorDePeoresContrasenias {
  private final String rutaPeoresContrasenias;

  public PeoresContrasenias(String rutaPeoresContrasenias) {
    this.rutaPeoresContrasenias = rutaPeoresContrasenias;
  }

  @Override
  public List<String> cargarPeoresContrasenias() {
    try {
      return Files.readAllLines(Paths.get(rutaPeoresContrasenias))
          .stream()
          .map(String::trim)
          .collect(Collectors.toList());
    } catch (IOException e) {
      throw new RuntimeException("Error al cargar la lista de las peores contraseñas", e);
    }
  }

  @Override
  public Boolean validarContrasenia(String contrasenia) {
    return !this.cargarPeoresContrasenias().contains(contrasenia);
  }
}