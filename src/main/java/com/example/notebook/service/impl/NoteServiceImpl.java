package com.example.notebook.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notebook.dto.NoteDto;
import com.example.notebook.entity.Note;
import com.example.notebook.repository.NoteRepository;
import com.example.notebook.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService{

	@Autowired
	private NoteRepository noteRepository;
	
	@Override
	public Note saveNote(NoteDto noteDto) {
		 Note note = new Note();
		 note.setTitle(noteDto.getTitle());
		 note.setContent(noteDto.getContent());
		 return noteRepository.save(note);
	}

	@Override
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

	@Override
	public Note getNoteById(Long id) {
		Optional<Note> note = noteRepository.findById(id); 
		return note.orElse(null);
	}

	@Override
	public void deleteNote(Long id) {
		noteRepository.deleteById(id);
		
	}

}
