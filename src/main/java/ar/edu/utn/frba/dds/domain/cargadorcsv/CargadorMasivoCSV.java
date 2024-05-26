package ar.edu.utn.frba.dds.domain.cargadorcsv;

import ar.edu.utn.frba.dds.domain.contribuciones.DonacionDinero;
import ar.edu.utn.frba.dds.domain.contribuciones.DonacionVianda;
import ar.edu.utn.frba.dds.domain.contribuciones.RedistribucionViandas;
import ar.edu.utn.frba.dds.domain.contribuciones.RegistroPersonaVulnerable;
import ar.edu.utn.frba.dds.domain.datos.Contacto;
import ar.edu.utn.frba.dds.domain.datos.Frecuencia;
import ar.edu.utn.frba.dds.domain.datos.TipoDeDocumento;
import ar.edu.utn.frba.dds.domain.datos.TipoMedioDeContacto;
import ar.edu.utn.frba.dds.domain.tipodecolaborador.Humano;
import ar.edu.utn.frba.dds.domain.usuarios.Colaborador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CargadorMasivoCSV {

  public void cargarDonantesDesdeCSV(String rutaArchivo) {
    String linea;

    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
      while ((linea = br.readLine()) != null) {
        String[] datosColaborador = linea.split(",");

        String tipoDoc = datosColaborador[0];
        String numeroDoc = datosColaborador[1].toString();
        String nombre = datosColaborador[2];
        String apellido = datosColaborador[3];
        String mail = datosColaborador[4];
        LocalDate fechaColaboracion = LocalDate.parse(datosColaborador[5], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String formaColaboracion = datosColaborador[6];
        Integer cantidad = Integer.valueOf(datosColaborador[7]);
        if (usuarioYaExiste(numeroDoc, tipoDoc)) {
          Colaborador colaborador = encontrarColaborador(numeroDoc, tipoDoc);
          switch (formaColaboracion) {
            case "DINERO":
              DonacionDinero contribucionDinero = new DonacionDinero();
              contribucionDinero.setColaborador(colaborador);
              contribucionDinero.setFecha(fechaColaboracion);
              contribucionDinero.setMonto(cantidad);
              contribucionDinero.setFrecuencia(Frecuencia.UNICA);
              colaborador.realizarContribucion(contribucionDinero);
              break;
            case "DONACION_VIANDAS":
              DonacionVianda contribucionVianda = new DonacionVianda();
              contribucionVianda.setColaborador(colaborador);
              contribucionVianda.setFecha(fechaColaboracion);
              colaborador.realizarContribucion(contribucionVianda);
              break;
            case "REDISTRIBUCION_VIANDAS":
              RedistribucionViandas contribucionRedistribucion = new RedistribucionViandas();
              contribucionRedistribucion.setColaborador(colaborador);
              contribucionRedistribucion.setFecha(fechaColaboracion);
              contribucionRedistribucion.setCantidadViandas(cantidad);
              colaborador.realizarContribucion(contribucionRedistribucion);
              break;
            case "ENTREGA_TARJETAS":
              RegistroPersonaVulnerable contribucionEntregarTarjeta = new RegistroPersonaVulnerable();
              contribucionEntregarTarjeta.setColaborador(colaborador);
              contribucionEntregarTarjeta.setFecha(fechaColaboracion);
              colaborador.realizarContribucion(contribucionEntregarTarjeta);
              break;
          }
        } else {
          TipoMedioDeContacto tipoMedioDeContacto = new TipoMedioDeContacto();
          tipoMedioDeContacto.setTipo("Mail");
          Contacto contacto = new Contacto();
          contacto.setTipoMedioDeContacto(tipoMedioDeContacto);
          contacto.setContacto(mail);
          Colaborador colaborador = new Colaborador();
          colaborador.setContacto(contacto);
          colaborador.setUsuario(tipoDoc + numeroDoc);
          colaborador.setContrasenia(tipoDoc + numeroDoc);
          Humano humano = new Humano();
          humano.setNombre(nombre);
          humano.setApellido(apellido);
          humano.setNumeroDocumento(numeroDoc);
          humano.setTipoDeDocumento(TipoDeDocumento.valueOf(tipoDoc));
          colaborador.setTipo(humano);
          switch (formaColaboracion) {
            case "DINERO":
              DonacionDinero contribucionDinero = new DonacionDinero();
              contribucionDinero.setColaborador(colaborador);
              contribucionDinero.setFecha(fechaColaboracion);
              contribucionDinero.setMonto(cantidad);
              contribucionDinero.setFrecuencia(Frecuencia.UNICA);
              colaborador.realizarContribucion(contribucionDinero);
              break;
            case "DONACION_VIANDAS":
              DonacionVianda contribucionVianda = new DonacionVianda();
              contribucionVianda.setColaborador(colaborador);
              contribucionVianda.setFecha(fechaColaboracion);
              humano.setViandasDonadas(cantidad);
              break;
            case "REDISTRIBUCION_VIANDAS":
              RedistribucionViandas contribucionRedistribucion = new RedistribucionViandas();
              contribucionRedistribucion.setColaborador(colaborador);
              contribucionRedistribucion.setFecha(fechaColaboracion);
              contribucionRedistribucion.setCantidadViandas(cantidad);
              humano.setViandasDistribuidas(cantidad);
              break;
            case "ENTREGA_TARJETAS":
              RegistroPersonaVulnerable contribucionEntregarTarjeta = new RegistroPersonaVulnerable();
              contribucionEntregarTarjeta.setColaborador(colaborador);
              contribucionEntregarTarjeta.setFecha(fechaColaboracion);
              humano.setTarjetasRepartidas(cantidad);
              break;
          }
          notificarCredenciales(mail, colaborador);
          }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private Colaborador encontrarColaborador(String numeroDoc, String tipoDoc) {
    //TODO Buscar el colaborador en la base de datos
    return new Colaborador();
  }

  private void notificarCredenciales(String mail, Colaborador colaborador) {
    EnviadorEmails enviadorEmails = new EnviadorEmails();
    enviadorEmails.enviarEmail(mail, "Credenciales de acceso", "Usuario: "
        + colaborador.getUsuario()
        + " Contraseña: "
        + colaborador.getContrasenia());
  }

  private boolean usuarioYaExiste(String numeroDoc, String tipoDoc) {
    return true; //TODO Chequear si el usuario ya existe en la base de datos
  }
}