package com.example.lucaschallenge.fragment.fragmentList

class PresenterRepoListFragmentImpl(var fragment: FragmentContract.Fragment?): FragmentContract.Presenter {
    override fun initializer() {
        fragment?.bind()
    }
}