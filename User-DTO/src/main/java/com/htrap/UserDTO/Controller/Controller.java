package com.htrap.UserDTO.Controller;

import com.htrap.UserDTO.Service.Message;
import com.htrap.UserDTO.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping("/userData")
    public ResponseEntity<Message> getAllData() {
        Message message = userService.getAllData();
        return new ResponseEntity<Message>(message, HttpStatus.ACCEPTED);
    }

    @GetMapping("/userData/{id}")
    public ResponseEntity<Message> getData(@PathVariable Long id) {
        Message message = userService.getData(id);
        return new ResponseEntity<Message>(message,HttpStatus.ACCEPTED);
    }
}
