package com.vedran.tacocloud.repositories.jdbc;

import com.vedran.tacocloud.domain.Taco;

public interface TacoRepository {

    Taco save(Taco design);

}
