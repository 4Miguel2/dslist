package com.devmig.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmig.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
