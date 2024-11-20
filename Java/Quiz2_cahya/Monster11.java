public class Monster11 extends DamageableObject11 {
    public int threatLevel;
    public String color;

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health now: " + health);
        if (isDead()) {
            onKilled();
        }
    }

    @Override
    public void onKilled() {
        System.out.println(name + " has been slain! Threat Level: " + threatLevel);
    }

    public String makeNoise() {
        return name + " is growling menacingly!";
    }
}
