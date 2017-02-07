package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.lang.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Blake
 */


class AncientMagicStaff extends BasicWeapon implements Weapon {

    private static ArrayList<Integer> origArrayList = new ArrayList<Integer>();
    private static int x = calculate();

    AncientMagicStaff()
    {
        super(x);
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    @Override
    public int hit(int armor)
    {
        int damage = DAMAGE - (int)(armor * 0.75);
        if (damage < 0)
            return 0;
        else
            return damage;


    }
    private static int calculate() {
        File f1 = new File("conf/ancientstaff.obj");

        try{
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(f1));
            origArrayList = (ArrayList<Integer>)obj.readObject();
            //for (int i= 0; i < origArrayList.size(); i++)
               // origArrayList.get(i);

            ArrayList<Integer> orig_list_raise = new ArrayList<Integer>(origArrayList.size());


            for(int i =0; i < origArrayList.size(); i++)
            {
                int a = origArrayList.get(i);
                double squared = Math.pow(a,2.0);
                orig_list_raise.add((int)squared);
            }

            orig_list_raise.remove(1);
            orig_list_raise.remove(3);

            Collections.reverse(orig_list_raise);

            int result = orig_list_raise.get(0) + orig_list_raise.get(2) + orig_list_raise.get(6);
            return result;

        }

        catch(ClassNotFoundException e1){
            System.out.println(e1.getMessage());
        }

        catch(FileNotFoundException e2){
            System.out.println("File not found ");
        }

        catch(IOException e2){
            System.out.println("IOException ");
        }
        return -1;
    }
}


