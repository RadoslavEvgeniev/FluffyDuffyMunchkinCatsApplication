package app.repositories;

import app.models.Cat;

import java.util.*;
import java.util.stream.Collectors;

public class CatRepository {

    private Map<String, Cat> cats;

    public CatRepository() {
        this.cats = new HashMap<>();
    }

    public void addCat(Cat cat) {
        this.cats.putIfAbsent(cat.getName(), cat);
    }

    public Cat findCatByName(String name) {
        if (!this.cats.containsKey(name)) {
            return null;
        }

        return this.cats.get(name);
    }

    public Set<Cat> findAllCats() {
        if (this.cats.size() == 0) {
            return null;
        }
        Set<Cat> orderedCats = this.cats.values().stream().sorted(Comparator.comparingInt(Cat::getViews).reversed()).collect(Collectors.toSet());
        return orderedCats;
    }
}
