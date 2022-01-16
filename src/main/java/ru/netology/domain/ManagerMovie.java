package ru.netology.domain;

import lombok.*;


@NoArgsConstructor
@Getter

public class ManagerMovie {
    DataMovie[] items = {new DataMovie(1, "Soul", "cartoon",false),
            new DataMovie(2, "Call me", "action",false),
            new DataMovie(3, "Gentlemen", "action",false),
            new DataMovie(4, "Invisible", "Thriller",false),
            new DataMovie(5, "Troll's tour", "cartoon",true),
            new DataMovie(6, "I BelieveInLove", "romance",true),
            new DataMovie(7, "Pinocchio", "children",true)};

    DataMovie film = new DataMovie(8,"House of Cards", "serials",true);
    @Setter  private int moviesQuantity=5;

    //Метод для добавления фильмов
    public DataMovie[] addMovie(DataMovie film) {
        int length = items.length + 1;
        DataMovie[] tmp = new DataMovie[length];
        // for (int i = 0; i < items.length; i++) {
        // tmp[i]=items[i];
        //}
        System.arraycopy(items,0,tmp,0,items.length);
        int lastIndex=tmp.length - 1;
        tmp[lastIndex]= this.film;
        items = tmp;



        return items;
    }

    //Метод получения всего списка элементов
    public DataMovie[] getAllMovies() {
        DataMovie[] tmp = new DataMovie[items.length];
        // перебираем массив в прямом порядке, кладем в обратном
        for (int i = 0; i < tmp.length; i++) {
            int index = items.length - i - 1;
            tmp[i] = items[index];
        }
        return tmp;
    }


    //Метод, который выводит нужное количество фильмов
    public DataMovie[] getNMovies () {
        int count = this.moviesQuantity;
        if (count > items.length)
            count = items.length;
        DataMovie[] answer = new DataMovie[count];
        for (int i = 0; i < answer.length; i++) {
            int index = items.length - i - 1;
            answer[i] = items[index];
        }
        return answer;
    }

}

