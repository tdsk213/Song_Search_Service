package songsearch.service.impl;

import org.springframework.stereotype.Service;
import songsearch.service.HelloService;

public class  HelloServiceImpl implements HelloService {
    @Override
    public String getHelloAsString() {
        return "Hello";
    }
}
