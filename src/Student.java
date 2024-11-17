public class Student extends Person{
    protected int mark;
    protected String grade;

    public Student(int age, String id, String name, int mark) {
        super(age, id, name);
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        if (this.mark >= 8)
            this.grade = "A";
        else if (this.mark >= 7)
            this.grade = "B";
        else if (this.mark >= 6)
            this.grade = "C";
        else if (this.mark >= 5)
            this.grade = "D";
        else if (this.mark < 5)
            this.grade = "FAILED";
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "grade='" + grade + '\'' + ", mark=" + mark + ", age=" + age + ", id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
