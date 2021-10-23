package songsearch.service.impl;

import org.springframework.stereotype.Service;
import songsearch.service.NameService;

@Service
public class WorldServiceImpl implements NameService {

    @Override
    public String getName() {
        return "World";
    }
}
