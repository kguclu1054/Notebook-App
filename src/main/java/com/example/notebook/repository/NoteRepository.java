package com.example.notebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.notebook.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

	
	
}
