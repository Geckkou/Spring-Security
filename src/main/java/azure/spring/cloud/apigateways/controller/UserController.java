package azure.spring.cloud.apigateways.controller;

import azure.spring.cloud.apigateways.data.UserData;
import azure.spring.cloud.apigateways.services.UserDetailServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailServiceImpl userDetailService;

    public UserController(UserDetailServiceImpl userDetailService) {
        this.userDetailService = userDetailService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUsers(){
        return userDetailService.listUsers();
    }


}
