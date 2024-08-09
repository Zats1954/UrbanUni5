package ru.zatsoft.pdd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.zatsoft.pdd.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val pdd = """26.1. Не позднее 4 часов 30 минут времени управления с момента завершения        
предшествующего отдыха или с момента завершения перерыва для отдыха водитель обязан
сделать перерыв для отдыха от управления транспортным средством продолжительностью
не менее 45 минут, после которого этим водителем может быть начат очередной период
управления транспортным средством. Указанный перерыв для отдыха может быть разделен на 2 части или более,
первая из которых должна составлять не менее 15 минут, а последняя - не менее 30 минут."""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkBox.setOnClickListener{
        binding.tvInfo.setText( if (
            binding.checkBox.isChecked) {
            binding.tvInfo.textSize = 14.0f
            pdd
        } else {
            binding.tvInfo.textSize = 26.0f
            "Информация"
        })}
    }
}