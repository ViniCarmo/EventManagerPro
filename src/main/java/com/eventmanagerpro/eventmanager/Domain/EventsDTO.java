package com.eventmanagerpro.eventmanager.Domain;

import org.springframework.web.multipart.MultipartFile;

public record EventsDTO(String title,
                        String description,
                        Long date,
                        String city,
                        String state,
                        Boolean remote,
                        String eventUrl,
                        MultipartFile Image) {
}

