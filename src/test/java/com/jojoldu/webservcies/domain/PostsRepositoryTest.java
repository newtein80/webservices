package com.jojoldu.webservcies.domain;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDateTime;
import java.util.List;

import com.jojoldu.webservcies.domain.posts.Posts;
import com.jojoldu.webservcies.domain.posts.PostsRepository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Junit은 spring-boot-starter-test에 있기 때문에 별도로 build.gradle에 추가하실 필요가 없습니다.
 * JUnit을 통해 어떤 값을 입력할 경우 어떤 결과가 반환되는지 검증할수 있습니다.
 * https://www.youtube.com/watch?v=tyZMdwT3rIY
 *

/**
 * PostsRepositoryTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRespository;

    @After
    public void cleanup() {
        /**
         * 이후 테스트 코드에 영향을 끼치지 않기 위해 테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
         */
        postsRespository.deleteAll();
    }

    @Test
    public void PostSaveAndCall() {
        /**
         * given, when, then은 BDD(Behaviour-Driven Development)에서 사용하는 용어입니다.
         * JUnit에선 이를 명시적으로 지원해주지 않아 주석으로 표현했습니다.
         * 전문 BDD 프레임워크로 Groovy기반의 Spock을 많이들 사용하고 있습니다.
         * Spock에 대해 자세히 알고 싶으신 분들은 이전에 작성한 블로그글을 참고하시면 도움이 되실것 같습니다.
         * https://jojoldu.tistory.com/228
         */

        //given: 테스트 기반 환경을 구축하는 단계 (@builder의 사용법도 같이 확인)
        postsRespository.save(Posts.builder().title("title").content("content").author("author").build());

        List<Posts> postslist = postsRespository.findAll();

        //when: 테스트 하고자 하는 행위 선언 (여기선 Posts가 DB에 insert 되는것을 확인하기 위함)
        Posts posts = postslist.get(0);

        //then: 테스트 결과 검증 (실제로 DB에 insert 되었는지 확인하기 위해 조회후, 입력된 값 확인)
        assertThat(posts.getTitle(), is("title"));
        assertThat(posts.getContent(), is("content"));
    }

    @Test
    public void BaseTimeEntity_Reg() {
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRespository.save(Posts.builder().title("title").content("content").author("author").build());

        //when
        List<Posts> postslist = postsRespository.findAll();

        //then
        Posts posts = postslist.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}