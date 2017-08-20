package com.tutorials.services;

import org.springframework.stereotype.Service;

/**
 * Service class written to introduce dependency in controller
 * 
 * @author arunpanayappan
 *
 */

@Service
public class GreetingService {
    public String greet() {
        return "Hello World";
    }
}