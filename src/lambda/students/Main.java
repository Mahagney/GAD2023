package lambda.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(5, 2011);
        Student s2 = new Student(7, 2011);
        Student s3 = new Student(10, 2018);
        Student s4 = new Student(8, 2011);

        List<Student> students = new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4));

        Optional<Integer> opt = students.stream()
                .filter(s->
                {
                    System.out.println("filter= " + s.getScore());
                    return s.getGraduationYear() == 2011;
                })
                .map(s-> {
                    System.out.println(s.getScore());
                    return s.getScore();

                })
                .findFirst();

        System.out.println("resp=" + opt.get());
    }
}
