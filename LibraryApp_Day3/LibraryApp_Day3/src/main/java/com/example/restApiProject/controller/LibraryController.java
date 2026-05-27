package com.example.restApiProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.restApiProject.model.Library;
import com.example.restApiProject.service.LibraryService;

@RestController
@RequestMapping("api/v1/library")
public class LibraryController {
	
	@Autowired
    private LibraryService service;


    @PostMapping("/add")
    public Library addProduct(@RequestBody Library product) {
        return service.saveLibrary(product);
    }

    @GetMapping("/all")
    public List<Library> findAllProducts() {
        return service.getLibrary();
    }

    @GetMapping("/find/{id}")
    public Library findProductById(@PathVariable int id) {
        return service.getLibraryById(id);
    }


}
