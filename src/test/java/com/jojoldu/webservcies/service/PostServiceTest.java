package com.jojoldu.webservcies.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.jojoldu.webservcies.domain.posts.Posts;
import com.jojoldu.webservcies.domain.posts.PostsRepository;
import com.jojoldu.webservcies.dto.posts.PostsSaveRequestDto;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * PostServiceTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
    
    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void DtoDataSave_toTable() {
        /**
         * Dto 클래스가 service.save 메소드에 전달되면, DB에 잘 저장되었는지 검증
         */
        
        //given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                                    .author("author")
                                    .content("content")
                                    .title("title")
                                    .build();

        //when
        postsService.save(dto);

        //then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
    }
}