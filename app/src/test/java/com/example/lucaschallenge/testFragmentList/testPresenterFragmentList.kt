package com.example.lucaschallenge.testFragmentList

import com.example.lucaschallenge.fragment.fragmentList.FragmentContract
import com.example.lucaschallenge.fragment.fragmentList.PresenterRepoListFragmentImpl
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class testPresenterFragmentList {
    private val fragment: FragmentContract.Fragment = mockk(relaxed = true)

     private lateinit var presenter: FragmentContract.Presenter

     @Before
     fun setUp(){
         presenter = PresenterRepoListFragmentImpl(fragment)
     }

    @Test
    fun `when triggered initializer then verify call bind`(){
        presenter.initializer()

        verify {
            fragment.bind()
        }
    }
}