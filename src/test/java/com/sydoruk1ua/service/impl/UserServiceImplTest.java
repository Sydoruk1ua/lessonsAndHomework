package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    /*
        private UserRepository userRepository = new UserRepository() {
            @Override
            public User findByEmail(String email) {
                return new User(1L, "alex@gmail.com", "password");
            }

            @Override
            public User findByUserId(Long userId) {
                return new User(1L, "alex@gmail.com", "password");
            }
        };
    */
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void shouldReturnUserById() {
        when(userRepository.findByUserId(1L)).thenReturn(new User(1L, "alex@gmail.com", "password"));

        User actual = userService.findByUserId(1L);
        User expected = new User(1L, "alex@gmail.com", "password");
        assertEquals(expected, actual);

        // assertUser(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturnUserById1() {
//        when(userRepository.findByUserId(1L)).thenReturn(new User(1L, "alex@gmail.com", "password"));
        when(userRepository.findByUserId(2L)).thenThrow(RuntimeException.class);
        userService.findByUserId(2L);
   /*     User actual = userService.findByUserId(1L);
        User expected = new User(1L, "alex@gmail.com", "password");*/
        // assertEquals(expected, actual);

        // assertUser(expected, actual);
    }

    private void assertUser(User expected, User actual) {
        assertEquals(expected.getUserId(), actual.getUserId());
        assertEquals(expected.getEmail(), actual.getEmail());
        //...
    }
}