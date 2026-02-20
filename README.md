# ⚽ FootyML Predictor - MVP v1

Sistema inteligente de predicción de fútbol basado en **Arquitectura Limpia (Clean Architecture)** e inferencia estadística de **Goles Esperados (xG)**. 

---

## 🚀 Descripción del Proyecto
Este MVP utiliza el motor **FootyMLArch** para analizar el rendimiento ofensivo y defensivo de los equipos. A diferencia de las predicciones basadas en la suerte, nuestra IA calcula probabilidades reales mediante el diferencial de **xG** de los últimos 5 partidos.

### 🛠️ Tecnologías y Herramientas
* **Lenguaje:** Kotlin (Android Nativo)
* **Arquitectura:** FootyMLArch (Data, Domain, ML, UI)
* **IA/ML:** Motor de inferencia heurístico con lógica `predict_proba()`
* **API:** [football-data.org](https://www.football-data.org/) para datos en tiempo real
* **Diseño:** "Pitch Green" System (Modo oscuro con acentos neón)

---

## 📊 Arquitectura del Sistema (FootyMLArch)


1.  **Capa de Datos (Data):** Gestión de API Keys y consumo de servicios REST con Retrofit.
2.  **Capa de ML (ML Engineering):** Motor encargado de procesar métricas avanzadas como el diferencial xG.
3.  **Capa de UI (Android UI):** Implementación con Material 3 Cards y componentes visuales reactivos.

---

## ⚙️ Instalación y Configuración

1.  Clona el repositorio:
    ```bash
    git clone [https://github.com/josebernardinogonza-pixel/FootyML-Predictor-App.git](https://github.com/josebernardinogonza-pixel/FootyML-Predictor-App.git)
    ```
2.  Añade tu API Key en el archivo `local.properties`:
    ```properties
    FOOTBALL_API_KEY=tu_clave_aqui
    ```
3.  Sincroniza con **Gradle** en Android Studio y ejecuta en un emulador o dispositivo físico.

---

## 📸 Vista Previa del Diseño
La interfaz utiliza **MaterialCardView** con elevación sutil para una jerarquía visual clara, enfocada en la probabilidad de victoria (Home/Draw/Away).

---

## ✒️ Autor
**Jose Bernardino Gonza** - *Desarrollo Inicial y Arquitectura de IA* - [josebernardinogonza-pixel](https://github.com/josebernardinogonza-pixel)
