package com.example.lucaschallenge.model.classes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListOfUserHolder(
    val listOfUser: List<User>
):Parcelable