package net.aung.moviemaniac.data.restapi;

import net.aung.moviemaniac.data.vos.MovieVO;

/**
 * Created by aung on 12/15/15.
 */
public interface MovieDataSource {
    void loadDiscoverMovieList(int pageNumber, String sortBy, boolean isForce);
    void loadNowPlayingMovies(int pageNumber, boolean isForce);
    void loadUpcomingMovies(int pageNumber, boolean isForce);
    void loadPopularMovies(int pageNumber, boolean isForce);
    void loadTopRatedMovies(int pageNumber, boolean isForce);
    void loadMovieTrailers(int movieId);
    void loadMovieDetail(MovieVO movie);
    void loadGenreList();
    void loadMovieReviews(int movieId);
}
