package Ficha03.Ex01RPG;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Unit meleeUnit = new Unit(new MeleeAttackStrategy());
        meleeUnit.performAttack();

        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack();

        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack();
    }
}