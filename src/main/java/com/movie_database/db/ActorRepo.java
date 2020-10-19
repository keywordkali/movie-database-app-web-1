package com.movie_database.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie_database.business.Actor;




public interface ActorRepo extends JpaRepository<Actor, Integer> {

}


