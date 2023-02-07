package teambikesystem.domain;

import teambikesystem.domain.BikeRegistrated;
import teambikesystem.BikeMgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Management_table")
@Data

public class Management  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Integer bikeId;
    
    
    
    
    
    private String color;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String registeredDate;

    @PostPersist
    public void onPostPersist(){


        BikeRegistrated bikeRegistrated = new BikeRegistrated(this);
        bikeRegistrated.publishAfterCommit();

    }

    public static ManagementRepository repository(){
        ManagementRepository managementRepository = BikeMgmtApplication.applicationContext.getBean(ManagementRepository.class);
        return managementRepository;
    }




    public static void updateStatus(BikeReturned bikeReturned){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeReturned.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void updateStatus(PointUsed pointUsed){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(pointUsed.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void updateStatus(PointReturned pointReturned){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(pointReturned.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }


}
