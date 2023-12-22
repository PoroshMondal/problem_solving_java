package VaccineCount.models;
/**
 *
 * @author Porosh Mondal
 */
public class AgeGroupVaccineDataForMen {

    private String ageName;
    private int ageData;

    public AgeGroupVaccineDataForMen(String ageName, int ageData) {
        this.ageName = ageName;
        this.ageData = ageData;
    }

    public String getAgeName() {
        return ageName;
    }

    public int getAgeData() {
        return ageData;
    }

}
