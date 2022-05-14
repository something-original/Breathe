package logic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.os.SystemClock

class LogicBreathe {
    private val panicAttack = listOf(
        Pair("resNose", 4), Pair("expNose", 4),
        Pair("resNose", 4), Pair("expNose", 4),
        Pair("resNose", 6), Pair("expNose", 6),
        Pair("resNose", 6), Pair("expNose", 6),
        Pair("resNose", 6), Pair("expNose", 6),
        Pair("resNose", 6), Pair("expNose", 6)
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

    fun printText(emotion: String): Unit {

        //переход на другой layout

        val motions = emotionMap[emotion]!!
        for (pair in motions) {
            //вывод текста text[pair.first]!!

            val delay = (pair.second * 1000).toLong()
            SystemClock.sleep(delay)
        }
        stop()

    }

    private fun stop(): Unit {
        //псевдонажатие на конпку СТОП и возврат на слой с выором эмоции
    }
}



