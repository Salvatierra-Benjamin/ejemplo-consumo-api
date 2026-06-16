package domain.services.georef.entities;

import java.util.List;

public class ListadoDeMunicipios {
  public int cantidad;
  public int inicio;
  public int fin;
  // Hacer que esto heredé de ListadoDeProvincias no esta bueno,
  // más por un tema de legilibilidad, además de que si me cambia
  // algo la API, me rompera todoo

  public List<Municipio> municipios;

  private class Parametro{
    public List<String> campos;
    public int max;
    public List<String> pronvincia;
  }

}
