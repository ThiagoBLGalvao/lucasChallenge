package com.example.lucaschallenge.activity

import com.example.lucaschallenge.model.repository.RepositoryUserDate

class PresenterMainActivityImpl(var view: Contract.View?, var repository: RepositoryUserDate?):Contract.Presenter {
    override fun initializer() {
        repository?.getUsers()?.let {
            view?.openFragment(it)
        }
    }
}