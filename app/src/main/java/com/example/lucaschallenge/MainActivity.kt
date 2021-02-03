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
            )
        )
    }
}