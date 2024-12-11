package com.murilo.eventostec.dtos.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record PostEventDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
