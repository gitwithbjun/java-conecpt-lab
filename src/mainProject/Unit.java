package mainProject;

public class Unit {

    // 캐릭터 이름
    private String name;
    // 캐릭터 hp
    private int hp;
    // 캐릭터 공격력
    private int attack;
    // 캐릭터 진영
    private Side side;

    public Unit(int hp, int attack, Side side) {
        this.hp = hp;
        this.attack = attack;
        this.side = side;
    }


    // 기본 공격
    public void defaultAttack(Unit unit) {
        unit.hp -= this.attack;
    }

    // 피해 받기
    public void takeDamage(Unit unit){
        this.hp -= unit.hp;
    }

    // 현재 상태 출력
    @Override
    public String toString(){
        return side.toString() + "진영 검사" + "남은 hp : " + this.hp;
    }

    // 생존 여부 확인
    public String getAlive() {
        if (this.hp <= 0){
            return "캐릭터 사망 상태";
        }
        return "캐릭터 생존";
    }
}
