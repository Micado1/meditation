package ru.example.mobilemdt.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.example.mobilemdt.R

class FeelState(val context: Context, val state_list: ArrayList<state>) : RecyclerView.Adapter<FeelState.MyVHS>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelState.MyVHS {
        var root = LayoutInflater.from(context).inflate(R.layout.feel_state, parent, false)
        return MyVHS(root)
    }
    class MyVHS(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.img_state)
        val textTitle: TextView = itemView.findViewById(R.id.text_title)
        val textDetail: TextView = itemView.findViewById(R.id.text_detail)
    }

    override fun onBindViewHolder(holder: FeelState.MyVHS, position: Int) {
        holder.textTitle.setText(state_list[position].title)
        holder.textDetail.setText(state_list[position].text_state)
        holder.image.setImageResource(state_list[position].image_state)
    }

    override fun getItemCount(): Int {
        return state_list.size
    }

}