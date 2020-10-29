package java_core_basics.hw4.task_2.subClass;

public class BodyOfCar {
    private String typeOfBody;
    private boolean haveHatch;

    public BodyOfCar(String typeOfBody, boolean haveHatch) {
        this.typeOfBody = typeOfBody;
        this.haveHatch = haveHatch;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public boolean isHaveHatch() {
        return haveHatch;
    }

    public void setHaveHatch(boolean haveHatch) {
        this.haveHatch = haveHatch;
    }
}
