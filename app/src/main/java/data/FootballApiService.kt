package data

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

/**
 * Interfaz para conectar con football-data.org
 * Usa tu clave: 2e4fd1444f6a4b61a471b1e58c9bc178
 */
interface FootballApiService {
    
    // Obtener partidos de La Liga (PD)
    @GET("v4/competitions/PD/matches")
    suspend fun getLaLigaMatches(
        @Header("X-Auth-Token") apiKey: String = "2e4fd1444f6a4b61a471b1e58c9bc178"
    ): MatchResponse

    // Obtener detalles de un equipo para el xG
    @GET("v4/teams/{id}")
    suspend fun getTeamDetails(
        @Path("id") teamId: Int,
        @Header("X-Auth-Token") apiKey: String = "2e4fd1444f6a4b61a471b1e58c9bc178"
    ): TeamDetails
}
