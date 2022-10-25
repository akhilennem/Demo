package com.example.exampl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExmplController {
    @Autowired
    public ExmplRepo exmplRepo;

    @PostMapping("save")
    public Example save(Example example)
    {
       return exmplRepo.save(example);

    }

    @PostMapping("get-all")
    public Iterable<Example> getAll()
    {
        return (Iterable<Example>) exmplRepo.findAll();
    }
}
