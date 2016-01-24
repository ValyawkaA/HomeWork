package com.company;

public class Animal {
    public int hitPoint;
    public short type;
    public boolean predator;
    public String name;

    public Animal(int hitPoint, short type, String name) {
        this.predator = false;
        this.hitPoint = hitPoint;
        this.type = type;
        this.name = name;
        switch (type) {
            case 1:
                predator = true;
                break;
            case 2:
                predator = true;
                break;
            case 3:
                predator = false;
                break;
            case 4:
                predator = true;
                break;
        }
    }

    public String sayName() {
        return this.name;
    }

    public void eat(Animal food) {
        food.hitPoint = 0;
        if (predator) {
            hitPoint += 10;
        } else {
            hitPoint -= 10;
        }
        if (hitPoint == 0) {
            System.out.println(sayName() + " is Dead " );
        } else {
            System.out.println(sayName() + "\t" + hitPoint);
        }
    }

    public void eat(String food) {
        if (hitPoint != 0) {
            if (predator) {
                hitPoint -= 10;
            } else {
                hitPoint += 10;
            }
        }
        if (hitPoint == 0) {
            System.out.println(sayName() + " is Dead ");
        } else {
            System.out.println(name + "\t" + hitPoint);
        }
    }
}
