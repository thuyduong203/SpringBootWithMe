package com.example.spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring3Application {
    //1. tạo class Girl:
    public static void main(String[] args) {
        System.out.println("Truoc khi IoC Container duoc khoi tao");
        ApplicationContext context = SpringApplication.run(Spring3Application.class, args);
        System.out.println("Sau khi khoi tao");
        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        Girl girl = context.getBean(Girl.class);
        System.out.println("Truoc khi IoC Container destroy Girl");
//Đoạn mã này đang thực hiện việc gọi phương thức destroyBean() trên đối
// tượng BeanFactory của một đối tượng context kiểu ConfigurableApplicationContext.
// Phương thức này được sử dụng để hủy bỏ một Bean (đối tượng) trong BeanFactory của ứng dụng.
//girl là tên của Bean (đối tượng) cần được hủy bỏ. Điều này có thể đại diện cho tên
// của một Bean cụ thể trong ứng dụng, ví dụ: girl có thể là tên của một đối tượng đại
// diện cho một cô gái trong hệ thống. Có thể đây là một tên
// được định nghĩa trước đó trong mã nguồn của ứng dụng.
        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
        System.out.println("Sau khi IoC Container destroy Girl");
    }

}
