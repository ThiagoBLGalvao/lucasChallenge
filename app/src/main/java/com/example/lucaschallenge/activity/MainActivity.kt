package com.example.lucaschallenge.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lucaschallenge.R
import com.example.lucaschallenge.fragment.fragmentList.RepoListFragment
import com.example.lucaschallenge.model.classes.ListOfUserHolder
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), Contract.View {

    val presenter  by inject<Contract.Presenter> { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) presenter.initializer()
    }

    override fun openFragment(list: ListOfUserHolder) {
        val fragment = RepoListFragment.newInstance(list)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_fragments,fragment, "Lis_of_users_repo")
            .commit()
    }

}