
package JavaExperiments.Practice1valoData;

public class Data {
    protected String name;
    protected Integer age;

    public Data(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public Integer getAge(){
        return age;
    }


    public String toString() {
        return "Name: " + name +"\n"+ "Age: " + age;
    }
}
