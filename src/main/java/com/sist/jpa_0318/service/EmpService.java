package com.sist.jpa_0318.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sist.jpa_0318.repository.EmpRepository;
import com.sist.jpa_0318.store.Emp;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpService {

    private final EmpRepository empRepository;

    public List<Emp> findAll() {
        return empRepository.findAll();
    }

    public Optional<Emp> findByEmpno(Long empno) {
        return empRepository.findByEmpno(empno);
    }

    public List<Emp> findByJobAndDeptno(String job, String deptno) {
        return empRepository.findByJobAndDeptno(job, deptno);
    }

    public List<Emp> findByJobLikeAndDeptno(String job, String deptno) {
        return empRepository.findByJobLikeAndDeptno(job, deptno);
    }

    public List<Emp> findByJobContainingAndDeptno(String job, String deptno) {
        return empRepository.findByJobContainingAndDeptno(job, deptno);
    }
}
