package com.sist.jpa_0318.store;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "emp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    @Column(name = "empno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empno;
    private String ename, job;
    private LocalDate hiredate;
    private String deptno;
}
