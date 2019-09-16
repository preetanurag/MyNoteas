package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class NotesViewHolder(val root: View):RecyclerView.ViewHolder(root)

class RecyclerViewAdapterNotes(val classList: List<String>) :RecyclerView.Adapter<NotesViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder =
        NotesViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.single_item, parent, false) as View
        )

    override fun getItemCount(): Int=classList.size

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
       holder.root.findViewById<Button>(R.id.single_item_button).text=classList[position]
    }


}