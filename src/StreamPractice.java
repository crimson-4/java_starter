import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import  java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {
 public  static  void main(String [] args)
 {
     ArrayList<Integer> ai=new ArrayList<>(Arrays.asList(1,8,3,4,5,2,3,6,7,8,9,5));
     ai.stream().filter( el->el>5).distinct().forEach(System.out::println);
     List<String> words= List.of("apple", "banana", "avocado", "mango", "apricot");
     words.stream().filter((str)->str.startsWith("a")).forEach((str)->System.out.println(str.toUpperCase()));

     Map<Integer,List<String>> cnt= words.stream().filter((str)->str.startsWith("a")).collect(Collectors.groupingBy(String::length));
    System.out.println(cnt);
 }
}
