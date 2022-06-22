package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student s = new Student("thomas");
        s.addGrade(70);
        s.addGrade(75);
        s.addGrade(80);
        s.addGrade(90);
        s.addGrade(95);
        System.out.println("s.getGradeAverage() = " + s.getGradeAverage()); // should be 82
    }
}