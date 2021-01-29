package com.example.lucaschallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lucaschallenge.model.User

class UserAdapter(private val usersList: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_git_repository, parent, false)
        return UserHolder(view)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        var item = usersList[position]
        holder.name.text = item.name
        holder.repositoryName.text = item.repositoryName
        holder.forks.text = item.forksNumber.toString()
        holder.stars.text = item.starsNumber.toString()
        holder.avatarImage.setImageDrawable(item.avatar)

    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.txtAutorName)
        val repositoryName: TextView = itemView.findViewById(R.id.txtRepositoryName)
        val stars: TextView = itemView.findViewById(R.id.txtStarsNumber)
        val forks: TextView = itemView.findViewById(R.id.txtForksNumber)
        val avatarImage: ImageView = itemView.findViewById(R.id.imgAvatarPhoto)
    }

}