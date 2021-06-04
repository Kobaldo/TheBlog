package br.com.TheBlog.Blog.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @NotNull
    @NotEmpty
    private String titulo;

    @NotBlank
    @NotNull
    @NotEmpty
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @NotNull
    @NotEmpty
    @Lob
    private String texto;
}
