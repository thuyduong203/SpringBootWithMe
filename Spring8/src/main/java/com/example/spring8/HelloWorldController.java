package com.example.spring8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//1. dau tien tao 1 Class HelloWorldController va danh dau
//la controller bang annotation @Controller
//=> HelloWorldController la noi nhan request tu nguoi dung
//Bản thân @Controller Cũng là một @Component nên nó sẽ được Spring Boot quản lý.
@Controller
public class HelloWorldController {
    //Don nhan request GET:
    @GetMapping("/") // neu nguoi dung request toi dia chi "/"
    public String hello1() {
        return "index"; // tra ve ten file html
    }

    //Don nhan request GET:
    @GetMapping("/hello2") // neu nguoi dung request toi dia chi "/hello2"
    public String hello2() {
        return "hello2"; // tra ve ten file html
    }

    @GetMapping("/hello3") // neu nguoi dung request toi dia chi "/hello3"
    public String hello3() {
        return "hello3"; // tra ve ten file html
    }

    //Get /hello
    @GetMapping("/ket-qua-hello3")
    //RequestParam "name" se duoc gan gia tri vao bien String.
    //Model la mot obj cua Spring boot
    //duoc gan vao trong moi request
    //Model ở đây là một object được Spring Boot đính kém trong mỗi response.
    //Model chứa các thông tin mà bạn muốn trả về và Template Engine
    // sẽ trích xuất thông tin này ra thành html và đưa cho người dùng.
    //Trong file hello.html tôi lấy giá trị
    // của name trong Model ra bằng cách sử dụng cú
    // pháp của Thymeleaf
    //
    //<h1 th:text="'Hello, ' + ${name}"></h1>
    public String hello3(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("name", name);
        return "ket-qua-hello3";
    }
}
