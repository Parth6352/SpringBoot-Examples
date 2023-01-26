package com.htrap.UserDTO.Service;

import com.htrap.UserDTO.Model.Users;
import lombok.Data;

import java.util.List;

@Data
public class Message {

    String message;

    List<Users> data;

}
