package lambda.students;

public class Student {
    private int score;
    private int graduationYear;

    public Student(int score, int graduationYear) {
        this.score = score;
        this.graduationYear = graduationYear;
    }

    public int getScore() {
        return score;
    }

    public int getGraduationYear() {
        return graduationYear;
    }
}
