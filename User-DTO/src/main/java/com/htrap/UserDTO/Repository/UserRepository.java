package com.htrap.UserDTO.Repository;

import com.htrap.UserDTO.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

}
