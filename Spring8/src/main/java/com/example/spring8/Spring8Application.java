package com.example.spring8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring8Application {

    public static void main(String[] args) {
        //Spring boot làm việc kiểu:
        //1: request từ client
        //2. => controller, controller gọi service
        //3. service xử lý => gửi kqua lại controller
        //4. gọi model, model trả data cho controller
        //6.controller đẩy lại view => response
        //khi sử dụng Spring boot với html:
        //mặc định các file html sẽ được lưu trữ trong
        //thư mục resources/templates
        //=> Spring boot + Thymleaf se tim kiem cac file nay theo ten
        //vi du: index <=> index.html
        //bat dau thuiii
        //1. dau tien tao 1 Class HelloWorldController va danh dau
        //la controller bang annotation @Controller
        //=> HelloWorldController la noi nhan request tu nguoi dung
        //Bản thân @Controller Cũng là một @Component nên nó sẽ được Spring Boot quản lý.
        //2.tao index.html trong templates
        //3. chay chuong trinh thoi ma
        SpringApplication.run(Spring8Application.class, args);
    }

}
