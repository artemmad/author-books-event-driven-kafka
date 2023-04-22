package com.artemmad.book.publisher.services;

import com.artemmad.book.publisher.domain.Book;

/**
 * Publishes books.
 */
public interface BookPublisherService {

    void publish(Book book);

}
