package com.example.lucaschallenge.testMainActivity

import com.example.lucaschallenge.R
import com.example.lucaschallenge.activity.Contract
import com.example.lucaschallenge.activity.PresenterMainActivityImpl
import com.example.lucaschallenge.model.classes.ListOfUserHolder
import com.example.lucaschallenge.model.classes.User
import com.example.lucaschallenge.model.repository.RepositoryUserDate
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class testMainActivityPresenter {
    private val view: Contract.View = mockk(relaxed = true)

    private val repository: RepositoryUserDate = mockk(relaxed = true)

    private lateinit var presenter: Contract.Presenter

    companion object {
        fun returnListOfUsers() =
            ListOfUserHolder(
                listOf(
                    User(
                        "Jonathan", "AppManipulator", 22, 100, R.drawable.image_4,
                        R.drawable.red_dragon_archfiend, "This is my first repository"
                    ),
                )
            )
    }

    @Before
    fun setUp() {
        presenter = PresenterMainActivityImpl(view, repository)
    }

    @Test
    fun `when initializer triggered then verify success`() {
        every { repository.getUsers() } returns returnListOfUsers()

        presenter.initializer()

        verify {
            view.openFragment(any())
        }
    }

}