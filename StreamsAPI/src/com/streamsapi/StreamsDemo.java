package com.streamsapi;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo
{
    public static void show()
    {

//        var stream = Stream.of(
//                List.of(1,2,3), List.of(4,5,6)
//        );
        //stream.forEach(list -> System.out.println(list));
// Lists of Lists
//        stream.flatMap(list -> list.stream())
//        .forEach(n -> System.out.println(n));


        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);


//        List <Movie> movies = List.of(
//                new Movie("a",15, Genre.ACTION),
//                new Movie("c",6,Genre.COMEDY),
//                new Movie("b",25,Genre.THRILLER),
//                new Movie("g",45,Genre.ACTION),
//                new Movie("f",5,Genre.COMEDY),
//                new Movie("r",15,Genre.ACTION));
//
//
//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre);
//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.counting()));
//                        Collectors.toSet()));
       // System.out.println(result);

//        var result = movies.stream()
//                .filter(m -> m.getLikes()>10)
//                .map(Movie::getTitle)
//                .collect(Collectors.joining(","));
//                .collect(Collectors.summarizingInt(Movie::getLikes));
//                .collect(Collectors.toMap(Movie::getTitle,
//                        Function.identity()));
//                .collect(Collectors.toMap(m -> m.getTitle(),
//                        m -> m.getLikes()));
       // System.out.println(result);
//
//        var res= movies.stream()
//                .map(Movie::getLikes)
//                .reduce(Integer::sum);
//
//        System.out.println(res);

//        var res= movies.stream()
//                .findFirst().get();
//        System.out.println(res.getTitle());

//        var res= movies.stream()
//                .allMatch(m -> m.getLikes() > 20);
//        System.out.println(res);

//        var res= movies.stream()
//                .filter(m -> m.getLikes() > 20)
//                .count();
//        System.out.println(res);



//        movies.stream()
//                .filter(m -> m.getLikes() > 10 && m.getLikes()<30)
//                .peek(m -> System.out.println("Filtered: "+m.getTitle()))
//                .map(Movie::getTitle)
//                .forEach(System.out::println);

//        movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .map(Movie::getTitle)
//                .forEach(System.out::println);

//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);

//        movies.stream()
//                .filter(m ->  m.getLikes() ==15)
//                .forEach(n -> System.out.println(n.getTitle()));

//        movies.stream()
//                .map(Movie::getLikes)
//                .forEach(System.out::println);


//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m -> System.out.println(m.getTitle()));

//        movies.stream()
//                .sorted(Comparator.comparing(m -> m.getTitle()))
//                .forEach(m -> System.out.println(m.getTitle()));


//        movies.stream()
//                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
//                .forEach(m -> System.out.println(m.getTitle()));
//        movies.stream()
//                .skip(1)
//               .limit(1)
//                .forEach(m -> System.out.println(m.getTitle()));

//        movies.stream()
//                .takeWhile(m -> m.getLikes() <16)
//                .forEach(m -> System.out.println(m.getTitle()));


//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));

//        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
//               movies.stream()
//                .filter(isPopular)
//                       .forEach(m -> System.out.println(m.getTitle()));




    }




}
