package com.blazerg.application.pokevleague.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import groovy.transform.Canonical

@Canonical
@JsonIgnoreProperties(ignoreUnknown = true)
class PokemonTeamResponse {

    ArrayList<PokeResponse> pokeTeam

}
