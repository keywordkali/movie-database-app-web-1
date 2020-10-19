package com.movie_database.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.movie_database.business.Actor;
import com.movie_database.business.Movie;
import com.movie_database.db.ActorRepo;
import com.movie_database.db.MovieRepo;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/movies") // has to be lower case and if multiple words spinal case. Should be same name
								// as
								// entity


public class MovieController {
	@Autowired
	private MovieRepo movieRepo;
	
	//list all movies
	@GetMapping("/")
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();

	}

	// get movie by id
		@GetMapping("/{id}")
		public Optional getMovie(@PathVariable int id) {
			Optional<Movie> m = movieRepo.findById(id);
			return m;

	}

// add a movie
	@PostMapping("/")
	public Movie addMovie(@RequestBody Movie m) {
		return movieRepo.save(m);
	}

//update a movie
	@PutMapping("/")
	public Movie updateMovie(@RequestBody Movie m) {
		return movieRepo.save(m);
	}

	// delete an actor
	@DeleteMapping("/")
	public void deleteMovie(@RequestBody Movie m) {
		movieRepo.delete(m);
	}










}
