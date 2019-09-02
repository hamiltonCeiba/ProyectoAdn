package com.transporte.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.demo.Entity.Tonelaje;

public interface TonelajeRepository extends JpaRepository<Tonelaje, Long> {

	public Tonelaje findByIdTonelaje(int idTonelaje);
}
