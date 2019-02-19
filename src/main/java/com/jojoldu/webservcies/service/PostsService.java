package com.jojoldu.webservcies.service;

import com.jojoldu.webservcies.domain.posts.Posts;
import com.jojoldu.webservcies.domain.posts.PostsRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

/**
 * PostsService
 */
@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postRepository;

    @Transactional
    public void save(Posts entity) {
        postRepository.save(entity);
    }

}