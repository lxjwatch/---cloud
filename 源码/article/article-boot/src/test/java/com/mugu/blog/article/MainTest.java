package com.mugu.blog.article;

import java.util.UUID;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));
    }
}
