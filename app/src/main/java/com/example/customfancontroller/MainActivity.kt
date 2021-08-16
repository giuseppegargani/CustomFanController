package com.example.customfancontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*TODO 1 - Crea una classe DialView che estende View (con annotazione @JvmOverloads) e con una altra classe Enum (di int) con le diverse velocità
    private enum class FanSpeed(val label: Int) {
   OFF(R.string.fan_off),
   LOW(R.string.fan_low),
   MEDIUM(R.string.fan_medium),
   HIGH(R.string.fan_high);
    }
 */

/*TODO 2 Crea delle costanti di offset della label
private const val RADIUS_OFFSET_LABEL = 30
private const val RADIUS_OFFSET_INDICATOR = -35
 */

/*TODO 3 stabilisci il raggio del cerchio, il punto di origine e il valore iniziale
    private var radius = 0.0f                   // Radius of the circle.
    private var fanSpeed = FanSpeed.OFF         // The active selection.
    // position variable which will be used to draw label and indicator circle position
    private val pointPosition: PointF = PointF(0.0f, 0.0f)
*/

/*todo 4 - inizializza un oggetto paint con i seguenti valori
private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
   style = Paint.Style.FILL
   textAlign = Paint.Align.CENTER
   textSize = 55.0f
   typeface = Typeface.create( "", Typeface.BOLD)
}
 */

/*TODO Sintesi e prove aggiuntive
    Modifica il numero delle velocità oppure modifica il valore delle singole voci in Enum
    Prova a modificare i valori delle costanti di Offset

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}