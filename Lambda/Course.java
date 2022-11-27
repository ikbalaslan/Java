package day33lambda;
/*
      POJO: Plain Old Java Object
      1)Constructor without parameter
      2)Constructor with all parameters
      3)getter() and setter()
      4)toString()
 */
/*
     In functional programming some methods like reduce() must be the last method, that kind of methods are called "terminal methods."
       If you don't want to data type is Optional use the get() method in the Functional structure.
      If you want to break a structure in a stream Like Array to words use flatMap(Array::stream)
 */
public class Course {
    private String Season;
    private String courseName;
    private int avarageScore;
    private int numberOfStudents;

    public Course() {
    }

    public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.Season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Season='" + Season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
