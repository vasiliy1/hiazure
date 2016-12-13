package ua.hypson.service;

import ua.hypson.domain.Greeting;

/**
 * @author vasiliy
 */
public interface GreetingService {
    Greeting getGreeting(Long id);

    void save(Greeting greeting);
}
