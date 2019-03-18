/**
 * Класс QueuePostOffice.
 * У нас имеется очередь из 4-х человек,
 * следующим шагом к ним добавляются,
 * еще люди пенсионеров пропускаем вперёд,
 * далее обслужаются люди в порядке очереди.
 * @version 1.10 17 Mar 2019.
 * @author  Igor Tsukanov.
 */

import java.util.*;

class Car {
    public static void main(String[] args) {
        Scanner stringSc = new Scanner(System.in);
        int y = 0;
        /*Пенсионный возраст*/
        int r = 64;
        LinkedList<Integer> human = new LinkedList<>();
        /* Решил, что в очереди у нас уже имеются
        4 человека с возростами 21, 45, 67 и 38*/
        human.add(21);
        human.add(45);
        human.add(67);
        human.add(38);

        /* К их очереди присоединяются еще
        n-ое (humaninpost) кол-во людей*/
        System.out.println("Введите кол-во людей, " +
                "которое добавляется в очереди: ");
        int humaninpost = stringSc.nextInt();
        for (int i = 0; i < humaninpost; i++) {
            System.out.println("Введите свой возраст: ");
            String vozract = stringSc.next();
            human.add(Integer.valueOf(vozract));
        }
        System.out.println("Люди будут обслуживаться " +
                "в следующем порядке соглсно своему возрасту");
        System.out.println (human.size());
        for (int i = 0; i < human.size(); i++) {
            if (human.get(i) > r) {
                System.out.print(human.remove(i) + " ");
            }
        }
        while (human.size() > 0) {
            System.out.print(human.remove() + " ");
        }
    }
}
