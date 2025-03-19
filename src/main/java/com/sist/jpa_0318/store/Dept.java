package com.sist.jpa_0318.store;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
// 어노테이션을 사용하여 Hibernate관련 필드를 직렬화에서 제외한다는 뜻이다.
// 양방향 관계에서 순환 참조문제를 해결한다.
// 서로 계속 부르니까 필요할 때만 호출하기 위해 사용한다.
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptno;
    private String dname;
    private int loc_code;
/*
    양방향 관계 설정 - mappedBy는 관계의 주체가 되는 Dept에서 참조되는
    Emp의 속성(멤버변수)를 의미
    외래키를 기준으로 관계를 매핑 즉 Dept엔티티는 Emp엔티티의 dept변수를 기준으로
    관계를 정의한다.
*/
    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
/*
    CasecadeType.ALL : 모든작업(저장, 삭제, 병합, 수정 등)을 자식 객체에도 적용
    FetchType.LAZY : 필요할 때 연관된 엔티티를 로딩하도록 지정
        즉, Dept엔티티가 로딩될 때 Emp엔티티는 실제로 필요한 때까지 로딩되지
        않는다. 이를 통해 성능을 최적화할 수 있다.
*/
    @JsonIgnoreProperties({"dept"})
    private List<Emp> list;
}
