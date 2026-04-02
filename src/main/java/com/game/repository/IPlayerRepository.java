package com.game.repository;

import com.game.entity.Player;
import org.hibernate.HibernateException;

import java.util.List;
import java.util.Optional;

public interface IPlayerRepository {
    List<Player> getAll(int pageNumber, int pageSize);

    int getAllCount() throws HibernateException;

    Player save(Player player);

    Player update(Player player);

    Optional<Player> findById(long id);

    void delete(Player player);
}