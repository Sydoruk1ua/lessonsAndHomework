package com.sydoruk1ua.homework.home21.serialization;

import com.sydoruk1ua.homework.home21.serialization.entity.User;

import java.io.*;

public class Serializer {
    public boolean serialization(User s, String fileName) {
        boolean flag = false;
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(s);
            flag = true;
        } catch (FileNotFoundException e) {
            System.err.println("File can't be created: " + e);
        } catch (NotSerializableException e) {
            System.err.println("Class does not support serialization: " + e);
        } catch (IOException e) {
            System.err.println(e);
        }
        return flag;
    }

    public User deserialization(String fileName) throws InvalidObjectException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            User user = (User) inputStream.readObject();
            return user;
        } catch (ClassNotFoundException ce) {
            System.err.println("Class doesn't exist: " + ce);
        } catch (FileNotFoundException e) {
            System.err.println("File for deserialization doesn't exist: " + e);
        } catch (InvalidClassException ioe) {
            System.err.println("Class version mismatch: " + ioe);
        } catch (IOException ioe) {
            System.err.println("General I/O error: " + ioe);
        }
        throw new InvalidObjectException("Object not restored");
    }
}
