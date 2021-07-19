package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    void addUser(UserDTO dto);

    boolean nicAlreadyExists(String nic);

    void deleteUser(String id);

    UserDTO searchUser(String id);

    ArrayList<UserDTO> getAllUsers();

    void updateUser(UserDTO dto);
}
