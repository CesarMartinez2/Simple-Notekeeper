package com.example.simplenotekeeper;

import androidx.cardview.widget.CardView;

import com.example.simplenotekeeper.Models.Notes;


public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
