package ml

import kotlin.math.exp

/**
 * Motor de Inferencia FootyML
 * Basado en el diferencial xG (Ataque vs Defensa)
 */
class PredictorEngine {

    fun predictProba(h_xg: Double, h_xGA: Double, a_xg: Double, a_xGA: Double): Map<String, Int> {
        // Métrica Reina: Diferencial de Goles Esperados
        // Sumamos 0.25 como factor de ventaja por localía
        val homeScore = (h_xg - h_xGA) + 0.25 
        val awayScore = (a_xg - a_xGA)

        // Función Softmax para convertir la fuerza de los equipos en probabilidades
        val total = exp(homeScore) + exp(awayScore) + exp(0.0)

        return mapOf(
            "home" to ((exp(homeScore) / total) * 100).toInt(),
            "draw" to ((exp(0.0) / total) * 100).toInt(),
            "away" to ((exp(awayScore) / total) * 100).toInt()
        )
    }
}
