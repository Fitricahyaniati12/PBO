public abstract class DamageableObject11 extends GameObject11 {
    public int maxHealth;
    public int health;

    public boolean isDead() {
        return health <= 0;
    }

    public abstract void takeDamage(int damage);

    public abstract void onKilled();
}
