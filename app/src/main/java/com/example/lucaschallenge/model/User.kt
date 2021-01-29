package com.example.lucaschallenge.model

import android.graphics.drawable.Drawable

data class User(val name: String, val repositoryName: String, val forksNumber: Int, val starsNumber: Int, val avatar: Drawable) {
}