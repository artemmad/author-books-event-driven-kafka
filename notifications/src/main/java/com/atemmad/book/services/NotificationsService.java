package com.atemmad.book.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.atemmad.book.domain.Notification;

public interface NotificationsService {

    Notification save(Notification book);

    Page<Notification> listNotifications(Pageable pageable);
}
