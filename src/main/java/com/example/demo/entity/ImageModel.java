package com.example.demo.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity // указание сущности базы данных
@Data
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // установка параметра на совести БД
    private Long id;
    @Column(nullable = false)
    private String name;
    @Lob // чтение больших объектов (не имеет ограничений длины)
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageBytes;
    @JsonIgnore // игнорирование при чтении/записи
    private Long userId;
    @JsonIgnore
    private Long postId;

    public ImageModel() {
    }
}
