package com.example.demo.resources;

import com.example.demo.dto.EmailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/validate")
public class EmailResource {

    @PostMapping
    public ResponseEntity<EmailDTO> validate(@Valid @RequestBody EmailDTO dto){
        dto.setValid(true);
        return ResponseEntity.ok(dto);
    }
}
