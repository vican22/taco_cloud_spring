package com.vedran.tacocloud.repositories.jpa;

import com.vedran.tacocloud.domain.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
