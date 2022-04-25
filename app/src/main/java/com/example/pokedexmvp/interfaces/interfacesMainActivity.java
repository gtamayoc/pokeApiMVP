package com.example.pokedexmvp.interfaces;

import com.example.pokedexmvp.models.pokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface interfacesMainActivity {


    interface view{
        void obtenerId();
        void mostrarResultados(String resultado);
    }

    interface model{


    }


    interface PokeDexService{
        @GET("pokemon")
        Call<pokemonRespuesta> obtenerpokemonn(@Query("limit") int limit, @Query("offset") int offset);
    }


}
