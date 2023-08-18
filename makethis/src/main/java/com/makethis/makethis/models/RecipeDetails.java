package com.makethis.makethis.models;




import javax.persistence.Entity;

@Entity
public class RecipeDetails extends AbstractEntity {

    private String description;

    private String directions;

    private String source;

    public RecipeDetails(String description, String directions, String source) {
        this.description = description;
        this.directions = directions;
        this.source = source;
    }

    public RecipeDetails() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}
