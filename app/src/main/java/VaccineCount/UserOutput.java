package VaccineCount;

import VaccineCount.Utils.Constants;
import java.util.List;
import VaccineCount.models.AgeGroupVaccineDataForMen;
import VaccineCount.models.AgeGroupVaccineDataForWomen;
import VaccineCount.models.OutputInfoModel;

/**
 *
 * @author Porosh Mondal
 */
public class UserOutput {
    private final OutputInfoModel infoModel;
    public UserOutput(OutputInfoModel infoModel){
        this.infoModel = infoModel;
    }
    
    public void showResult(){
        System.out.println(Constants.TOTAL_MEN + infoModel.getTotalMen());
        System.out.println(Constants.TOTAL_WOMEN + infoModel.getTotalWomen());
        System.out.println(Constants.TOTAL_VACCINE_ALLOCATE_MEN + infoModel.getTotalVaccineForMen());
        System.out.println(Constants.TOTAL_VACCINE_ALLOCATE_WOMEN + infoModel.getTotalVaccineForWomen());
        
        // vaccine given men
        System.out.println(Constants.VACCINE_GIVEN_TO_MEN);
        List<AgeGroupVaccineDataForMen> listMenVaccine = infoModel.getAgeGroupDataMen();
        for(int i=0; i<listMenVaccine.size(); i++){
            System.out.println(listMenVaccine.get(i).getAgeName() + ": " + listMenVaccine.get(i).getAgeData());
        }
        
        // vaccine given women
        System.out.println(Constants.VACCINE_GIVEN_TO_WOMEN);
        List<AgeGroupVaccineDataForWomen> listWomenVaccine = infoModel.getAgeGroupDataWomen();
        for(int i=0; i<listWomenVaccine.size(); i++){
            System.out.println(listWomenVaccine.get(i).getAgeName() + ": " + listWomenVaccine.get(i).getAgeData());
        }
        
        int totalVaccineGiven = infoModel.getTotalVaccineGivenToMen() + infoModel.getTotalVaccineGivenToWomen();
        int totalVaccineNotGiven = infoModel.getTotalVaccine() - totalVaccineGiven;
        
        System.out.println(Constants.TOTAL_VACCINE_GIVEN + totalVaccineGiven);
        System.out.println(Constants.TOTAL_VACCINE_NOT_GIVEN + totalVaccineNotGiven);
             
        System.out.println("vcc given to men " + infoModel.getTotalVaccineGivenToMen());
        System.out.println("vcc given to women " + infoModel.getTotalVaccineGivenToWomen());
        
    }
    
}
