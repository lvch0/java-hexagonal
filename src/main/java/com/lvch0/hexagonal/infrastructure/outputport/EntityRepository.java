package com.lvch0.hexagonal.infrastructure.outputport;

import java.util.List;

public interface EntityRepository {
    public <T> T save(T reg);

    public <T> T getById(String customerId, Class<T> clazz);

    public <T> List<T> getAll(Class<T> clazz);
}
