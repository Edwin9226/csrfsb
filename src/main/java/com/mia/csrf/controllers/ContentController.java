package com.mia.csrf.controllers;

import com.mia.csrf.dtos.ContentDto;
import com.mia.csrf.services.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ContentController {

    @Autowired
    private  final ContentService contentService;

    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(contentService.getMessages());
    }
    @PostMapping("/messages")
    public ResponseEntity<ContentDto> addMessage(@RequestBody String message) {
        return ResponseEntity.ok(contentService.addMessage(message));
    }
}
