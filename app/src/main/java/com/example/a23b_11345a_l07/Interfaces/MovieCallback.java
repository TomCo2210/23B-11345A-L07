package com.example.a23b_11345a_l07.Interfaces;

import com.example.a23b_11345a_l07.Models.Movie;

public interface MovieCallback {
    void favoriteClicked(Movie movie, int position);

    void itemClicked(Movie movie, int position);
}
