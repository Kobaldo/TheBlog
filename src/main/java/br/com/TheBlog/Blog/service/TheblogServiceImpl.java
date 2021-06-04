package br.com.TheBlog.Blog.service;

import br.com.TheBlog.Blog.model.Post;
import br.com.TheBlog.Blog.repository.TheBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheblogServiceImpl implements TheblogService{

    @Autowired
    TheBlogRepository theBlogRepository;

    @Override
    public List<Post> findAll() {
        return theBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return theBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return theBlogRepository.save(post);
    }
}
