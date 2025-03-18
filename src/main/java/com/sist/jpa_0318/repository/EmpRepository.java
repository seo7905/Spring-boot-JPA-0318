package com.sist.jpa_0318.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sist.jpa_0318.store.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
    // 사번검색
    Optional<Emp> findByEmpno(Long empno);

    //직종과 부서코드를 인자로 받아 검색
    List<Emp> findByJobAndDeptno(String job, String deptno);
    //select * from emp where job=? and deptno=?

    @Query(value = "select * from emp where job like concat('%',?1,'%') and deptno=:deptno", nativeQuery = true)
    List<Emp> findByJobLikeAndDeptno(String job, String deptno);

    List<Emp> findByJobContainingAndDeptno(String job, String deptno);
}
