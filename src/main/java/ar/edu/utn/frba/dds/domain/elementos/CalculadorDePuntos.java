package ar.edu.utn.frba.dds.domain.elementos;

import ar.edu.utn.frba.dds.domain.tipodecolaborador.Humano;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Juridico;
import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class CalculadorDePuntos {//TODO Hacer configurable
  private double coeficienteDonarPesos = 0.5;
  private double coeficienteViandasDistribuidas = 1;
  private double coeficienteViandasDonadas = 1.5;
  private double coeficienteTarjetasRepartidas = 2;
  private double coeficienteHeladerasActivas = 5;


  public Double reconocerColaborador(Colaborador colaborador) {
    if (colaborador.getTipo() instanceof Juridico) {
      List<Heladera> heladeras = ((Juridico) colaborador.getTipo()).getHeladerasActivas();
      long sumatoriaDeMesesActivos = 0;
      for (Heladera heladera : heladeras) {
        LocalDate puestaEnMarcha = heladera.getFechaPuestaEnFuncionamiento();
        LocalDate hoy = LocalDate.now();

        long diferenciaEnMeses = hoy.until(puestaEnMarcha, ChronoUnit.MONTHS);
        sumatoriaDeMesesActivos += diferenciaEnMeses;
        
        return colaborador.getTipo().getPesosDonados() * coeficienteDonarPesos
            + sumatoriaDeMesesActivos * coeficienteHeladerasActivas * heladeras.size();
      }
    }
    return colaborador.getTipo().getPesosDonados() * coeficienteDonarPesos
          + ((Humano) colaborador.getTipo()).getViandasDistribuidas()
        * coeficienteViandasDistribuidas
          + ((Humano) colaborador.getTipo()).getViandasDonadas()
        * coeficienteViandasDonadas
          + ((Humano) colaborador.getTipo()).getTarjetasRepartidas()
        * coeficienteTarjetasRepartidas;
  }
}

