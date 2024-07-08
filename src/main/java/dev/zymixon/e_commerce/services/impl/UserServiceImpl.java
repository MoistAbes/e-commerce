package dev.zymixon.e_commerce.services.impl;

import dev.zymixon.e_commerce.exceptions.UserNotFoundException;
import dev.zymixon.e_commerce.models.entities.UserEntity;
import dev.zymixon.e_commerce.repositories.UserRepository;
import dev.zymixon.e_commerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getUser(Long userId) throws UserNotFoundException {

        Optional<UserEntity> user = userRepository.findById(userId);

        if (user.isPresent())
            return user.get();
        else
            throw new UserNotFoundException();
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
