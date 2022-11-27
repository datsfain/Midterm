package com.example.midterm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesAdapter(private  val notesList: ArrayList<Note> ) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val labelText = itemView.findViewById<TextView>(R.id.note_label)
        val contentText = itemView.findViewById<TextView>(R.id.note_text);
        var id = "";
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_list_item, parent, false)

        return NoteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val item = notesList[position];
        holder.labelText.text = item.Label;
        holder.contentText.text = item.Text;
        holder.id = item.Id
    }

    override fun getItemCount() : Int = notesList.size
}