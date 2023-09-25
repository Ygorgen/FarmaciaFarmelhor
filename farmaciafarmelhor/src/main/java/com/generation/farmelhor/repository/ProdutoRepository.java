package com.generation.farmelhor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmelhor.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	public List <Produto> findAllByProdutoContainingIgnoreCase(@Param("produto") String produto);

}
