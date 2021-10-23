package songsearch.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import songsearch.service.NameService;

@Service
@Primary
public class NameServiceImpl implements NameService {

    @Override
    public String getName() {
        return "Dmitry";
    }
}
