package com.sist.jpa_0318.store;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "emp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    @Column(name = "empno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//???????
    private Long empno;
    private String ename, job;
    private LocalDate hiredate;
    @Column(name = "deptno", insertable = false, updatable = false)
    private String deptno;

    @ManyToOne(fetch = FetchType.LAZY) // Emp 객체를 조회할 때 Dept객체는
    // 필요할 때까지 로딩하지 않음.
    @JoinColumn(name= "deptno", referencedColumnName = "deptno")
    private Dept dept;
}