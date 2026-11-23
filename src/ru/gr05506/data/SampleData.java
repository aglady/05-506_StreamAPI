package ru.gr05506.data;

import ru.gr05506.domain.Order;
import ru.gr05506.domain.OrderItem;
import ru.gr05506.domain.OrderStatus;
import ru.gr05506.domain.Student;

import java.util.List;

public final class SampleData {
    private SampleData(){}

    public static final Student ANNA = new Student(1, "Анна Смирнова", "05-501", 2);
    public static final Student BORIS = new Student(2, "Борис Иванов", "05-501", 2);
    public static final Student VERA = new Student(3, "Вера Кузнецова", "05-502", 2);
    public static final Student RUSLAN = new Student(4, "Руслан Гильманов", "05-403", 3);
    public static final Student GLEB = new Student(5, "Глеб Орлов", "05-502", 2);
    public static final Student EGOR = new Student(6, "Егор Волков", "05-403", 3);
    public static final Student ZHANNA = new Student(7, "Жанна Ким", "05-601", 1);

    private static final List<Student> STUDENTS = List.of(ANNA, BORIS, VERA, RUSLAN, GLEB, EGOR, ZHANNA);

    private static final List<Order> ORDERS = List.of(
            new Order(101, ANNA, List.of(
                    new OrderItem("Методичка по матанализу", 2, 300),
                    new OrderItem("Ручка", 3, 50)
            ), OrderStatus.PAID),
            new Order(102, BORIS, List.of(
                    new OrderItem("Тетрадь", 5, 80)
            ), OrderStatus.NEW),
            new Order(103, ANNA, List.of(
                    new OrderItem("Калькулятор", 1, 2500),
                    new OrderItem("Бумага А4", 2, 400)
            ), OrderStatus.SHIPPED),
            new Order(104, VERA, List.of(
                    new OrderItem("Папка", 4, 120),
                    new OrderItem("Ручка", 2, 50)
            ), OrderStatus.CANCELLED),
            new Order(105, GLEB, List.of(
                    new OrderItem("Методичка по матанализу", 1, 300),
                    new OrderItem("Тетрадь", 3, 80)
            ), OrderStatus.PAID),
            new Order(106, RUSLAN, List.of(
                    new OrderItem("Калькулятор", 1, 2500)
            ), OrderStatus.PAID)
    );

    public static List<Student> students() {return STUDENTS;}
    public static List<Order> orders() {return ORDERS;}
}
