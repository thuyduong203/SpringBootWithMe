package com.b1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    //để spring biết nơi nó khởi chạy lần đầu, để nó cài
    //đặt mọi thứ: sử dụng anotation: @SpringBootApplication
    //và gọi SpringApplication.run(App.class, args); để chạy project.
    //một trong những nhiệm vụ chính của Spring là tạo ra 1 Container chứa các
    //Dependency:
    //SpringApplication.run(App.class, args)
    // chính là câu lệnh để tạo ra container.
    // Sau đó nó tìm toàn bộ các dependency trong project của bạn và đưa vào đó.
    //Spring đặt tên cho container là ApplicationContext
    //và đặt tên cho các dependency là Bean
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        // ApplicationContext chứa toàn bộ dependency trong project.
        ApplicationContext context = SpringApplication.run(Application.class, args);
        // 1. Annotation @Component: la mot annotation de danh dau Class,
        //giup Spring biet no la Bean
//ví dụ:
        //1. có 1 interface Outfit: chứa phương thức trừu tượng wear()
        //2. 1 class Bikini, implement Interface Outfit
        //- đánh dấu Class này bằng @Component
        //=> Class này sẽ được Spring hiểu là 1 Bean (hoặc 1 dependency)
        // va se duoc Spring boot quan ly
        //chay chuong trinh:
        //khi chay chuong tring, luc nay context(line 22)
        //se chua cac Bean co danh dau @Component
        //lay Bean ra:

        System.out.println("Met moi vai");
        Outfit outfit = context.getBean(Outfit.class);
        System.out.println("Instance: " + outfit);
        outfit.wear();
        //3.Tao Class Girl, thuoc tinh Outfit.
        //danh dau @Component => Spring boot can tao ra mot instance
        //cua Girl de quan ly
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);
        girl.outfit.wear();
        //Singleton:
        //-	"Singleton" là một mẫu thiết kế trong lập trình phần
        // mềm được sử dụng để đảm bảo rằng chỉ có một thể hiện
        // duy nhất của một lớp được tạo ra trong một ứng dụng.
        //-	Trong Java, Singleton được triển khai bằng cách tạo
        // một lớp có một phương thức tĩnh trả về một thể hiện
        // duy nhất của lớp đó. Để đảm bảo rằng chỉ có một thể
        // hiện của lớp được tạo ra, phương thức tạo của lớp đó
        // sẽ được đánh dấu là private, và lớp đó sẽ bao gồm một
        // trường tĩnh để lưu trữ thể hiện duy nhất của lớp đó.
        //=> Cac Bean trong ApplicationContext deu la singleton.
        //chay chuong trinh de thay:
        //Instance: com.b1.Bikini@57272109
        //Mac bikini
        //Girl Instance: com.b1.Girl@59696551
        //Girl Outfit: com.b1.Bikini@57272109
        //Mac bikini => Girl Outfit va Instance la 1
        //=> co nghia la: tat ca cac Bean duoc quan ly trong ApplicationContext
        // deu chi duoc tao ra mot lan duy nhat. khi co yeu cau @Autowired
        //thi no se lay doi tuong co san trong ApplicationContext de inject vao
        //thong TH ban muon moi lan su dung la 1 instance hoan toan moi, thi danh dau
        //@Component do la @Scope("prototype")
        //=> chay chuong trinh de thay:
        //Instance: com.b1.Bikini@5cf3157b
        //Mac bikini
        //Girl Instance: com.b1.Girl@625dfff3
        //Girl Outfit: com.b1.Bikini@26350ea2
        //Mac bikini => Instance va girl outfit da khac nhau
    }

}
