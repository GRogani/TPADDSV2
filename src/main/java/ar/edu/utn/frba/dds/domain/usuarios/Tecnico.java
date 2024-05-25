package ar.edu.utn.frba.dds.domain.usuarios;

import ar.edu.utn.frba.dds.domain.datos.AreaDeCobertura;
import ar.edu.utn.frba.dds.domain.datos.Contacto;
import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;

public class Tecnico {
  private String nombreYApellido;
  private TipoDeDocumento tipoDocumento;
  private String nroDocumento;
  private String cuil;
  private Contacto medioDeContacto;
  private AreaDeCobertura areaDeCobertura;
}
