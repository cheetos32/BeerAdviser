package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Светлое")) {
            brands.add("Жигулёвское");
            brands.add("Туборг");
        } else if (color.equals("Тёмное")){
            brands.add("Тёмный Эль");
            brands.add("Другое тёмное пиво");
        }
        else if (color.equals("Крепкое")) {
            brands.add("Балтика 9");
            brands.add("Пикур");
        }
        else if (color.equals("Безалкогольное")) {
            brands.add("Извините, у нас не бар для педиков");
        }
        return brands;
    }
}