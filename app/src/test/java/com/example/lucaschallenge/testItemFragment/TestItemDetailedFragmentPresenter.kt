package com.example.lucaschallenge.testItemFragment

import com.example.lucaschallenge.fragment.listItem.ItemDetailedFragmentContract
import com.example.lucaschallenge.fragment.listItem.ItemDetailedFragmentPresenter
import com.example.lucaschallenge.model.classes.User
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class TestItemDetailedFragmentPresenter {
    private val fragment: ItemDetailedFragmentContract.IItemDetailedFragment = mockk(relaxed = true)

    private val user: User = mockk()

    private lateinit var presenter: ItemDetailedFragmentContract.IItemDetailedFragmentPresenter

    @Before
    fun setUp(){
        presenter = ItemDetailedFragmentPresenter(fragment)
    }

    @Test
    fun `given user when initializer triggered then verify bind`(){
        presenter.initializer(user)

        verify { fragment.bind(any()) }
    }

    @Test
    fun `given null when triggered initializer verify loadErrorView`(){
        presenter.initializer(null)

        verify { fragment.loadErrorView() }
    }
}