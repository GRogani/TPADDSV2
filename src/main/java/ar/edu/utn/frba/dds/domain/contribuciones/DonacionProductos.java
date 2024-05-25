package ar.edu.utn.frba.dds.domain.contribuciones;

import ar.edu.utn.frba.dds.domain.elementos.Premio;
import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;

public class DonacionProductos extends Contribucion {
  private Premio productoDonado;
  private Colaborador canjeadorDePremio;

  @Override
  public void registrarContribucion() {
    if (this.canjeadorDePremio.getTipo().getPuntos() >= this.productoDonado.getMontoEnPuntos()) {
      this.canjeadorDePremio.getTipo().setPuntos(this.canjeadorDePremio.getTipo().getPuntos()
          - this.productoDonado.getMontoEnPuntos());
      this.productoDonado.setStock(this.productoDonado.getStock() - 1);
    }
  }
}
