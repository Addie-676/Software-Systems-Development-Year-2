package JavaExperiments.Practice1valoData;

public class Valorant extends Data {
    protected String rank;
    protected double totalPlayTime;
    public Valorant(String name,Integer age,String rank,double totalPlayTime) {
        super(name, age);
        this.rank = rank;
        this.totalPlayTime = totalPlayTime;

    }
    //added getters just for practice although I just used toString to write print the data
    public String getValoRank() {
        return rank;
    }


    public String toString() {
        return super.toString() + "\nrank: " + rank+"\nTotalPlayTime: " + totalPlayTime+"hours";
    }

}