package com.example.shoppro.controller;

import com.example.shoppro.dto.CategoryDTO;
import com.example.shoppro.repository.CategoryRepository;
import com.example.shoppro.service.CategoryService;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.codehaus.groovy.transform.CategoryASTTransformation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
@Log4j2
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleController {

    @GetMapping("/sample/sample")
    public void aaa(Model model) {

        model.addAttribute("calist", CategoryService.list());


    }

    @PostMapping("/category/register")
    public String save(CategoryDTO categoryDTO){
        CategoryService.

    }


}
