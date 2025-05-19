package me.fachel.service;

import me.fachel.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
