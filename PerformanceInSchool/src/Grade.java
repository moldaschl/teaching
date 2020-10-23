public class Grade {
    private int schularbeit;
    private int test;
    private int mitarbeit;

    public Grade(int schularbeit, int test, int mitarbeit) {
        this.schularbeit = schularbeit;
        this.test = test;
        this.mitarbeit = mitarbeit;
    }


    public double getAverage() {
        double average = (double) (this.schularbeit + this.test + this.mitarbeit) / 3;
        average = Math.round(average * 100.0) / 100.0;
        return average;
    }

    public String getGrade() {
        String grading = "";
        if (getAverage() >= 4.5) {
            grading = "Nicht Genügend";
        } else if (getAverage() >= 3.5) {
            grading = "Genügend";

        } else if (getAverage() >= 2.5) {
            grading = "Befriedigend";
        } else if (getAverage() >= 1.5) {
            grading = "Gut";
        } else {
            grading = "Sehr Gut";
        }
        return grading;
    }


}
