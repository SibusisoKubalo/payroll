package za.ac.cput.domain;

import java.util.List;

public class Job {
    private String title;
    private List<Position> positions;

    // Constructor, Getters & Setters
    public Job(String title, List<Position> positions) {
        this.title = title;
        this.positions = positions;
    }

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

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", positions=" + positions +
                '}';
    }
}
