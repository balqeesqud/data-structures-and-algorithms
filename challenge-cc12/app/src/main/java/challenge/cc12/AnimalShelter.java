package challenge.cc12;


import java.util.LinkedList;

import java.util.Queue;

class AnimalShelter {
    private Queue<Animal> animalQueue;

    public AnimalShelter() {
        animalQueue = new LinkedList<>();
    }

    public void enqueue(String species, String name) {
        animalQueue.add(new Animal(species, name));
    }

    public Animal dequeue(String pref) {
        for (Animal animal : animalQueue) {
            if (animal.getSpecies().equals(pref)) {
                animalQueue.remove(animal);
                return animal;
            }
        }
        return null;
    }
}
