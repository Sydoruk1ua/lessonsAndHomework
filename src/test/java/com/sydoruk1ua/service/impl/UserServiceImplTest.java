package com.sydoruk1ua.service.impl;

import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    public static final String USER_EMAIL = "alex@gmail.com";
    public static final String USER_PASSWORD = "password";
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
        when(userRepository.findByUserId(1L)).thenReturn(new User(1L, USER_EMAIL, USER_PASSWORD));

        User actual = userService.findByUserId(1L);
        User expected = new User(1L, USER_EMAIL, USER_PASSWORD);
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

    @Test
    public void userShouldBeSaved() {
        User user = new User(1L, USER_EMAIL, USER_PASSWORD);
        doNothing().when(userRepository).save(user);
        userService.save(user);
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void shouldNotSaveNullValue() {
        //   User user = new User(1L, USER_EMAIL, USER_PASSWORD);
        //  doNothing().when(userRepository).save(null);
        userService.save(null);
        verify(userRepository, times(0)).save(null);
    }

    private void assertUser(User expected, User actual) {
        assertEquals(expected.getUserId(), actual.getUserId());
        assertEquals(expected.getEmail(), actual.getEmail());
        //...
    }
}