package com.sist.jpa_0318.controller;

import com.sist.jpa_0318.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/all")
    public Object all(){
        return deptService.findAll();
    }
}
