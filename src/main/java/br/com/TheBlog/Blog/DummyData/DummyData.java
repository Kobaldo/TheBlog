package br.com.TheBlog.Blog.DummyData;



import br.com.TheBlog.Blog.model.Post;
import br.com.TheBlog.Blog.repository.TheBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    TheBlogRepository theBlogRepository;

    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Rodrigo Martins");
        post1.setData(LocalDate.now());
        post1.setTitulo("O primeiro de muitos");
        post1.setTexto("Minha terra tem palmeiras onde canta o sabiá shaushauhsaushaushahsuahsuahsuahsuahsaushuahsuashuashaushaushaushaushaushaushaushaush");

        Post post2 = new Post();
        post2.setAutor("Ana Lindona");
        post2.setData(LocalDate.now());
        post2.setTitulo("Booooty");
        post2.setTexto("Minha terra tem café onde canta o gambá kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        postList.add(post1);
        postList.add(post2);

        for(Post post : postList){
            Post postSaved = theBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
