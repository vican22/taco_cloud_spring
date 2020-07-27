package com.vedran.tacocloud.repositories.jpa;

import com.vedran.tacocloud.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
