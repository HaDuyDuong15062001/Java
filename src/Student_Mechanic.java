public class Student_Mechanic extends Student {

    protected double scoreCNC;
    protected double scorePLC;

    public Student_Mechanic(double scoreCNC, double scorePLC) {
        super();
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    public double calMark() {
        return (this.scoreCNC + this.scorePLC) / 2;
    }
}
