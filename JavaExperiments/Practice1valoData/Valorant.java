package JavaExperiments.Practice1valoData;

public class Valorant extends Data {
    protected String rank;
    protected double totalPlayTime;
    public Valorant(String name,Integer age,String rank,double totalPlayTime) {
        super(name, age);
        this.rank = rank;
        this.totalPlayTime = totalPlayTime;

    }
    public String getValoRank() {
        return rank;
    }


    public String toString() {
        return super.toString() + "\nrank: " + rank+"\nTotalPlayTime: " + totalPlayTime+"hours";
    }

}