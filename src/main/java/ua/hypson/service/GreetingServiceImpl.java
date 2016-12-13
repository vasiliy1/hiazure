package ua.hypson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.hypson.domain.Greeting;
import ua.hypson.repository.GreetingRepository;

/**
 * @author vasiliy
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting getGreeting(Long id) {
        return greetingRepository.findOne(id);
    }

    @Override
    public void save(Greeting greeting) {
        greetingRepository.save(greeting);
    }
}
