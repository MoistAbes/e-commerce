package dev.zymixon.e_commerce.services;

import dev.zymixon.e_commerce.exceptions.UserNotFoundException;
import dev.zymixon.e_commerce.models.entities.UserEntity;
import java.util.List;

public interface UserService {

    UserEntity getUser(Long userId) throws UserNotFoundException;

    List<UserEntity> getUsers();

    UserEntity saveUser(UserEntity userEntity);

    void deleteUser(Long userId);
}
