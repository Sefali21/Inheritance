package genel;

public class Manager extends GeneralInfo{
    private String description;
    private String extra;
    public Manager(String name, String gender, int jobId, int age, double salary) {
        super(name, gender, jobId, age, salary);
    }

    public String getDescription() { return description;    }

    public void setDescription(String description) { this.description = description;    }

    public String getExtra() { return extra;    }

    public void setExtra(String extra) { this.extra = extra;    }

    @Override
    public void printAll(){
        System.out.println(String.format("Name : %s\nAge : %d\nJob ID : %d\nSalary : %.2f\nGender : %s\nDescription : %s",
                getName(),getAge(),getJobId(),getSalary(),getGender(),getDescription()));
    }
}
