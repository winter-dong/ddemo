package com.song.ddemo.web;

import com.song.ddemo.entity.dto.UserDto;
import com.song.ddemo.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登陆成功后的基本操作
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getInfo")
    public UserDto getInfo() {
        return new UserDto();
    }

    @RequestMapping("/setName")
    public void setName(HttpServletRequest request,
                        @RequestParam(value = "name", required = true) String name,
                        Model model) {
        if(StringUtils.isBlank(name)) {
            model.addAttribute("error", "名字不能为空");
            return;
        }
    }

}
