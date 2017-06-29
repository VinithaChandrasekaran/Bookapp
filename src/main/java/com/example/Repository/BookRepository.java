package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.BookModel;
public interface BookRepository extends JpaRepository<BookModel, Long>
{
}



