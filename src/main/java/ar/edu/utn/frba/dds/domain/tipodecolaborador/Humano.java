package ar.edu.utn.frba.dds.domain.tipodecolaborador;

import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;
import java.time.LocalDate;


public class Humano extends TipoDeColaborador{
  private String nombre;
  private String apellido;
  private TipoDeDocumento tipoDeDocumento;
  private String numeroDocumento;
  private LocalDate fechaNacimiento;
  private Integer viandasDistribuidas;
  private Integer viandasDonadas;
  private Integer tarjetasRepartidas;

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public TipoDeDocumento getTipoDeDocumento() {
    return tipoDeDocumento;
  }

  public void setTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
    this.tipoDeDocumento = tipoDeDocumento;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getTarjetasRepartidas() {
    return tarjetasRepartidas;
  }

  public void setTarjetasRepartidas(Integer tarjetasRepartidas) {
    this.tarjetasRepartidas = tarjetasRepartidas;
  }

  public Integer getViandasDistribuidas() {
    return viandasDistribuidas;
  }

  public void setViandasDistribuidas(Integer viandasDistribuidas) {
    this.viandasDistribuidas = viandasDistribuidas;
  }

  public Integer getViandasDonadas() {
    return viandasDonadas;
  }

  public void setViandasDonadas(Integer viandasDonadas) {
    this.viandasDonadas = viandasDonadas;
  }
}
