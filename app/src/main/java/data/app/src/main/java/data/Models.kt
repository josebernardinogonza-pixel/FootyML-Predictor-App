package data

/**
 * Modelos de datos para la respuesta de football-data.org
 */
data class MatchResponse(
    val matches: List<Match>
)

data class Match(
    val id: Int,
    val homeTeam: Team,
    val awayTeam: Team,
    val utcDate: String,
    val status: String
)

data class Team(
    val id: Int,
    val name: String,
    val crest: String // Link al escudo oficial
)

data class TeamDetails(
    val id: Int,
    val venue: String,
    val website: String
)
