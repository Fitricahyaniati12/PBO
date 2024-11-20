public class Main11 {
    public static void main(String[] args) {
        Player11 player = new Player11();

        System.out.println();
        player.name = "NANA GAJAH";
        player.posX = 5;
        player.posY = 10;
        player.maxHealth = 100;
        player.health = 100;
        player.score = 2;
        player.livesRemaining = 5;

        System.out.println("Name: " + player.name);
        System.out.println("Position: (" + player.posX + ", " + player.posY + ")");
        System.out.println("Health: " + player.health + "/" + player.maxHealth);
        System.out.println("Lives Remaining: " + player.livesRemaining);

        System.out.println("====================================");

        Monster11 monster = new Monster11();
        monster.name = "Minion";
        monster.posX = 15;
        monster.posY = 20;
        monster.maxHealth = 50;
        monster.health = 50;
        monster.threatLevel = 3;
        monster.color = "Red";

        System.out.println("Name: " + monster.name);
        System.out.println("Position: (" + monster.posX + ", " + monster.posY + ")");
        System.out.println("Health: " + monster.health + "/" + monster.maxHealth);
        System.out.println("Threat Level: " + monster.threatLevel);
        System.out.println("Color: " + monster.color);


        System.out.println("=====================================");
        // Gameplay demo: Minion
        System.out.println("Gameplay Log: Minion");
        System.out.println(monster.makeNoise());
        monster.takeDamage(20);
        monster.takeDamage(30);
        System.out.println("------------------------------");

        // Gameplay demo: NANA GAJAH
        System.out.println("Gameplay Log: NANA GAJAH");
        player.takeDamage(50);
        player.takeDamage(40);
        System.out.println("------------------------------");
    }
}
