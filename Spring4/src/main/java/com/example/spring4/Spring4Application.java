package com.example.spring4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring4Application {
    //1. tao 1 doi tuong Girl gom thuoc tinh name-String va cac phuong thuc constructor, getter, setter, toString()
    //2.tao Interface GirlRepository
    //3.Tao class GirlRepositoryImpl ke thua
    // Interface GirlRepository va danh dau no la @Repository
    //4.tao Class GirlService, su dung @Service, @Autowired
    //5.chya chuong trinh
    //=>Về bản chất @Service và @Repository cũng chính là @Component.
    // Nhưng đặt tên khác nhau để giúp chúng ta phân biệt
    // các tầng với nhau.
    //@Component đánh dấu cho Spring Boot biết Class đó là Bean.
    // Và hiển nhiên @Service và @Repository cũng vậy.
    // Vì thế ở ví dụ trên chúng ta có
    // thể lấy GirlService từ ApplicationContext.
    //Về bản chất thì bạn có thể sử dụng thay thế
    // 3 Annotation @Component, @Service và @Repository
    // cho nhau mà không ảnh hưởng gì tới code của bạn cả.
    // Nó vẫn sẽ hoạt động.
    //
    //Tuy nhiên từ góc độ thiết kế thì chúng ta cần phân
    // rõ 3 Annotation này cho các Class đảm nhiệm
    // đúng nhiệm vụ của nó.
    //
    //@Service gắn cho các Bean đảm nhiệm xử lý logic
    //@Repository gắn cho các Bean đảm nhiệm giao tiếp
    // với DB
    //@Component gắn cho các Bean khác.
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring4Application.class, args);
        //lay ra GirlService
        GirlService girlService = context.getBean(GirlService.class);
        //lay ran dom:
        Girl girl = girlService.getRandomGirl();
        System.out.println(girl);
    }

}
