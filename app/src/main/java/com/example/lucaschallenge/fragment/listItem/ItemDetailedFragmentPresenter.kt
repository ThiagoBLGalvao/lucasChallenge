package com.example.lucaschallenge.fragment.listItem

import com.example.lucaschallenge.model.classes.User

class ItemDetailedFragmentPresenter(var fragment: ItemDetailedFragmentContract.IItemDetailedFragment?):ItemDetailedFragmentContract.IItemDetailedFragmentPresenter {
    override fun initializer(user: User?) {
        if(user != null) fragment?.bind(user) else fragment?.loadErrorView()
    }
}