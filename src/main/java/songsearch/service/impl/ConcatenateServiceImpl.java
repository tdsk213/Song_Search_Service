package songsearch.service.impl;

import org.springframework.stereotype.Service;
import songsearch.service.ConcatenateService;
import songsearch.service.HelloService;
import songsearch.service.NameService;

@Service
public class ConcatenateServiceImpl implements ConcatenateService {

    private final HelloService helloService;
    private final NameService worldService;

    public ConcatenateServiceImpl(HelloService helloService, NameService worldService) {
        this.helloService = helloService;
        this.worldService = worldService;
    }


    @Override
    public void printString() {
        System.out.printf("%s, %s!\n", helloService.getHelloAsString(), worldService.getName());
    }
}
