package homework15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
 Я знаю что все улосвные операторы в теории возможно правильнее делать было бы в отедльном приватном методе, но мне было лень.
 Вот тебе за то что ты не будешь обращать внимание на мелкие недочеты, набор моего шарющего препода, анонимус и фортнайт
⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⡿⠋⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠙⠿⣿⣿⣿
⣿⣿⡏⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢹⣿⣿
⣿⣿⠁⠄⣀⣤⣤⣄⣀⠄⠄⠄⠄⠄⠄⣀⣤⣤⣤⣄⠄⠄⢿⣿
⣿⡇⠄⠚⠉⠛⠿⢿⣿⣷⡄⠄⠄⢠⣾⣿⡿⠿⠛⠉⠓⠄⢸⣿
⣿⡇⠄⠄⠄⣀⣀⠄⠙⣿⡅⠄⠄⢨⡿⠋⠄⣀⣀⠄⠄⠄⢸⣿
⣿⡇⢀⣴⣿⣿⣿⣿⣶⣼⣷⠄⠄⠈⢠⣶⣿⣿⣿⣿⣦⣀⣸⣿
⣿⡇⠘⠋⠉⠉⠉⠁⠄⢸⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿
⣿⣿⡄⠄⠄⠄⠄⠄⠄⣾⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⣿
⣿⣿⡽⣦⣤⠤⠤⠄⣾⢿⣿⠄⠄⠄⠳⡄⠠⠤⣤⣤⣴⢿⣿⣿
⣿⣿⣧⣻⣽⣦⣄⠄⠉⠸⡇⠄⠄⡀⠄⠁⠄⢀⣾⢏⡟⣼⣿⣿
⣿⣿⣿⣧⡹⣿⠿⢿⣷⣿⣿⠟⢿⣿⣶⣶⣾⠿⣿⡟⣼⣿⣿⣿
⣿⣿⣿⣿⣧⡘⢿⣦⡈⡉⠉⠛⠒⠋⠉⠉⠁⣠⢏⣼⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣷⡘⢿⠄⠁⠙⣿⣿⠂⠄⠄⡴⢃⣾⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣎⠄⠄⢰⣿⣿⠄⠄⠄⣠⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠸⣿⣿⠄⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿

⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⡆
⣿⣏⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⣿⡇
⢸⣿⣤⣤⣤⣤⣤⣤⠄⠄⠄⣤⣤⣄⠄⠄⢸⣿⡇
⢸⣿⣿⣿⣿⣿⣿⣿⣤⣤⣤⣿⣿⣿⣀⣀⣸⣿⡇
⢸⣿⣿⡿⠋⠁⠄⠄⠄⠄⠄⠄⠄⠈⠙⢿⣿⡛⠃
⣿⣿⠄⠄⠠⣴⣶⣶⣶⣶⣶⣦⠄⠄⢸⣿⡇
⣿⣿⣆⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣼⣿⡇
⣿⣿⠿⠿⠷⠶⠶⠤⠤⠴⠶⠶⠾⠿⢿⣿⡇
⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⡇
⢹⣿⠿⠟⠛⠋⠄⠄⠘⠿⠿⠟⠄⠄⢸⣿⡇
⢸⣿⠄⠄⢀⣀⣤⣄⠄⠄⠄⠄⢀⣠⣾⣿⡇
⢸⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠉⢹⣿⡇
⢸⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⡇
⢸⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⠄⠄⠄⣸⣿⡇
⢸⣿⡟⠛⠛⠛⠛⠛⠛⠛⠛⠒⠒⠒⢻⣿⡇
⢸⣿⣇⣀⣀⣀⣀⡀⠄⠄⠄⠄⠄⠄⣘⣿⡇
⢸⣿⠿⠟⠛⠉⠄⠄⠄⠠⠴⠶⠿⠿⠿⣿⡇
⣸⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⡇
⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⣿⡇
⣿⣿⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⣿⡇
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠉⠉⠉⣿⣿⡇
⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⡇
⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⠄⠄⠄⣿⣿⡇
⢸⣿⡟⠛⠛⠛⠛⠛⠛⠛⠛⠛⠒⠒⠒⠛⣿⣧
⢸⣿⠄⠄⠄⣀⣀⣀⠄⠄⢀⣀⣀⠄⠄⠄⢿⣿
⣿⣿⠄⠄⠄⣿⣿⣿⣀⣀⣸⣿⣿⠄⠄⠄⢸⣿
⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠇
* */

public class StreamTask {

  public void firstStreamTask() {
      // Не души за дистинкт
      Optional<Object> firstStream = Stream.empty().limit(10).distinct().findAny();
      System.out.println(firstStream);
  }
  public void secondStreamTask(){
      List<String> arrayList = new ArrayList<>();
      arrayList.add("");
      for (int i = 1; i <= 9; i++) {
          arrayList.add(i + " hundred bucks");
          System.out.println(arrayList.get(i));
      }
      //Я знаю что Сет и так хранит уникальные значения, не души за дистинкт
      Set<String> set = arrayList.stream().distinct().filter(e->e.equals("3 hundred bucks")).collect(Collectors.toSet());
      System.out.println(set);
  }
  public void thirdStreamTask(){
      Set<Integer> fuckingIntegerSet = new HashSet<>();
      for (int i = 0; i >= -5; i--) {
          fuckingIntegerSet.add(i);
      }
      List<Integer> fuckingIntegerList = fuckingIntegerSet.stream().collect(Collectors.toList());
  }
  public void fourthStreamTask(){
      Map<Integer,String> map = new HashMap<>();
      for (int i = 0; i < 15; i++) {
          String word = ( i % 2 >= 1)? " hundred bucks" : " next door";
          map.put(i,word);
          System.out.println(map.get(i));
      }
      // Крч написано вывести в виде коллекции Лист же тоже является коллекцией, вот и выведу в лист
      List<Integer> list = map.keySet().stream().collect(Collectors.toList());
      list.forEach(System.out::println);
  }
  // Я знаю что это можно было сделать легким способ за счет .asList, но я хочу чтобы оно мне само генерило числа + я хочу играть в фором и тернарным оператором.
  public void fifthStreamTask(){
      List<String> arrayList = new ArrayList<>();
      for (int i = 0; i <= 9; i++) {
          int multiply = (i >= 1)? i * i : i;
          String intInString = String.valueOf(multiply);
          arrayList.add(intInString);
      }
      arrayList.stream().skip(1).limit(8).mapToInt(Integer::parseInt).filter(i -> i % 2 == 0)
              .distinct().forEach(System.out::println);
  }
  public void sixthStreamTask(){
      Stream<String> babyString = Stream.of("lol","kek","cheburek");

      Optional<String> babyMomyString = babyString.parallel().filter(i -> i.length() <= 3).sorted().reduce((i, b) -> String.valueOf(i.length() + b.length()));
      System.out.println(babyMomyString);
  }

  public static void seventhStreamTask(){
      List<FuckingHorse> horseList = new ArrayList<>();
      horseList.add(new FuckingHorse("Little fucking horse"));
      horseList.add(new FuckingHorse("Smart fucking horse"));
      horseList.add(new FuckingHorse("Gachi big fucking horse"));

      List<Integer> streamHorseList = horseList.stream().map(FuckingHorse::hashCode).skip(1).map(StreamTask::parse)
              .sorted(Integer::compare).collect(Collectors.toCollection(ArrayList::new));
      horseList.forEach(System.out::println);


  }

    public static Integer parse(Integer lol) {
        return 2+2;
    }

}
