package domain.services.georef;

import domain.services.georef.entities.ListadoDeMunicipios;
import domain.services.georef.entities.ListadoDeProvincias;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicioGeoref {
  private static ServicioGeoref instance = null;
  private static final String urlAPI = "https://apis.datos.gob.ar/georef/api/";
  private Retrofit retrofit;

  private ServicioGeoref() {
    this.retrofit = new Retrofit.Builder().baseUrl(urlAPI)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public static ServicioGeoref getInstancia() {
    if (instance == null) {
      instance = new ServicioGeoref();
    }
    return instance;
  }

  public ListadoDeProvincias listadoDeProvincias() throws IOException {
    GeorefService georefService = retrofit.create(GeorefService.class);
    Call<ListadoDeProvincias> requestProvinciasArg = georefService.provincias();

    //Lo siguiente hace la request
    Response<ListadoDeProvincias> responseProvinciasArg =  requestProvinciasArg.execute();

    return responseProvinciasArg.body();
  }

  public ListadoDeMunicipios listadoDeMunicipiosDeProvincias(int id) throws IOException{
    GeorefService georefService = this.retrofit.create(GeorefService.class);
    Call<ListadoDeMunicipios> requestMunicipioDeProvincia = georefService.municipios(id);
    Response<ListadoDeMunicipios> responseMunicipiosResponse = requestMunicipioDeProvincia.execute();

    return responseMunicipiosResponse.body();
  }
}
