package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.services.puntosrecomendados.ServicioPuntosRecomendados;
import ar.edu.utn.frba.dds.domain.services.puntosrecomendados.entities.ListadoDePuntosRecomendados;
import ar.edu.utn.frba.dds.domain.services.puntosrecomendados.entities.PuntosRecomendados;

import java.io.IOException;

public class EjemploMockAPI {

    public static void main(String[] args) throws IOException {
        ServicioPuntosRecomendados servicioPuntosRecomendados = ServicioPuntosRecomendados.getInstance();

        System.out.println("Los puntos de colocacion recomendados son:");

        ListadoDePuntosRecomendados listadoDePuntosRecomendados = servicioPuntosRecomendados.listadoDePuntosRecomendados();

        for(PuntosRecomendados puntoRecomendado: listadoDePuntosRecomendados.puntosRecomendados){
            System.out.println("Latitud: " + puntoRecomendado.latitud + "\n" + "Longitud: " + puntoRecomendado.longitud);
        }
    }

}
