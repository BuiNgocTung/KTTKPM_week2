package iuh.se.vn.controllers;

import iuh.se.vn.service.ApiGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ApiGatewayContronller {
    @Autowired
    private ApiGatewayService apiGatewayService;


    @GetMapping("/listUser")
    public List<Map<String, Object>> getAllUsers(){
        List<Map<String, Object>> userList = apiGatewayService.getAllUser();
        return userList;
    }
    @GetMapping("/listProduct")
    public List<Map<String, Object>> getAllProduct(){
        List<Map<String, Object>> userList = apiGatewayService.getAllProduct();
        return userList;
    }
}
