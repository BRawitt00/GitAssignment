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
        Weapon axe = WeaponFactory.getWeapon("axe");
        Weapon staff = WeaponFactory.getWeapon("staff");
        Weapon chosenaxe= WeaponFactory.getWeapon("the chosen one axe");
        Weapon ancientmstaff = WeaponFactory.getWeapon("ancient magic staff");


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

        System.out.println("Staff has " + staff.hit() + " of damage.");
        armor = 20;
        System.out.println("Staff was able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("The Chosen One Axe has " + chosenaxe.hit() + " of damage.");
        armor = 20;
        System.out.println("The Chosen One Axe was able to do " + chosenaxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("The Ancient Magic Staff has " + ancientmstaff.hit() + " of damage.");
        armor = 20;
        System.out.println("The Ancient Magic Staff was able to do " + ancientmstaff.hit(armor) + " of damage due to an armor with " + armor + " points.");



    }
}
