import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskLambda {

  public static void main(String[] args) {

    List<Integer> firstList = Arrays.asList(1, -3, 4, 5, 12, 1, -2, 8);
    Predicate<Integer> evenFunc = (a) -> a % 2 == 0;
    Map<Boolean, List<Integer>> even = firstList.stream()
        .collect(Collectors.partitioningBy(evenFunc));
    List<Integer> evenNumbers = even.get(true);
    List<Integer> oddNumbers = even.get(false);
    System.out.println(evenNumbers);
    System.out.println(oddNumbers);


    List<Integer> secondList = Arrays.asList(5, 3, -3, -60, 12, 22, -3, 12);
    Predicate<Integer> positiveFunc = (a) -> a > 0;
    Map<Boolean, List<Integer>> positiveNegative = secondList.stream()
        .collect(Collectors.partitioningBy(positiveFunc));
    List<Integer> positiveNumbers = positiveNegative.get(true);
    List<Integer> negativeNumbers = positiveNegative.get(false);
    System.out.println(positiveNumbers);
    System.out.println(negativeNumbers);


    int avaregeFirst = firstList.stream().mapToInt((a) -> a).sum() / 2;
    int avaregeSecond = secondList.stream().mapToInt((a) -> a).sum() / 2;
    System.out.println(avaregeFirst);
    System.out.println(avaregeSecond);

    
    Predicate<Integer> betweenFunc = (a) -> a > avaregeFirst || a < avaregeSecond;
    Map<Boolean, List<Integer>> betweenF = firstList.stream()
        .collect(Collectors.partitioningBy(betweenFunc));
    List<Integer> betweenAverageF = betweenF.get(false);

    Map<Boolean, List<Integer>> betweenS = secondList.stream()
        .collect(Collectors.partitioningBy(betweenFunc));
    List<Integer> betweenAverageS = betweenS.get(false);


    List<Integer> newAvaregeList = Stream.concat(betweenAverageF.stream(), betweenAverageS.stream())
        .collect(Collectors.toList());
    System.out.println(newAvaregeList);

  }

}