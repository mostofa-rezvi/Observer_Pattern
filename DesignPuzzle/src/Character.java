public abstract class Character {
    protected WeaponBehavior behavior;

    public void fight(){
        behavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior){
        this.behavior = weaponBehavior;
    }
}
