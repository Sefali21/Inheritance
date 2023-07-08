package genel;

public class Praktikant extends GeneralInfo{
    private double worksOfweek;
    public Praktikant(String name, String gender,  int age, double worksOfweek) {
        super(name, gender,  age);
        this.worksOfweek=worksOfweek;
    }

    public double getWorksOfweek() { return worksOfweek;    }

    public void setWorksOfweek(double worksOfweek) { this.worksOfweek = worksOfweek;    }

    @Override
    public void printAll(){
        System.out.println(String.format("Name : %s\nAge : %d\nGender : %s\nWorks of Week : %.2f",
                getName(),getAge(),getGender(), getWorksOfweek()));
    }
}
