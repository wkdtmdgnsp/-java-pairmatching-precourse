package pairmatching.model;

public class PairInfo {
    private Course course;
    private Level level;
    private Mission mission;

    public PairInfo(Course course, Level level, Mission mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    public Course getCourse() {
        return course;
    }

    public Level getLevel() {
        return level;
    }

    public Mission getMission() {
        return mission;
    }
}
