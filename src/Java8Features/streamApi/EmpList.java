package Java8Features.streamApi;

import java.util.List;

public class EmpList {


    private String name;
    private  int id;

    private List<String> citiesWrokedIn;

    public EmpList(String name, int id, List<String> citiesWrokedIn) {
        this.name = name;
        this.id = id;
        this.citiesWrokedIn = citiesWrokedIn;
    }

    @Override
    public String toString() {
        return "EmpList{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", citiesWrokedIn=" + citiesWrokedIn +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCitiesWrokedIn() {
        return citiesWrokedIn;
    }

    public void setCitiesWrokedIn(List<String> citiesWrokedIn) {
        this.citiesWrokedIn = citiesWrokedIn;
    }
}
