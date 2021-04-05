package com.example.lucaschallenge.model.repository

import com.example.lucaschallenge.model.classes.ListOfUserHolder
import com.example.lucaschallenge.model.classes.User

interface RepositoryUserDate {
    fun getUsers(): ListOfUserHolder
}