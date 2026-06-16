package domain.services.georef.entities;

public class Provincia {
  // Retrofit automaticamente intentará pasar de String a int de ser necesario
  public String nombre;
  public int id;
  public String apellido;
  // El programa no romperia, solo quedaria en null.
  // Puedo solo modelar las cosas que me interesan,
  // pero las cosas per se siempre viajaran por internet.

  // De las unicas formas que rompe Retrofit, el desfaze de tipos
  // y si hay OBJETOS involucrados en ese desfaze

}
