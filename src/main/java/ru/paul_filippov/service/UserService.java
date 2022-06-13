package ru.paul_filippov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.paul_filippov.model.User;
import ru.paul_filippov.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public void saveUser(@Valid User user) {
        userRepository.save(user);
    }
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
