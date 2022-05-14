package logic

import android.os.SystemClock
import android.widget.TextView
import com.example.breathe.PanicAttack
import com.example.breathe.R


private val panicAttack = listOf(
        Pair("resNose", 4), Pair("expNose", 4),
        Pair("resNose", 4), Pair("expNose", 4),
        Pair("resNose", 6), Pair("expNose", 6),
        Pair("resNose", 6), Pair("expNose", 6),
        Pair("resNose", 8), Pair("expNose", 8),
        Pair("resNose", 8), Pair("expNose", 8)
    )
    private val worried = listOf(
        Pair("resNose", 4), Pair("expLip", 4),
        Pair("resNose", 4), Pair("expLip", 4),
        Pair("resNose", 4), Pair("expLip", 4),
        Pair("resNose", 4), Pair("expLip", 4),
        Pair("resNose", 4), Pair("expLip", 4)
    )
    private val sleepy = listOf(
        Pair("resNose", 2), Pair("expStark", 1),
        Pair("resNose", 2), Pair("expStark", 1),
        Pair("resNose", 2), Pair("expStark", 1),
        Pair("resNose", 2), Pair("expStark", 1),
        Pair("resNose", 2), Pair("expStark", 1),
        Pair("resNose", 2), Pair("expStark", 1)
    )
    private val stress = listOf(
        Pair("resStrain", 3), Pair("expRelax", 3),
        Pair("resStrain", 3), Pair("expRelax", 3),
        Pair("resStrain", 3), Pair("expRelax", 3),
        Pair("resStrain", 3), Pair("expRelax", 3),
        Pair("resStrain", 3), Pair("expRelax", 3),
        Pair("resStrain", 3), Pair("expRelax", 3),
    )

    private val emotionMap = mapOf(
        "panicAttack" to panicAttack,
        "worried" to worried,
        "sleepy" to sleepy,
        "stress" to stress
    )
    val text = mapOf(
        "resNote" to "Вдохните через нос",
        "expNose" to "Выдохните через нос",
        "expLip" to "Выдохните через рот",
        "expStark" to "Резко выдохните",
        "resStrain" to "Вхохните и напрягитесь",
        "expRelax" to "Выдохните и расслабтесь"
    )

    fun printText(emotion: String, text1: TextView): Unit {

        val motions = emotionMap[emotion]!!
        for (pair in motions) {
            text1.setText(text[pair.first])
            val delay = (pair.second * 1000).toLong()
            SystemClock.sleep(delay)
        }
        stop()

    }

    private fun stop(): Unit {
        //псевдонажатие на конпку СТОП и возврат на слой с выором эмоции
    }




