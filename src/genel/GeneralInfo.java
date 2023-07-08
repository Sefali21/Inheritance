package genel;

public class GeneralInfo {
    private String name;
    private String gender;
    private int jobId;
    private int age;
    private double salary;

    public GeneralInfo(String name,String gender,int jobId,int age,double salary){
        this.name=name;
        this.gender=gender;
        this.jobId=jobId;
        this.age=age;
        this.salary=salary;
    }

    public GeneralInfo(String name, String gender, int age) {
        this.name=name;
        this.gender=gender;

        this.age=age;

    }

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public String getGender() { return gender;    }

    public void setGender(String gender) { this.gender = gender;    }

    public int getJobId() { return jobId;    }

    public void setJobId(int jobId) { this.jobId = jobId;    }

    public int getAge() { return age;    }

    public void setAge(int age) { this.age = age;    }

    public double getSalary() { return salary;    }

    public void setSalary(double salary) { this.salary = salary;    }

    public void printAll(){
        System.out.println(String.format("Name : %s\nAge : %d\nJob ID : %d\nSalary : %.2f\nGender : %s",
                getName(),getAge(),getJobId(),getSalary(),getGender()));
    }
}
