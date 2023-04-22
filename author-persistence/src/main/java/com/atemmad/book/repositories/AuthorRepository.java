package com.atemmad.book.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.atemmad.book.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, String>,
        PagingAndSortingRepository<Author, String> {
}
