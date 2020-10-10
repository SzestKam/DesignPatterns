package pattern.strategy.option;

import java.util.LinkedList;
import java.util.List;

import pattern.strategy.domain.Knight;
import pattern.strategy.domain.Weapons;

public class ArchValidator implements KnightValidator {
    private List<Weapons> weaponsDistanceAttack;

    public boolean validate(Knight knight) {
        initDistanceWeapons();
        for (Weapons w : weaponsDistanceAttack) {
            if (isAvailableInEquipment(w, knight))
                return true;
        }
        return false;
    }

    private boolean isAvailableInEquipment(Weapons w, Knight knight) {
        return knight.getEquipment().contains(w);
    }

    private void initDistanceWeapons() {
        weaponsDistanceAttack = new LinkedList<Weapons>();
        weaponsDistanceAttack.add(Weapons.BOW);
        weaponsDistanceAttack.add(Weapons.CROSSBOW);
    }
}
