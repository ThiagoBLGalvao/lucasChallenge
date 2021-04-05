package com.example.lucaschallenge.activity

import com.example.lucaschallenge.model.classes.ListOfUserHolder
import com.example.lucaschallenge.model.classes.User

interface Contract {
    interface View{
        fun openFragment(list: ListOfUserHolder)
    }

    interface Presenter{
        fun initializer()
    }
}