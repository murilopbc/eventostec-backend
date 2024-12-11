package com.murilo.eventostec.serviceImpl;

import com.murilo.eventostec.dtos.event.PostEventDTO;
import com.murilo.eventostec.entities.Event;
import com.murilo.eventostec.service.EventService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;


@Service
public class EventServiceImpl implements EventService {


    public Event createEvent(PostEventDTO data) {
        String imgUrl = "";


        if (data.image() != null) {
            imgUrl = this.uploadImg(data.image());
        }
        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);

        return newEvent;
    }


    private String uploadImg(MultipartFile multipartFile) {
        return "";
    }

}
