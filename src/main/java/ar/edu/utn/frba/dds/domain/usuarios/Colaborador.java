package ar.edu.utn.frba.dds.domain.usuarios;

import ar.edu.utn.frba.dds.domain.contribuciones.Contribucion;
import ar.edu.utn.frba.dds.domain.datos.Contacto;
import ar.edu.utn.frba.dds.domain.datos.Direccion;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.TipoDeColaborador;

public class Colaborador {
  private String usuario;
  private String contrasenia;
  protected Contacto contacto;
  protected Direccion direccion;
  private TipoDeColaborador tipo;

  public String getContrasenia() {
    return contrasenia;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public TipoDeColaborador getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeColaborador tipo) {
    this.tipo = tipo;
  }

  public Contacto getContacto() {
    return contacto;
  }

  public void setContacto(Contacto contacto) {
    this.contacto = contacto;
  }

  public void realizarContribucion(Contribucion contribucion) {
    contribucion.registrarContribucion();
  }
}
