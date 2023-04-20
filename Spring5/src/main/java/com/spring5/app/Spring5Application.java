package com.spring5.app;

import com.spring5.Girl;
import com.spring5.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.spring5.others", "com.spring5"})
@SpringBootApplication(scanBasePackages = {"com.spring5.others", "com.spring5"})

public class Spring5Application {

    public static void main(String[] args) {
        //Mặc định khi chạy, Spring se do tim toan bo Class cung cap
        //hoac o torng pk thap hon va tao ra Bean tu cac Class tim thay.
        //trong bai nay: tao Class Girl cung pl voi Spring5Application
        //2. tao pk others, Class OtherGirl thuoc pk others(cung cao voi Spring App)
        //
        //
        //mac dinh
//        ApplicationContext context = SpringApplication.run(Spring5Application.class, args);
//        System.out.println("Khoi bean girl");
//        try {
//            Girl girl = context.getBean(Girl.class);
//            System.out.println("Bean: " + girl.toString());
//        } catch (Exception exception) {
//            System.out.println("bean Girl khong ton tai");
//        }
//        System.out.println("Khoi bean Other girl");
//        try {
//            OtherGirl otherGirl = context.getBean(OtherGirl.class);
//            System.out.println("Bean other girl: " + otherGirl.toString());
//
//        } catch (Exception exception) {
//            System.out.println("Bean Other girl khong ton tai");
//        }
        //=> mac dinh thi chuong trinh se chay ra ca 2 bean co nghia la:
        // Spring boot da di tim cac bean be canh Spring App
        //va nhung class thuoc pk ben canh Spring App
        //Trong TH ban muon tuy chinh cau hinh cho Spring boot
        //chi tim kiem cac Bean trong 1 pk nhat dinh thi co the dung 2 cach:
        //C1:
        //sU DUNG @ComponentScan
        //C2: su dung scanBasePackages trong Spring Application
        //Vi du cach 1: them @ComponentScan("duongDanDenPK) vao Class nay
//        ApplicationContext context = SpringApplication.run(Spring5Application.class, args);
//        System.out.println("Khoi bean girl");
//        try {
//            Girl girl = context.getBean(Girl.class);
//            System.out.println("Bean: " + girl.toString());
//        } catch (Exception exception) {
//            System.out.println("bean Girl khong ton tai");
//        }
//        System.out.println("Khoi bean Other girl");
//        try {
//            OtherGirl otherGirl = context.getBean(OtherGirl.class);
//            System.out.println("Bean other girl: " + otherGirl.toString());
//
//        } catch (Exception exception) {
//            System.out.println("Bean Other girl khong ton tai");
//        }
//    }
        //cach 2: su dung scanBasePackages
        //truyen tham so scanBasePackages va Annotation @SpringAppication
        //value la "duongDanDenPK");
        // luc nay chay chuong trinh cac Class danh dau @Component
        //trong pk others se duoc tim thay va Spring se tao Bean,
        //con lai thi khong
        //de cau hinh cho Spring cos the tim kiem Bean o nhieu pk khac nhau:
        //MULTIPLE PACKAGE SCAN
        //trong value cua @ComponentScan, hoac scanBasePackages thay
        //vi truyen vao 1 duong dan den 1 pk,
        //thi ta truyen vao 1 mang chua duong dan cua cac pk can spring scan
        //vi du:
//        ApplicationContext context = SpringApplication.run(Spring5Application.class, args);
//        System.out.println("Khoi bean girl");
//        try {
//            Girl girl = context.getBean(Girl.class);
//            System.out.println("Bean: " + girl.toString());
//        } catch (Exception exception) {
//            System.out.println("bean Girl khong ton tai");
//        }
//        System.out.println("Khoi bean Other girl");
//        try {
//            OtherGirl otherGirl = context.getBean(OtherGirl.class);
//            System.out.println("Bean other girl: " + otherGirl.toString());
//
//        } catch (Exception exception) {
//            System.out.println("Bean Other girl khong ton tai");
//        }
        ////@ComponentScan({"com.spring5.others", "com.spring5"})
        //@SpringBootApplication(scanBasePackages = {"com.spring5.others", "com.spring5"})
        //thay doi 1 trong 2 dong nhu tren, thi luc nay Bean o ca 2 pk se duoc tim va tao ra
        //bay gio thu o 1 package khac khong cung cap voi SpringApp nhe:
        //tao pk app, chuyen SpringApp vao pk nay
        //=> luc nay ta se co SpringApp va OtherApp thuoc 2 package cung cap voi nhau:
        ApplicationContext context = SpringApplication.run(Spring5Application.class, args);
        System.out.println("Khoi bean girl");
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception exception) {
            System.out.println("bean Girl khong ton tai");
        }
        System.out.println("Khoi bean Other girl");
        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean other girl: " + otherGirl.toString());

        } catch (Exception exception) {
            System.out.println("Bean Other girl khong ton tai");
        }
        //neu t ko cau hinh su dung @ComponentScan hoac tryen tham so cho
        //@SpringApplication thi ket qua chay chuong trinh se la
        //ko co bean nao duoc tao ra vi Spring chi dang tim bean
        //o nhung Class cung cap voi Class SpringApp, hoac nhung Class
        //nam trong pk cung cap voi Class nay. ma luc nay SpringApp cua toi
        //dang ow 1 minh torng pk app => ko co bean
        //thuc hien cau hinh de Spring boot tim Bean o cac pk
        //mong muon: dung ca kieu 1 pk hoac multiple, luc nay
        //Spring se tim bean theo duong dan ban truyen vao okeeee
        //o buc the nhoooooooooooooooo
        //=,=
    }
}
