package com.example.notebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.notebook.entity.Note;
import com.example.notebook.repository.NoteRepository;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
	
	@Autowired
	private NoteRepository noteRepository;

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
    	Note savedNote = noteRepository.save(note);
        return new ResponseEntity<>(note, HttpStatus.CREATED);
    }
}
