package com.jzpacheco.cryptovalue.controllers;

import com.jzpacheco.cryptovalue.domains.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajuda")
public class StudentController {

    @GetMapping()
    public Student getSelfStudent(){
        return new Student("Jefferson Zeferino Pacheco", "Currency/USD market value app");
    }

}
