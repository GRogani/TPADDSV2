package ar.edu.utn.frba.dds.domain.tipodecolaborador;

import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter

public class Humano extends TipoDeColaborador{
  private String nombre;
  private String apellido;
  private TipoDeDocumento tipoDeDocumento;
  private String numeroDocumento;
  private LocalDate fechaNacimiento;
  private Integer viandasDistribuidas;
  private Integer viandasDonadas;
  private Integer tarjetasRepartidas;

}
