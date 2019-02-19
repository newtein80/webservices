package com.jojoldu.webservcies.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

/**
 * BaseTimeEntity
 * : 모든 Entity들의 상위 클래스가 되어 Entity들의 createdDate, modifiedDate를 자동으로 관리하는 역할
 * 
 * @MappedSuperclass
 *    JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate, modifiedDate)도 컬럼으로 인식하도록 합니다.
 * @EntityListeners(AuditingEntityListener.class)
 *    BaseTimeEntity클래스에 Auditing 기능을 포함시킵니다.
 * @CreatedDate
 *    Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
 * @LastModifiedDate
 *    조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    /**
     * Java8 부터 LocalDate와 LocalDateTime이 등장
     * Java의 기본 날짜 타입인 Date의 문제점을 제대로 고친 타입이라 Java8일 경우 무조건 써야한다고 생각하시면 됩니다.
     * Java8이 나오기전까진 JodaTime이라는 오픈소스를 사용해서 문제점들을 피했었고, Java8에선 LocalDate를 통해 해결했습니다.
     * https://d2.naver.com/helloworld/645609
     * 
     * SpringDataJpa 버전에선 LocalDate와 LocalDateTime이 Database 저장시 제대로 전환이 안되는 이슈가 있습니다. 
     * 이 문제를 SpringDataJpa의 코어 모듈인 Hibernate core 5.2.10부터는 해결되었어서 이 부분을 교체해보겠습니다.
     */

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}