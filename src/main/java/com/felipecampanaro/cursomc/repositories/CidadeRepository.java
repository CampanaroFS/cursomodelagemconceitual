package com.felipecampanaro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipecampanaro.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
