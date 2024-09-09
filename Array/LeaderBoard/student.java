package LeaderBoard;

public class student {
    private long s_id;
    private String name;
    private double cgpa;

    public student(long id, String name, double cgpa) {
        this.s_id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public long getId() {
        return s_id;
    }

    public String getname() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String toString() {
        return this.s_id + ". " + this.name + ", " + this.cgpa;
    }
}
