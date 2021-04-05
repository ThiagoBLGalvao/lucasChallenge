package com.example.lucaschallenge.model.classes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String,
    val repositoryName: String,
    val forksNumber: Int,
    val starsNumber: Int,
    val avatar: Int,
    val imageRepo: Int,
    val description: String
):Parcelable
