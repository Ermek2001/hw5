package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(5000);
	boss.setDamage(800);
	boss.setDefends("Magic");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefends());

    }
}
