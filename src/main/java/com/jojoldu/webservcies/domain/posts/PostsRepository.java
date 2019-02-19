package com.jojoldu.webservcies.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PostsRepository
 * ibatis/MyBatis 등에서 Dao라고 불리는 DB Layer 접근자입니다.
 * JPA에선 Repository라고 부르며 인터페이스로 생성
 * 단순히 인터페이스를 생성후, JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 됩니다.
 * 특별히 @Repository를 추가할 필요도 없습니다.
 */
public interface PostsRepository extends JpaRepository<Posts, Long>{

    
}