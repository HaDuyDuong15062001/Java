public class Student_IT extends Student{

    protected double scoreJava;
    protected double scoreHTML;

    public Student_IT(double scoreJava, double scoreHTML) {
        super();
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    public double calMark() {
        return (this.scoreJava * 2 + this.scoreHTML) / 3;
    }
}
