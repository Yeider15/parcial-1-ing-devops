package com.tickets.infrastructure.adapter;

import com.tickets.domain.ports.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceImpl implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Simulando envío de notificación: " + message);

    }
}
