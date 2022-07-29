package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

    /**
     * JPA 표준 스펙 상, 엔티티는 기본적으로 default 생성자가 필요하다. (*파라미터 없이)
     */
    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }
}
