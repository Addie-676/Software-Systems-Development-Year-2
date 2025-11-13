
package JavaExperiments.Practice1valoData;

public class MobileLegend extends Data{
    private String rank;
    private double totalPlayTime;

    //added getters just for practice although I just used toString to write print the data

    public double getMLplaytime(){
        return totalPlayTime;
    }
    public String getMLRank() {
        return rank;
    }

    public MobileLegend(String name,Integer age,String rank,double totalPlayTime){
        super(name,age);
        this.rank = rank;
        this.totalPlayTime = totalPlayTime;
    }


    public String toString() {
        return super.toString() + "\nrank: " + rank + "\nTotalPlayTime: " + totalPlayTime+"hours";
    }
}

