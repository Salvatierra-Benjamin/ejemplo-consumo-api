package domain.services.georef;

import domain.services.georef.entities.ListadoDeMunicipios;
import domain.services.georef.entities.ListadoDeProvincias;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GeorefService {
  // https://apis.datos.gob.ar/georef/api  <--- Ruta absoluta
  // /provincias <--- Ruta relativa
  @GET("provincias")
  Call<ListadoDeProvincias> provincias();

  @GET("provincias")
  Call<ListadoDeProvincias> provincias(@Query("campos") String campos);

  @GET("municipios")
  Call<ListadoDeMunicipios> municipios(@Query("provincia") int idProvincia);

  @GET("municipios")
  Call<ListadoDeMunicipios> municipios(@Query("provincia") int  idProvincia ,
                                       @Query("campos") String campos,
                                       @Query("max") int max);
}
