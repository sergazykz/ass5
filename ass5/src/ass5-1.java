import java.util.Arrays;
import java.util.List;
class Character {
    private String name;
    private Appearance appearance;
    private List<Ability> abilities;
    private List<Equipment> equipment;
    private Attributes attributes;

    public Character(String name, Appearance appearance, List<Ability> abilities, List<Equipment> equipment, Attributes attributes) {
        this.name = name;
        this.appearance = appearance;
        this.abilities = abilities;
        this.equipment = equipment;
        this.attributes = attributes;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}


class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Warrior-like");
        List<Ability> abilities = Arrays.asList(new Ability("Sword Strike"));
        List<Equipment> equipment = Arrays.asList(new Equipment("Sword"));
        Attributes attributes = new Attributes(100, 20, 10);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
}

class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Mystical");
        List<Ability> abilities = Arrays.asList(new Ability("Fireball"));
        List<Equipment> equipment = Arrays.asList(new Equipment("Magic Staff"));
        Attributes attributes = new Attributes(80, 5, 30);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
}

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Stealthy");
        List<Ability> abilities = Arrays.asList(new Ability("Bow Shot"));
        List<Equipment> equipment = Arrays.asList(new Equipment("Bow"));
        Attributes attributes = new Attributes(90, 15, 20);
        return new Character(name, appearance, abilities, equipment, attributes);
    }
}
class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter(String name) {
        return factory.createCharacter(name);
    }
}
class Appearance {
    private String description;

    public Appearance(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Ability {
    private String name;

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Equipment {
    private String item;

    public Equipment(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

class Attributes {
    private int health;
    private int strength;
    private int magic;

    public Attributes(int health, int strength, int magic) {
        this.health = health;
        this.strength = strength;
        this.magic = magic;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}


