package per.chen.springboot.demo02.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/products")
public class Product {

    @GetMapping("test")
    public String test() {
        return "test";
    }


}
