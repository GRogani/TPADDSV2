package ar.edu.utn.frba.dds.domain.services.puntosrecomendados;

import ar.edu.utn.frba.dds.domain.services.puntosrecomendados.entities.ListadoDePuntosRecomendados;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PuntosRecomendadosService {
  @GET("puntosRecomendados/1")
  Call<ListadoDePuntosRecomendados> puntosRecomendados();
  @GET("puntosRecomendados")
  Call<ListadoDePuntosRecomendados> puntosRecomendados(@Query("latitud") String latitud,
                                                          @Query("longitud") String longitud,
                                                          @Query("radio") String radio);
}
