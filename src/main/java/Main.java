import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        String[] orders = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
        String[] orders2 = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};


//        Map<String, Set<String>> customer = new HashMap<>();
//
//        List<String[]> orderList = Arrays.stream(orders2).map(o -> o.split(" ")).collect(Collectors.toList());
//        orderList.forEach(c->{
//            String[] menus = Arrays.copyOfRange(c, 1, c.length);
//
//
//            HashSet<String> set = new HashSet<>(Arrays.asList(menus));
//            customer.put(c[0], set);
//        });
//
//
//
//        int max = customer.entrySet().stream()
//                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
//                .get().getValue();
//        String[] answer = customer.entrySet().stream().filter(s -> s.getValue() == max).map(s -> s.getKey()).sorted().toArray(String[]::new);
//
//
//        System.out.println(answer);


    }
}
