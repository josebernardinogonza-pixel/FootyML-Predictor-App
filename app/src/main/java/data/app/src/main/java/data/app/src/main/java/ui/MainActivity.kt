package ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import data.FootballApiService
import ml.PredictorEngine
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val predictor = PredictorEngine()
    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aquí conectarías tu XML del diseño Pitch Green
        setContentView(layout.activity_main)

        // Simulación de carga de datos y predicción
        runPrediction()
    }

    private fun runPrediction() {
        // Datos de ejemplo: Real Madrid vs Barcelona
        // h_xg: 2.1, h_xga: 0.9, a_xg: 1.8, a_xga: 1.2
        val probabilities = predictor.predictProba(2.1, 0.9, 1.8, 1.2)

        // Aquí actualizarías tus barras neón de la UI
        updateUI(probabilities)
    }

    private fun updateUI(probs: Map<String, Int>) {
        // Lógica para mover las barras según los porcentajes:
        // probs["home"] -> Barra Verde
        // probs["draw"] -> Barra Gris
        // probs["away"] -> Barra Roja/Azul
    }
}
