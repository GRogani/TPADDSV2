package ar.edu.utn.frba.dds.domain.datos;

public class Contacto {
  private TipoMedioDeContacto tipoMedioDeContacto;
  private String contacto;

  public String getContacto() {
    return contacto;
  }

  public void setContacto(String contacto) {
    this.contacto = contacto;
  }

  public TipoMedioDeContacto getTipoMedioDeContacto() {
    return tipoMedioDeContacto;
  }

  public void setTipoMedioDeContacto(TipoMedioDeContacto tipoMedioDeContacto) {
    this.tipoMedioDeContacto = tipoMedioDeContacto;
  }
}
