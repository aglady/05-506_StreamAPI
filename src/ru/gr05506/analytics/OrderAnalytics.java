package ru.gr05506.analytics;

import ru.gr05506.domain.Order;
import ru.gr05506.domain.OrderItem;
import ru.gr05506.domain.Student;

import java.util.List;

public final class OrderAnalytics {
    private OrderAnalytics(){}

    public static List<String> customerNames(List<Order> orders){
        return orders.stream()
                .map(Order::customer)
                .map(Student::name)
                .distinct()
                .sorted()
                .toList();
    }

    public static List<String> products(List<Order> orders){
        return orders.stream()
                .flatMap(o -> o.items().stream())
                .map(OrderItem::product)
                .distinct()
                .sorted()
                .toList();
    }
}
