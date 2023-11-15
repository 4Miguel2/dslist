package com.devmig.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmig.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
