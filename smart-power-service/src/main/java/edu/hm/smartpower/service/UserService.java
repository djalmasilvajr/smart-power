package edu.hm.smartpower.service;

import edu.hm.smartpower.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Defines {@link User} related service methods
 *
 */
public interface UserService extends UserDetailsService {

    /**
     * Gets the currently logged in user
     *
     * @return the currently logged in user
     */
    User getCurrentUser();

    void createAccount(String username, String password);
}
