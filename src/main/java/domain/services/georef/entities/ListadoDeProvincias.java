package domain.services.georef.entities;

import java.util.List;

public class ListadoDeProvincias {
  // El nombre de los atributos es key-sensitive
  public int cantidad;
  public int inicio;
  public int total;
  public Parametro parametros;
  // Si no lo pongo, no rompera pero no lo podre utilizar

  public List<Provincia> provincias;

  // Hago Parametro lo hago como inner class pero tranquilamente podria estar afuera.
  // Puedo hacer esto aca y no con provincias porque Parametro solo lo utilizare aca.!!!
  private class Parametro{
    public List<String> campos;
  }
}
