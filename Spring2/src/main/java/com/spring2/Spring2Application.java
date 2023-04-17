package com.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring2Application {

    public static void main(String[] args) {
        //Trong thực tế, sẽ có trường hợp chúng ta sử dụng @Autowired
        // khi Spring Boot có chứa 2 Bean cùng loại
        // trong Context.
        //
        //Lúc này thì Spring sẽ bối rối và
        // không biết sử dụng Bean nào để inject vào đối tượng.
        //Đại khái là, trong quá trình cài đặt,
        // nó tìm thấy tới 2 đối tượng thoả mãn Outfit.
        // Giờ nó không biết sử dụng cái nào để inject vào
        // trong Girl
        //de giai quyet van de nay:
        //cach 1: su dung @Primary key
        //@Primary là annotation đánh dấu trên một Bean, giúp
        // nó luôn được ưu tiên lựa chọn trong trường hợp có
        // nhiều Bean cùng loại trong Context.
        //Cach 2: Su dung Annotation: @Qualifier => xac dinh ten
        //cua Bean ma ban muon chi dinh Inject
        //(dat ten vao Component)
        ApplicationContext context = SpringApplication.run(Spring2Application.class, args);
        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);
        girl.outfit.wear();
    }

}
