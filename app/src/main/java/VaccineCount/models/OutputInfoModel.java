package VaccineCount.models;

import java.util.List;

/**
 *
 * @author Porosh Mondal
 */
public class OutputInfoModel {
    private static OutputInfoModel mInstance;
    private OutputInfoModel() {
    }
    
    public static OutputInfoModel getInstance() {
        if(mInstance == null){
            mInstance = new OutputInfoModel();
        }
        return mInstance;
    } 
    
    /////////
    private int totalMen;
    private int totalWomen;
    
    public void setTotalMen(int totalMen){
        this.totalMen = totalMen;
    }
    
    public int getTotalMen(){
        return totalMen;
    }
    
    public void setTotalWomen(int totalWomen){
        this.totalWomen = totalWomen;
    }
    
    public int getTotalWomen(){
        return totalWomen;
    }
    
    ////////////
    private int vaccineForMen;
    private int vaccineForWomen;
    private int totalVaccine;
    private int vaccineLimitAgeGroup;
    
    public void setTotalVaccineForMen(int vaccineForMen){
        this.vaccineForMen = vaccineForMen;
    }
    
    public int getTotalVaccineForMen(){
        return vaccineForMen;
    }
    
    public void setTotalVaccineForWomen(int vaccineForWomen){
        this.vaccineForWomen = vaccineForWomen;
    }
    
    public int getTotalVaccineForWomen(){
        return vaccineForWomen;
    }
    
    public void setTotalVaccine(int totalVaccine){
        this.totalVaccine = totalVaccine;
    }
    
    public int getTotalVaccine(){
        return totalVaccine;
    }
    
    public void setVaccineAgeLimit(int vaccineLimitAgeGroup){
        this.vaccineLimitAgeGroup = vaccineLimitAgeGroup;
    }
    
    public int getVaccineAgeLimit(){
        return vaccineLimitAgeGroup;
    }
    
    ////////
    private int totalVaccineGivenToMen;
    private int totalVaccineGivenToWomen;
    public void setTotalVaccineGivenToMen(int totalVaccineGivenToMen){
        this.totalVaccineGivenToMen = totalVaccineGivenToMen;
    }
    
    public int getTotalVaccineGivenToMen(){
        return totalVaccineGivenToMen;
    }
    
    public void setTotalVaccineGivenToWomen(int totalVaccineGivenToWomen){
        this.totalVaccineGivenToWomen = totalVaccineGivenToWomen;
    }
    
    public int getTotalVaccineGivenToWomen(){
        return totalVaccineGivenToWomen;
    }
    
    ////////
    private List<AgeGroupVaccineDataForMen> ageGroudDataMen;
    public void setAgeGroupDataMen(List<AgeGroupVaccineDataForMen> ageGroudDataMen){
        this.ageGroudDataMen = ageGroudDataMen;
    }
        
    public List<AgeGroupVaccineDataForMen> getAgeGroupDataMen(){
        return ageGroudDataMen;
    }
    
    private List<AgeGroupVaccineDataForWomen> ageGroudDataWomen;
    public void setAgeGroupDataWomen(List<AgeGroupVaccineDataForWomen> ageGroudDataWomen){
        this.ageGroudDataWomen = ageGroudDataWomen;
    }
        
    public List<AgeGroupVaccineDataForWomen> getAgeGroupDataWomen(){
        return ageGroudDataWomen;
    }
    
}
