package com.felipecampanaro.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipecampanaro.cursomc.domain.Produto;
import com.sun.xml.bind.v2.model.core.ID;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
