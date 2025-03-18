package com.sist.jpa_0318.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.jpa_0318.service.EmpService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emp")
public class EmpController {

    private final EmpService empService;

    @RequestMapping("/all")
    public Object findAll() {
        return empService.findAll();
    }

    @RequestMapping("/findByEmpno")
    public Object findByEmp(@RequestParam Long empno) {
        return empService.findByEmpno(empno);
    }

    @RequestMapping("/findByJobAndDeptno")
    public Object findByJobAndDeptno(@RequestParam String job, 
                    @RequestParam String deptno) {
        return empService.findByJobAndDeptno(job, deptno);
    }
    @RequestMapping("/findByJobLikeAndDeptno")
    public Object findByJobLikeAndDeptno(@RequestParam String job, 
                    @RequestParam String deptno) {
        return empService.findByJobLikeAndDeptno(job, deptno);
    }

    @RequestMapping("/findByJobContainingAndDeptno")
    public Object findByJobContainingAndDeptno(@RequestParam String job, 
                    @RequestParam String deptno) {
        return empService.findByJobContainingAndDeptno(job, deptno);
    }

}
