package com.my.learn.practice.stepik.task_3_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertWordsWithJ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        list = Arrays.asList(inputString.split(" "));
        System.out.println(list);

        list.stream()
                .filter(w -> w.startsWith("J"))
                .map(w -> w.substring(1))
                .collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(System.out::println);

    }
}
