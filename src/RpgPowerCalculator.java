
public class RpgPowerCalculator {
    static void main(String[] args) {
        // if, switch, for, while, 배열 사용 금지 // if, switch, for, while, 배열 사용 금지

        String name = "병준";
        int level = 27;
        String job = "검사";
        int defaultAttack = 120;
        int swordAttack = 45;
        int  power = 30;
        float critChance = 15.5f;
        boolean isBuffed = true;

    }

    public int allDefaultAttack (int defaultAttack, int swordAttack, int power) {
        return defaultAttack + swordAttack + (power * 2);
    }

    public int critAttack (int  allDefaultAttack) {
        return (int)(allDefaultAttack * 1.5);
    }

    public float remainingExp(int currentExp, int maxExp) {
        return (float)currentExp / maxExp * 100;
    }

    public void currentGold(int currentGold, int swordPrice) {
        currentGold -= swordPrice;
        int addSword = currentGold / swordPrice;
        int remainingGold = currentGold % swordPrice;
        System.out.printf("나머지 골드: %d , 추가 구매 가능 : %d", currentGold, addSword);
    }

}
