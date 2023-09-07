package com.lemare.myjavablog.repositories;

import com.lemare.myjavablog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
