package com.example.lucaschallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.model.User

class UserAdapter(
    private val usersList: List<User>,

    private val showUserNameByToast: (User) -> Unit
) :
    RecyclerView.Adapter<UserAdapter.UserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_git_repository, parent, false)
        return UserHolder(view)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.fillUpTheView(usersList[position], showUserNameByToast)
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
        
        fun fillUpTheView(user: User, showUserNameByToast: (User) -> Unit) {
            name.text = user.name
            repositoryName.text = user.repositoryName
            forks.text = user.forksNumber.toString()
            stars.text = user.starsNumber.toString()
            avatarImage.setImageDrawable(user.avatar)
            itemView.setOnClickListener { 
                showUserNameByToast(user)
            }

        }
    }

}