package com.htrap.UserDTO.Service;

import com.htrap.UserDTO.Model.Users;
import com.htrap.UserDTO.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserRepository userRepository;

    List<Users> users;
    Message message = new Message();

    //READ all Data
    public Message getAllData() {

        String sql = "Select * from dbo.Users";
        users = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Users.class));

        for (Users users1 : users) {
            System.out.println();
            System.out.println("user id :" + users1.getId());
            System.out.println("user firstName :" + users1.getFirstName());
            System.out.println("user lastName :" + users1.getLastName());
            System.out.println("user email :" + users1.getEmail());
            System.out.println();
        }

        message.message = "All data's are :";
        message.setData(users);
        return message;
    }

    // ADD|Create Data
    public Message getData(Long id) {

        String sql = "Select * from dbo.Users where id = " + id + ";";
        users = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Users.class));
        message.setMessage("Selected number :" + id + " data are:");
        message.setData(users);
        return message;
    }
}
