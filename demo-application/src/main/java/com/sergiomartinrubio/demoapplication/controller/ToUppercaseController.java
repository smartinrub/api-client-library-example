package com.sergiomartinrubio.demoapplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/uppercase")
public class ToUppercaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToUppercaseController.class);

    @GetMapping("/{word}")
    public String toUppercase(@PathVariable("word") String word) {
        LOGGER.info("Transforming {} to uppercase", word);
        return word.toUpperCase(Locale.ROOT);
    }
}
