package com.example.lucaschallenge.fragment.fragmentList

interface FragmentContract {
    interface Fragment{
        fun bind()
    }
    interface Presenter{
        fun initializer()
    }
}