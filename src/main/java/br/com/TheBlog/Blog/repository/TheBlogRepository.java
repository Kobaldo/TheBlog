package br.com.TheBlog.Blog.repository;

import br.com.TheBlog.Blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheBlogRepository extends JpaRepository<Post,Long> {


}
