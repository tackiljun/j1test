package org.zerock.j1test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.j1test.dto.SampleDTO;

@RestController
@RequestMapping("/tack/")
public class SampleController {
    
    @GetMapping("list")
    public List<SampleDTO> getList() {

        return null;
    } 

}
