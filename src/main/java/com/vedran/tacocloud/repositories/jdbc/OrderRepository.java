package com.vedran.tacocloud.repositories.jdbc;

import com.vedran.tacocloud.domain.Order;

public interface OrderRepository {

    Order save(Order order);

}
