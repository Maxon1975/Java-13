package ru.netology.domain;

import lombok.*;


@AllArgsConstructor
@EqualsAndHashCode
@Getter




public class DataMovie {
    private int id;
    private String movieName;
    private String movieGenre;
    private  boolean premiere;


}
