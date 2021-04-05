package com.example.lucaschallenge.fragment.listItem

import com.example.lucaschallenge.model.classes.User

interface ItemDetailedFragmentContract {
    interface IItemDetailedFragment{
        fun bind(user: User)

        fun loadErrorView()
    }
    interface IItemDetailedFragmentPresenter{
        fun initializer(user: User?)
    }
}