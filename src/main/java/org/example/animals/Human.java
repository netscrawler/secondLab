package org.example.animals;
public class Human implements Participant, superRun {
    private int maxHeight;
    private int maxLenght;
    public boolean superRunCount =true ;
    public String name;

    public Human(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }
    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + " м");
            return true;
        } else if (superRunCount) {
            boolean result = superRun(this);
            superRunCount = false;
            return result;
        } else {
            System.out.println(this.name + " не смог пробежать " + dist + " м и выбывает");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height <= maxHeight) {
            System.out.println(this.name + " перепрыгнул " + height + " м");
            return true;
        } else {
            System.out.println(this.name + " не смог перепрыгнуть " + height + " м и выбывает");
            return false;
        }
    }
}