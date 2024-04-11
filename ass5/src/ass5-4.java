class Character2 {
    String name;
    String clazz;
    Weapon weapon;
    int health;
    int mana;

    Character2(String name, String clazz, Weapon weapon, int health, int mana) {
        this.name = name;
        this.clazz = clazz;
        this.weapon = weapon;
        this.health = health;
        this.mana = mana;
    }
}

class Weapon {
    String type;
    int damage;
    int speed;
    int range;

    Weapon(String type, int damage, int speed, int range) {
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }
}
abstract class CharacterFactory2 {
    abstract Character2 createCharacter();
    abstract Weapon createWeapon();
}
class WarriorSwordFactory extends CharacterFactory2 {
    Character2 createCharacter() {
        return new Character2("Warrior", "Warrior", createWeapon(), 150, 50);
    }

    Weapon createWeapon() {
        return new Weapon("Sword", 10, 7, 1);
    }
}

class MageStaffFactory extends CharacterFactory2 {
    Character2 createCharacter() {
        return new Character2("Mage", "Mage", createWeapon(), 100, 150);
    }

    Weapon createWeapon() {
        return new Weapon("Staff", 6, 4, 3);
    }
}

class ArcherBowFactory extends CharacterFactory2 {
    Character2 createCharacter() {
        return new Character2("Archer", "Archer", createWeapon(), 120, 80);
    }

    Weapon createWeapon() {
        return new Weapon("Bow", 8, 6, 10);
    }
}
class CharacterCreator2 {
    private CharacterFactory2 factory;

    void setFactory(CharacterFactory2 factory) {
        this.factory = factory;
    }

    Character2 createCharacter() {
        return factory.createCharacter();
    }
}
