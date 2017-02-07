package edu.fsu.cs.cen4021.armory;
import java.io.*;

/**
 * @author Blake
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {

    private static int x = calculate();

        TheChosenOneAxe()
        {
            super(x);
        }



@Override
public int hit()
        {
        return DAMAGE;
        }

@Override
public int hit(int armor) {
    int damage;
    if (armor > 0 && armor < 20)
        damage = DAMAGE;

    else
        damage = DAMAGE - armor;

    if (damage < 0)
        return 0;

    return damage;
}


private static int calculate()
    {
        int line_num = 2;
        File f = new File("conf/thechosenone.txt");

        try{
            FileInputStream fstream = new FileInputStream(f);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str1 = br.readLine();
            String str2;


            while (true) {
                str2 = br.readLine();
                line_num++;
                if(!str2.equals(str1))
                {
                    break;
                }

            }
            in.close();

        }
        catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return line_num;
    }

}