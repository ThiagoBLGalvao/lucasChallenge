package com.example.lucaschallenge.fragment.fragmentList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.R
import com.example.lucaschallenge.UserAdapter
import com.example.lucaschallenge.fragment.listItem.ItemDetailedFragment
import com.example.lucaschallenge.model.classes.ListOfUserHolder
import com.example.lucaschallenge.model.classes.User
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class RepoListFragment: Fragment(), FragmentContract.Fragment {
    private lateinit var rvRepoList: RecyclerView


    companion object{
        const val GETUSER =  "get_user"

        fun newInstance(listOfUserHolder: ListOfUserHolder) = RepoListFragment().apply {
            arguments = bundleOf(
                GETUSER to listOfUserHolder
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_layout, container, false)

        val presenter  by inject<FragmentContract.Presenter>{parametersOf(this)}

        rvRepoList = view.findViewById(R.id.rvRepoList)
        rvRepoList.layoutManager = LinearLayoutManager(requireContext())

        presenter.initializer()

        return view
    }

    private fun getUser() = arguments?.getParcelable<ListOfUserHolder>(GETUSER) ?: throw Exception()

    private fun openItem(user: User){
        val fragment = ItemDetailedFragment.newInstance(user)

        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.container_fragments,fragment,"item_list_detailed")
            ?.commit()
    }

    override fun bind() {
        val rvAdapter = UserAdapter(getUser().listOfUser, openItem = { openItem(it) })

        rvRepoList.adapter = rvAdapter
    }
}