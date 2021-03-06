package com.sydoruk1ua.homework.home21.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sydoruk1ua.homework.home21.json.entity.User;

import java.io.File;
import java.io.IOException;

public class JsonParser {
    public User getUserFromFile(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
            user = mapper.readValue(new File(fileName), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }

    public String putUserToString(User user) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        throw new CouldWriteToStringException();
    }
}
