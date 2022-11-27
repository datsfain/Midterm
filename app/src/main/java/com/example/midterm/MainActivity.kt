package com.example.midterm
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var notesRecyclerView: RecyclerView
    private lateinit var notesList: ArrayList<Note>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notesList = arrayListOf(
            Note("0", "Label 0", "Text Content 0" ),
            Note("1", "Label 1", "Text Content 1" ),
            Note("2", "Label 2", "Text Content 2" ),
            Note("3", "Label 3", "Text Content 3" ),
            Note("4", "Label 4", "Text Content 4" ),
        )

        notesRecyclerView = findViewById(R.id.notes_list_view)
        notesRecyclerView.layoutManager = LinearLayoutManager(this)
        notesRecyclerView.adapter = NotesAdapter(notesList);


    }
}