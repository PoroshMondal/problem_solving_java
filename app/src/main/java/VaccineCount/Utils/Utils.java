package VaccineCount.Utils;

import static VaccineCount.Utils.Constants.*;
import java.util.*; 
import VaccineCount.models.AgeGroupVaccineDataForMen;
import VaccineCount.models.AgeGroupVaccineDataForWomen;
import VaccineCount.models.OutputInfoModel;

/**
 *
 * @author Porosh Mondal
 */
public class Utils {
    
    private OutputInfoModel infoModel;
    public Utils(OutputInfoModel infoModel){
        this.infoModel = infoModel;
    } 
    
    static public int[] getAgeArray(){
       int ageArray[] = {AGE55, AGE50, AGE45, AGE40, AGE35, AGE30, AGE25};
       return ageArray;
    }
    
    ///
    public void organizedMenWomenCadidate(int totalCandidate){
        int totalWomen = (int) Math.ceil(totalCandidate/3);
        int totalMen = totalCandidate - totalWomen;
        
        infoModel.setTotalMen(totalMen);
        infoModel.setTotalWomen(totalWomen);
        
        //System.out.print("Total Men: " + totalMen + "Total Women: " + totalWomen);
    }
    
    
    public void devideTotalVaccineEqually(int totalVaccine){
        int vaccineForMen = (int) Math.ceil(totalVaccine/2);
        int vaccineForWomen = totalVaccine - vaccineForMen;
        
        infoModel.setTotalVaccineForMen(vaccineForMen);
        infoModel.setTotalVaccineForWomen(vaccineForWomen);
        
        //System.out.print("Vaccine for Men: " + vaccineForMen + "Vaccine for Women: " + vaccineForWomen);
       
    }
    ///
    
    public void doOperationForMen(){
        organizedTheGroupOfMen();
        totalVaccineGivenToMen();
    }
    
    public void doOperationForWomen(){
        organizedTheGroupOfWomen();
        totalVaccineGivenToWomen();
    }
    
    List<Integer> menAgeGroup = new ArrayList<>();
    int count = 0;
    public void organizedTheGroupOfMen(){
        int[] ageArray = getAgeArray();
        
        for(int i=0; i<infoModel.getTotalMen(); i++){
          
            if(count==7){
                count = 0;
                menAgeGroup.add(ageArray[count]);
            }else {
                menAgeGroup.add(ageArray[count]);
            }
            
            //System.out.println("count value = " + count + "index: " + i);
            count++;
            
        }
    }
    
    public void totalVaccineGivenToMen(){
        
        int age55 = 0;
        int age50 = 0;
        int age45 = 0;
        int age40 = 0;
        int age35 = 0;
        int age30 = 0;
        int age25 = 0;
        
        int totalVccGivenMen = 0;
        
        int[] ageArray = getAgeArray();
     
        
        for(int i=0; i<ageArray.length; i++){
            
              if(totalVccGivenMen == infoModel.getTotalVaccineForMen()){
                    break;
                }
            
            for(int j=0; j<infoModel.getTotalMen(); j++){
                
                switch(i){
                    case 0:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age55!=infoModel.getVaccineAgeLimit())
                            age55++;
                        }
                        break;
                    case 1:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age50!=infoModel.getVaccineAgeLimit())
                            age50++;
                        }
                        break;
                    case 2:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age45!=infoModel.getVaccineAgeLimit())
                            age45++;
                        }
                        break;
                    case 3:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age40!=infoModel.getVaccineAgeLimit())
                            age40++;
                        }
                        break;
                    case 4:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age35 !=infoModel.getVaccineAgeLimit())
                            age35++;
                        }
                        break;
                    case 5:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age30!=infoModel.getVaccineAgeLimit())
                            age30++;
                        }
                        break;
                    case 6:
                        if(ageArray[i] == menAgeGroup.get(j)){
                            if(age25!=infoModel.getVaccineAgeLimit())
                            age25++;
                        }
                        break;
                }
                
                totalVccGivenMen = age55 + age50 + age45 + age40 + age35 + age30 + age25;
                if(totalVccGivenMen == infoModel.getTotalVaccineForMen()){
                    break;
                }
                
            }
            
        }
        
        infoModel.setTotalVaccineGivenToMen(totalVccGivenMen);
        
        List<AgeGroupVaccineDataForMen> mList = new ArrayList<>();
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_55, age55));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_50, age50));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_45, age45));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_40, age40));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_35, age35));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_30, age30));
        mList.add(new AgeGroupVaccineDataForMen(Constants.AGE_25, age25));
        infoModel.setAgeGroupDataMen(mList);
        
    }
    
    /////////
    // for women
    
    List<Integer> womenAgeGroup = new ArrayList<>();
    int countWomen = 0;
    public void organizedTheGroupOfWomen(){
        int[] ageArray = getAgeArray();
        
        for(int i=0; i<infoModel.getTotalWomen(); i++){
          
            if(countWomen==7){
                countWomen = 0;
                womenAgeGroup.add(ageArray[countWomen]);
            }else {
                womenAgeGroup.add(ageArray[countWomen]);
            }
            
            //System.out.println("count value = " + countWomen + "index: " + i);
            countWomen++;
            
        }
    }
    
    public void totalVaccineGivenToWomen(){
        
        int age55 = 0;
        int age50 = 0;
        int age45 = 0;
        int age40 = 0;
        int age35 = 0;
        int age30 = 0;
        int age25 = 0;
        
        int totalVccGivenWomen = 0;
        
        int[] ageArray = getAgeArray();
     
        
        for(int i=0; i<ageArray.length; i++){
            
              if(totalVccGivenWomen == infoModel.getTotalVaccineForWomen()){
                    break;
                }
            
            for(int j=0; j<infoModel.getTotalWomen(); j++){
                                                
                switch(i){
                    case 0 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age55!=infoModel.getVaccineAgeLimit())
                                age55++;
                        }
                      }
                    case 1 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age50!=infoModel.getVaccineAgeLimit())
                                age50++;
                        }
                      }
                    case 2 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age45!=infoModel.getVaccineAgeLimit())
                                age45++;
                        }
                      }
                    case 3 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age40!=infoModel.getVaccineAgeLimit())
                                age40++;
                        }
                      }
                    case 4 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age35 !=infoModel.getVaccineAgeLimit())
                                age35++;
                        }
                      }
                    case 5 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age30!=infoModel.getVaccineAgeLimit())
                                age30++;
                        }
                      }
                    case 6 -> {
                        if(ageArray[i] == womenAgeGroup.get(j)){
                            if(age25!=infoModel.getVaccineAgeLimit())
                                age25++;
                        }
                      }
                }
                
                totalVccGivenWomen = age55 + age50 + age45 + age40 + age35 + age30 + age25;                
                if(totalVccGivenWomen == infoModel.getTotalVaccineForWomen()){
                    break;
                }
                
            }
            
        }
        
        infoModel.setTotalVaccineGivenToWomen(totalVccGivenWomen);
        
        List<AgeGroupVaccineDataForWomen> mListWomen = new ArrayList<>();
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_55, age55));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_50, age50));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_45, age45));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_40, age40));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_35, age35));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_30, age30));
        mListWomen.add(new AgeGroupVaccineDataForWomen(Constants.AGE_25, age25));
        infoModel.setAgeGroupDataWomen(mListWomen);
        
    }
    
}
