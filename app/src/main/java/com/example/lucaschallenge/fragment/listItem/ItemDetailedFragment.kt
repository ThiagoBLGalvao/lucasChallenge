package com.example.lucaschallenge.fragment.listItem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.lucaschallenge.R
import com.example.lucaschallenge.model.classes.User
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class ItemDetailedFragment: Fragment(), ItemDetailedFragmentContract.IItemDetailedFragment {
    private val presenter by inject<ItemDetailedFragmentContract.IItemDetailedFragmentPresenter> { parametersOf(this) }
    private lateinit var ivLogo: ImageView
    private lateinit var ivRepoImage: ImageView
    private lateinit var tvTitle: TextView
    private lateinit var tvDescription: TextView
    private lateinit var cvCardRepo: CardView
    private lateinit var vErrorView: ConstraintLayout

    companion object{
        const val USERDETAILS="user_details"

        fun newInstance(user: User) = ItemDetailedFragment().apply {
            arguments = bundleOf(
                USERDETAILS to user
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item, container, false)

        val user = getUser()

        ivLogo = view.findViewById(R.id.ivLogo)
        ivRepoImage = view.findViewById(R.id.ivRepoImage)
        tvTitle = view.findViewById(R.id.tvTitle)
        tvDescription = view.findViewById(R.id.descriptionRepoText)
        cvCardRepo = view.findViewById(R.id.cvCardContent)
        vErrorView = view.findViewById(R.id.error_screen)

        presenter.initializer(user)

        return view
    }

    fun getUser() = arguments?.getParcelable<User>(USERDETAILS)

    override fun bind(user: User) {
        cvCardRepo.visibility = View.VISIBLE
        ivLogo.setImageResource(user.avatar)
        ivRepoImage.setImageResource(user.imageRepo)
        tvTitle.text = user.name
        tvDescription.text = user.description
    }

    override fun loadErrorView() {
        vErrorView.visibility = View.VISIBLE
    }
}