package com.revature.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FavMovies {
    public static void main(String[] args) {
        Set<String> ms = new HashSet<>();
        ms.add("death note");
        ms.add("naruto");
        ms.add("erased");
        ms.add("The Dark Knight");
        ms.add("ddlj");

        ArrayList<String> movieList = new ArrayList<>(ms);
        
        Collections.sort(movieList);

        for (String movie : movieList) {
            System.out.println(movie);
        }
    }
}
