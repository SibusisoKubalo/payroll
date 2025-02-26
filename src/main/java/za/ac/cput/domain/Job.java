/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.domain;

import java.util.List;

public class Job {
    private String title;
    private List<Position> positions;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    // toString method
    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", positions=" + positions +
                '}';
    }
}