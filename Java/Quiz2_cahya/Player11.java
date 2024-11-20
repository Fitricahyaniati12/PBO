public class Player11 extends DamageableObject11 {
    public int score;
    public int livesRemaining;

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
        livesRemaining--;
        System.out.println(name + " has been killed! Lives remaining: " + livesRemaining);
        if (livesRemaining <= 0) {
            System.out.println("Game Over for " + name);
        }
    }
}
