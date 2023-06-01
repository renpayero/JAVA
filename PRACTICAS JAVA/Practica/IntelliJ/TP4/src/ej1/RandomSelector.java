package ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomSelector {

    private List<String> elements=new ArrayList<String>();
    private Random rnd=new Random();

    public void add(String element){
        elements.add(element);
    }


    public String selectNext() throws IndexOutOfBoundsException{
        if(elements.size()==0)
            throw new IndexOutOfBoundsException();
        int randomInt=rnd.nextInt(elements.size());

        return elements.get(randomInt);}

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {


        this.rnd = rnd;
    }

    public static void main(String[] args){
        RandomSelector<String> rs= new RandomSelector<String>();

        rs.add("Fede");
        rs.add("Hola");
        rs.add("Mundo");
        rs.add("Sol");

        for (int x=1; x<10; x++) {
            try {
                System.out.println(rs.selectNext());
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }




}
