package org.example;

public class Pet {
    private String species;
    private String name;

    public Pet() {

    }


    public Pet(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
