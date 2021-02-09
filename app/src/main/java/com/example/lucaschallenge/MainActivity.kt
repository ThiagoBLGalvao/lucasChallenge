package com.example.lucaschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.model.User

//TODO: pesquise pelo apply ou o with do koltin, com eles tu pode melhorar muito seu codigo
//TODO: criar metodos para cada acao feita no onCreate, deixe ele mais limpo
//TODO: procure usar os outros metodos do ciclo de vida
//TODO: organizar melhor o seu código
//TODO: evitar usar o !!
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclView = findViewById<RecyclerView>(R.id.rclvGitRepositories)

        val adapter = UserAdapter(fillListUsers())
        //TODO: usar callback para o click no item
        rclView.layoutManager = LinearLayoutManager(this)

        rclView.adapter = adapter


    }

    // TODO: procurar sobre o padrão de projeto factory para criar blocos de teste
    private fun fillListUsers(): List<User> {
        return listOf(
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Giorno Giovanna", "Golden_Experience_Requiem", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.image_6)!!
            ),
            User(
                "Dio Brando", "Za_warudo_tokio_tomare", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.image_4)!!
            ),
            User(
                "Seto Kaiba", "nothing_is_impossible_if_you_are_seto_kaiba", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.seto_kaiba)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
            User(
                "Jack Atlas", "Archfiend_Dragon_Grower", 5030, 334,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.red_dragon_archfiend)!!
            ),
            User(
                "Yusei Fudo", "Stardust_Counter", 1230, 10,
                ContextCompat.getDrawable(this@MainActivity, R.drawable.stardust_dragon)!!
            ),
        )
    }
}