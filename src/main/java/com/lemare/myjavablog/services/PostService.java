package com.lemare.myjavablog.services;

import com.lemare.myjavablog.models.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
