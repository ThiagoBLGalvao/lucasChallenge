package com.example.lucaschallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.model.classes.User

class UserAdapter(
    private val usersList: List<User>,

    private val openItem: (User) -> Unit
) :
    RecyclerView.Adapter<UserAdapter.UserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_git_repository, parent, false)
        return UserHolder(view)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.fillUpTheView(usersList[position], openItem)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.txtAutorName)
        private val repositoryName: TextView = itemView.findViewById(R.id.txtRepositoryName)
        private val stars: TextView = itemView.findViewById(R.id.txtStarsNumber)
        private val forks: TextView = itemView.findViewById(R.id.txtForksNumber)
        private val avatarImage: ImageView = itemView.findViewById(R.id.imgAvatarPhoto)
        private val repoItem: CardView = itemView.findViewById(R.id.cvRepoItem)

        fun fillUpTheView(user: User, openItem: (User) -> Unit) {
            name.text = user.name
            repositoryName.text = user.repositoryName
            forks.text = user.forksNumber.toString()
            stars.text = user.starsNumber.toString()
            avatarImage.setImageResource(user.avatar)
            itemView.setOnClickListener {
                openItem(user)
            }
            shapeSelector(user.forksNumber)
        }

        private fun shapeSelector(forksNumber: Int) {
            when (forksNumber) {
                in 0..10 -> repoItem.setBackgroundResource(R.drawable.red_shape)

                in 11..60 -> repoItem.setBackgroundResource(R.drawable.yellow_shape)

                else -> repoItem.setBackgroundResource(R.drawable.blue_shape)
            }
        }
    }

}