package com.example.bookStore.repo;

import com.example.bookStore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepo extends JpaRepository<Book,Long> {
}
