package com.example.lucaschallenge

import com.example.lucaschallenge.activity.Contract
import com.example.lucaschallenge.activity.PresenterMainActivityImpl
import com.example.lucaschallenge.fragment.fragmentList.FragmentContract
import com.example.lucaschallenge.fragment.fragmentList.PresenterRepoListFragmentImpl
import com.example.lucaschallenge.fragment.listItem.ItemDetailedFragmentContract
import com.example.lucaschallenge.fragment.listItem.ItemDetailedFragmentPresenter
import com.example.lucaschallenge.model.repository.RepositoryUser
import com.example.lucaschallenge.model.repository.RepositoryUserDate
import org.koin.dsl.module

val appModule = module{
    single<RepositoryUserDate>{ RepositoryUser() }

    factory<ItemDetailedFragmentContract.IItemDetailedFragmentPresenter> {
        (fragment: ItemDetailedFragmentContract.IItemDetailedFragment)-> ItemDetailedFragmentPresenter(fragment)
    }

    factory<FragmentContract.Presenter>{
        (fragment: FragmentContract.Fragment)->PresenterRepoListFragmentImpl(fragment)
    }

    factory<Contract.Presenter>{
            (view: Contract.View) -> PresenterMainActivityImpl(view, get())
    }
}