package ar.edu.utn.frba.dds.domain.services.puntosrecomendados;

import ar.edu.utn.frba.dds.domain.services.puntosrecomendados.entities.ListadoDePuntosRecomendados;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicioPuntosRecomendados {
  private static ServicioPuntosRecomendados instancia = null;
  private static final String URL = "https://ca6b909d-c185-4f0a-95cf-f98cf0ac449b.mock.pstmn.io/";
  private Retrofit retrofit;


  private ServicioPuntosRecomendados() {
    this.retrofit = new Retrofit.Builder().baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
  }

  public static ServicioPuntosRecomendados getInstance() {
    if (instancia == null) {
      instancia = new ServicioPuntosRecomendados();
    }
    return instancia;
  }

  public ListadoDePuntosRecomendados listadoDePuntosRecomendados(String latitud,
                                                                 String longitud,
                                                                 String radio) throws IOException {
    PuntosRecomendadosService puntosRecomendadosService =
        this.retrofit.create(PuntosRecomendadosService.class);
    Call<ListadoDePuntosRecomendados> requestPuntosRecomendados =
        puntosRecomendadosService.puntosRecomendados(latitud, longitud, radio);
    Response<ListadoDePuntosRecomendados> responsePuntosRecomendados =
        requestPuntosRecomendados.execute();
    return responsePuntosRecomendados.body();
  }

}
