package com.example.lucaschallenge.model.repository

import com.example.lucaschallenge.R
import com.example.lucaschallenge.model.classes.User
import com.example.lucaschallenge.model.classes.ListOfUserHolder

class RepositoryUser: RepositoryUserDate {
    override fun getUsers(): ListOfUserHolder =
        ListOfUserHolder(
            listOf(
                User("Jonathan", "AppManipulator", 22,100, R.drawable.image_4,R.drawable.red_dragon_archfiend,"This is my first repository"),
                User("Jonathan", "AppManipulator", 2,100, R.drawable.image_6,R.drawable.stardust_dragon,"What this repository was supposed to be"),
                User("Jonathan", "AppManipulator", 77,100, R.drawable.image_5,R.drawable.red_dragon_archfiend,"I neither wanted do this"),
                User("Jonathan", "AppManipulator", 12,100, R.drawable.image_4,R.drawable.stardust_dragon,"This repository is cursed, go away")
            )
        )
}