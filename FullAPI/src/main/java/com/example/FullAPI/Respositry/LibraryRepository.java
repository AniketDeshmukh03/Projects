package com.example.FullAPI.Respositry;

import com.example.FullAPI.library.Books;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Books, Integer> {

	



}
