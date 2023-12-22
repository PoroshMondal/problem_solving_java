package VaccineCount.models;

/**
 *
 * @author Porosh Mondal
 */
public class AgeGroupVaccineDataForWomen {
    private String ageName;
        private int ageData;
        
        public AgeGroupVaccineDataForWomen(String ageName, int ageData){
            this.ageName = ageName;
            this.ageData = ageData;           
        }
        
        public String getAgeName(){
            return ageName;
        }
        
        public int getAgeData(){
            return ageData;
        }
}
