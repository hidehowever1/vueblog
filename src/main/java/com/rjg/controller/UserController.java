package com.rjg.controller;


import com.rjg.commom.lang.Result;
import com.rjg.entity.User;
import com.rjg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-07-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/index")
    public Result getUserById(){
        User user=userService.getById(1L);
        return Result.succ(user);
    }
    @PostMapping("/save")
    public Result save(@Validated @RequestBody  User user){

        return Result.succ(user);


    }

}
