package net.aung.popularmovies.mvp.views;

import net.aung.popularmovies.data.vos.MovieVO;

import java.util.List;

/**
 * Created by aung on 12/12/15.
 */
public interface MovieListView {

    boolean isMovieListEmpty();
    void displayMovieList(List<MovieVO> movieList, boolean isToAppend);
}
