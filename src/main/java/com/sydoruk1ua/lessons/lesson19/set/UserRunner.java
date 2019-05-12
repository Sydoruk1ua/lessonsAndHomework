package com.sydoruk1ua.lessons.lesson19.set;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;

public class UserRunner {

    public static final String ALEX = "Alex";
    public static final String SURNAME = "surname";
    public static final String KIEV = "Kiev";

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        User user1 = new User(ALEX, SURNAME);
        User user2 = new User(ALEX, SURNAME);

        users.add(user1);
        users.add(user2);
        users.add(null);
        users.add(null);

        System.out.println(users.size());

        Comparator<User> userComparator = (o1, o2) -> {
            int compareNames = o1.getName().length() - o2.getName().length();
            return compareNames != 0 ? compareNames : o1.getSurname().length() - o2.getSurname().length();
        };
        Set<User> users2 = new TreeSet<>(userComparator);
        // users2.add(null);
        users2.add(user1);
        users2.add(user2);

        System.out.println(users2.size());

        Map<User, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        System.out.println(map.size());

        System.out.println("-------------------------------------");
        //_____________________________________________

        User userA = new User("A", "A", null);
        User userB = new User("B", "A", new Address("Kiev", 1000));
        User userC = new User("C", "B", new Address("Kiev", 2000));
        User userD = new User("C", "C", new Address("London", 2000));
        User userE = null;

        Set<User> userHashSet = new HashSet<>(asList(userA, userB, userC, userD));

        Set<User> result1 = userHashSet.stream()
                .filter(Objects::nonNull)
                .filter(user -> user.getAddress() != null)
                .filter(user -> KIEV.equals(user.getAddress().getCity()))
                .collect(toSet());

        Set<User> result2 = userHashSet.stream()
                .filter(user -> KIEV.equals(Optional.ofNullable(user)
                        .map(User::getAddress)
                        .map(Address::getCity)
                        .orElse(null)))
                .collect(toSet());

        result2.forEach(System.out::println);

        Iterator<User> iterator = userHashSet.iterator();
/*
        for (int i = 0; i < userHashSet.size(); i++) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next().getAddress().getCity());
            }
        }
*/

        Set<User> tempSet = new HashSet<>();
        for (User user : userHashSet) {
            String city = Optional.ofNullable(user)
                    .map(User::getAddress)
                    .map(Address::getCity)
                    .orElse(null);
            //  String city = user.getAddress().getCity();
            //                    .filter(city1 -> city1.equals(KIEV))
            //TODO:
            if (KIEV.equals(city)) {
                tempSet.add(user);
            }
        }

        Address address1 = new Address("London", 1);
        Address address2 = new Address("London", 2);
        Address address3 = new Address("Kiev", 1);
        Address address4 = new Address(null, 2);
        Address address5 = null;
        User userA1 = new User("A", "B", address1, asList(address1, address5));
        User userA2 = new User("A", "B", address5, asList(address2, address5, address1));
        User userA3 = new User("C", "A", address2, asList(address5, address1));

        Set<User> userSet = new HashSet<>(asList(userA1, userA2, userA3, null));
//        List<String> cities = new ArrayList<>();
        /*for (User user : userSet) {
            if (user != null) {
                List<Address> addressList = user.getAddressList();
                if (addressList != null) {
                    for (Address address : addressList) {
                        if (address != null) {
                            String city = address.getCity();
                            if (city != null) {
                                cities.add(city);
                            }
                        }
                    }
                }
            }
        }*/
        Set<String> cities = userSet.stream()
                .filter(Objects::nonNull)
//                .filter(user -> user.getAddressList() != null)
                .flatMap(user -> user.getAddressList().stream())
                .filter(Objects::nonNull)
                .map(Address::getCity)
                .filter(Objects::nonNull)
                .collect(toSet());
          /*      .forEach(user -> {
                    List<Address> addressList = user.getAddressList();
                    if (addressList != null) {
                        addressList.stream()
                                .filter(Objects::nonNull)
                                .forEach(address -> {
                                    if (address.getCity() != null) {
                                        cities.add(address.getCity());
                                    }
                                });
                    }
                });*/
    }
}
