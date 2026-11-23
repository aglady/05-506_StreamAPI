import ru.gr05506.data.SampleData;
import ru.gr05506.domain.Order;
import ru.gr05506.domain.OrderStatus;

void main() {
        var students = SampleData.students();
        var orders = SampleData.orders();

        // Имена покупателей, у которых есть оплаченные заказы, без повторов, по алфавиту
//    List<String> names = new ArrayList<>();
//    for (Order o: orders){
//        if (o.status() == OrderStatus.PAID){
//            String name = o.customer().name();
//            if (!names.contains(name)){
//                names.add(name);
//            }
//        }
//    }
//    Collections.sort(names);
        List<String> names = orders.stream()
                .filter(o -> o.status() == OrderStatus.PAID)
                .map(o -> o.customer().name())
                .distinct()
                .sorted()
                .toList();
        System.out.println(names);

        Stream<Order> stream = orders.stream();
        long n = stream.count();
        System.out.println(n);

        // Источник -> промежуточные операции -> терминальная операция -> результат

        // Способы создания потоков
        // 1.
        var s1 = orders.stream();
        // 2.
        String[] groups = {"05-503", "05-504", "05-505", "05-506", "05-507"};
        var s2 = Arrays.stream(groups);
        // 3.
        var s3 = Stream.of(1, 2, 3);
        var s4 = Stream.empty();
        // 4.
        List<Integer> powers = Stream.iterate(1, x -> x * 2).limit(10).toList();
        System.out.println(powers);
        // 5.
        var s5 = IntStream.rangeClosed(1, 100);
        System.out.println(s5.sum());
}