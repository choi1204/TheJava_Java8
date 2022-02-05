package study.java8.Optional;

import java.time.Duration;
import java.util.Optional;

public class Progress {

    private Duration studyDuration;

    private boolean finished;

    public Optional<Duration> getStudyDuration() {
        return Optional.ofNullable(studyDuration);
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
