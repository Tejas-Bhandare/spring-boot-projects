package com.WinLib.LMS.repository;

import com.WinLib.LMS.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
