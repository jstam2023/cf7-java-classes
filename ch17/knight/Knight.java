package gr.aueb.cf.ch17.knight;

public class Knight implements IKnight, Runnable {
    private final String name;

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
