package com.example.recyclerviewall.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewall.R
import com.example.recyclerviewall.R.anim.alfa_anim
import com.example.recyclerviewall.databinding.ItemUserBinding
import com.example.recyclerviewall.models.User

class UserAdapter(var list: List<User>, var animationString: String?) :
    RecyclerView.Adapter<UserAdapter.Vh>() {
    inner class Vh(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        val user: User = list[position]
        holder.binding.name.text = user.name
        holder.binding.number.text = user.password
        when (animationString) {
            "scale" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.scale_anim
                    )
                )
            }
            "translate" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.translate_anim
                    )
                )
            }
            "rotate" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.rotate_anim
                    )
                )
            }
            "alfa" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.alfa_anim
                    )
                )
            }
            "customer1" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.customer_anim1
                    )
                )
            }
            "customer2" -> {
                holder.binding.cardView.startAnimation(
                    AnimationUtils.loadAnimation(
                        holder.itemView.context,
                        R.anim.customer_anim2
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}