package com.murilo.eventostec.service;

import com.murilo.eventostec.dtos.event.PostEventDTO;
import com.murilo.eventostec.entities.Event;

public interface EventService{

    Event createEvent(PostEventDTO data);
}
