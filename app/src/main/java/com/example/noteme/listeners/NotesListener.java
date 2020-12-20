package com.example.noteme.listeners;

import com.example.noteme.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
