package edu.fsu.cs.cen4021.armory;

/**
 * @author Blake
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff()
    {
        super(80);
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (int)(armor * 0.8);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

