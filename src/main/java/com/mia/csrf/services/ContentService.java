package com.mia.csrf.services;

import com.mia.csrf.dtos.ContentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private final List<String> messages = new ArrayList<>();


    public ContentDto addMessage(String message) {
        messages.add(message);
        return new ContentDto(message);
    }

    public List<String> getMessages(){
        return messages;
        }
}
