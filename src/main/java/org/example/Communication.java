package org.example;

import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import static org.springframework.http.MediaType.*;

@Component(value = "communication")
public class Communication {

    private final String URL = "http://94.198.50.185:7081/api/users";
    @Autowired
    private RestTemplate restTemplate;
    public String getAllUsers(){
        HttpHeaders headers= new HttpHeaders();
        headers.setAccept(List.of(APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(URL,
                HttpMethod.GET, entity, String.class);
//        response.getHeaders().get(Cookie.)
        System.out.println(response.getHeaders().get(HttpHeaders.SET_COOKIE));
        return String.valueOf(response);
    }


//    public void saveUser(User user) {
//        HttpEntity<User> requestBody = new HttpEntity<>(user);
//
//        ResponseEntity<User> result = restTemplate.postForEntity(URL, requestBody, User.class);
//        System.out.println("Status code:" + result.getStatusCode());
//
//        // Code = 200.
//        if (result.getStatusCode() == HttpStatus.OK) {
//            System.out.println( result.getBody());
//        }
//    }



//    public void saveUser(User user) {
//        Long id = user.getId();
//
//        if (id == 0) {
//            ResponseEntity<String> responseEntity =
//                    restTemplate.postForEntity(URL, user, String.class);
//            System.out.println(responseEntity.getBody());
//        } else {
//            restTemplate.put(URL, user);
//        }
//
//    }
//    public void deleteUserById(Long id) {
//        restTemplate.delete(URL + "/" + id);
//    }
}
