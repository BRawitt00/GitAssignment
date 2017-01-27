package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        Weapon axe= WeaponFactory.getWeapon("axe");

        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        armor = 20;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("Axe has " + axe.hit() + " of damage.");
        armor = 20;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");

    }
}
