package com.masivian.roulette.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masivian.roulette.entity.NewRoulette;

@Repository("NewRouletteRepository")
public interface NewRouletteRepository extends JpaRepository<NewRoulette, Serializable>{

}
