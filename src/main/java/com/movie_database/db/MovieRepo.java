package com.movie_database.db;
import org.springframework.data.jpa.repository.JpaRepository;
import com.movie_database.business.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
