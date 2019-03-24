package com.sydoruk1ua;

import com.sydoruk1ua.entity.Item;
import com.sydoruk1ua.entity.Order;
import com.sydoruk1ua.entity.User;
import com.sydoruk1ua.repository.ItemRepository;
import com.sydoruk1ua.repository.OrderRepository;
import com.sydoruk1ua.repository.UserRepository;
import com.sydoruk1ua.service.ItemService;
import com.sydoruk1ua.service.OrderService;
import com.sydoruk1ua.service.UserService;
import com.sydoruk1ua.ui.ConsoleUi;

public class ConsoleApplication {
    public static final int MAX_NUMBER = 5;
    public static final int USER_NUMBER = 5;
    public static final int ORDER_NUMBER = 3;


    public static void main(String[] args) {
        Item[] items = new Item[MAX_NUMBER];
        items[0] = new Item(11L, "Shirt-S", 10000);
        items[1] = new Item(20L, "Shirt-M", 10500);
        items[2] = new Item(21L, "Shirt-L", 12000);
        items[3] = new Item(41L, "Shirt-XL", 13000);
        items[4] = new Item(42L, "Shirt-XLL", 13500);

        User[] users = new User[USER_NUMBER];
        users[0] = new User(1L, "alex@gmail.com", "1111");
        users[1] = new User(2L, "anna@gmail.com", "2222");
        users[2] = new User(3L, "boris@gmail.com", "3333");
        users[3] = new User(5L, "oleg@gmail.com", "4444");
        users[4] = new User(4L, "ian@gmail.com", "5555");

        Order[] orders = new Order[ORDER_NUMBER];
        //Orders should be added
        //orders[0] = new Order(1L, null, null);

        ItemRepository itemRepository = new ItemRepository(items);
        OrderRepository orderRepository = new OrderRepository(orders);
        UserRepository userRepository = new UserRepository(users);

        UserService userService = new UserService(userRepository);
        OrderService orderService = new OrderService(orderRepository);
        ItemService itemService = new ItemService(itemRepository);

        ConsoleUi consoleUi = new ConsoleUi(userService);
        consoleUi.run();
        System.out.println("test");
    }
}
