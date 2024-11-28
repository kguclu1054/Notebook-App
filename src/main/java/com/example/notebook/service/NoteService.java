package com.example.notebook.service;

import java.util.List;

import com.example.notebook.dto.NoteDto;
import com.example.notebook.entity.Note;

public interface NoteService {

	Note saveNote(NoteDto noteDto);
	List<Note> getAllNotes();
	Note getNoteById(Long id);
	void deleteNote(Long id);
	
}
