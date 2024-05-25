package ar.edu.utn.frba.dds.domain.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class CargarConfiguracion {
  private static Properties properties = new Properties();

  static {
    try (InputStream input = CargarConfiguracion.class.getClassLoader()
        .getResourceAsStream("config.properties")) {
      if (input == null) {
        System.out.println("Disculpa, no se pudo encontrar el archivo config.properties");
      }
      // Load the properties file
      properties.load(input);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static String getProperty(String key) {
    return properties.getProperty(key);
  }

  public static Integer getIntProperty(String key) {
    return Integer.parseInt(properties.getProperty(key));
  }

  public static Pattern getPatternProperty(String key) {
    return Pattern.compile(properties.getProperty(key));
  }
}