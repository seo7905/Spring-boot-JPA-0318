package com.sist.jpa_0318.repository;

import com.sist.jpa_0318.store.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
    Optional<Dept> findByDeptno(Long deptno);
}
