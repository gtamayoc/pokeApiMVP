package com.example.pokedexmvp.models;

import java.util.ArrayList;

public class pokemonRespuesta {

    private ArrayList<ApiModel> results;


    public ArrayList<ApiModel> getResults() {
        return results;
    }

    public void setResults(ArrayList<ApiModel> results) {
        this.results = results;
    }
}
