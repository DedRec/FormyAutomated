package HandsOn1;

import java.util.*;

public class City implements Comparable<City> {
    private String Name;
    private long population;
    public City(){};
    public City(String Name,long population){
        this.Name=Name;
        this.population=population;
    }
    public int compareTo(City ct){
        if(population==ct.population)
            return 0;
        else if(population>ct.population)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args){
        ArrayList<City> al=new ArrayList<City>();
        al.add(new City("Chicago",1000000));
        al.add(new City("Cairo",300000));
        al.add(new City("Tokyo",10000));
        al.add(new City("Hong Kong",900000));
        al.add(new City("Rio de Janeiro",8000000));
        Collections.sort(al,Collections.reverseOrder());
        for(City city:al){
            System.out.println("City: "+city.Name+", population: "+city.population);
        }
    }
}
