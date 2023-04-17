package com.spring2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Girl {
    //danh dau de Spring inject 1 doi tuong Outfit vao day:
    //@Autowired
    Outfit outfit;

    //Sau khi tìm thấy một class đánh dấu @Component.
    // thì quá trình inject Bean xảy ra theo cách như sau:
    //
    //Nếu Class không có hàm Constructor hay Setter.
    // Thì sẽ sử dụng Java Reflection để đưa đối tượng
    // vào thuộc tính có đánh dấu @Autowired.
    //Nếu có hàm Constructor thì sẽ inject Bean vào bởi
    // tham số của hàm
    //Nếu có hàm Setter thì sẽ inject Bean vào bởi
    // tham số của hàm
    //Như ví dụ ở trên tôi đã sử dụng cách Java Reflection
    // để inject Bean vào class Girl. Nếu không sử
    // dụng @Autowired thì bạn phải có một Constructor
    // thay thế, hoặc một Setter tương ứng.
    // Spring sẽ inject outfit thông qua Constructor trước
    //dung qualifier ne:
    public Girl(@Qualifier("bikini") Outfit outfit) {
        this.outfit = outfit;
    }

    // Nếu không tìm thấy Constructor thoả mãn, nó sẽ thông qua setter


    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }


}
