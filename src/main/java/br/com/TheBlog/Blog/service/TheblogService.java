package br.com.TheBlog.Blog.service;

import br.com.TheBlog.Blog.model.Post;

import java.util.List;

public interface TheblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
