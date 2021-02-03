package com.example.lucaschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclView = findViewById<RecyclerView>(R.id.rclvGitRepositories)

        val adapter = UserAdapter(fillListUsers())

        rclView.layoutManager = LinearLayoutManager(this)

        rclView.adapter = adapter


    }

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