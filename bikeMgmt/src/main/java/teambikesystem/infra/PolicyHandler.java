package teambikesystem.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import teambikesystem.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import teambikesystem.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired ManagementRepository managementRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='BikeReturned'")
    public void wheneverBikeReturned_UpdateStatus(@Payload BikeReturned bikeReturned){

        BikeReturned event = bikeReturned;
        System.out.println("\n\n##### listener UpdateStatus : " + bikeReturned + "\n\n");


        

        // Sample Logic //
        Management.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PointUsed'")
    public void wheneverPointUsed_UpdateStatus(@Payload PointUsed pointUsed){

        PointUsed event = pointUsed;
        System.out.println("\n\n##### listener UpdateStatus : " + pointUsed + "\n\n");


        

        // Sample Logic //
        Management.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PointReturned'")
    public void wheneverPointReturned_UpdateStatus(@Payload PointReturned pointReturned){

        PointReturned event = pointReturned;
        System.out.println("\n\n##### listener UpdateStatus : " + pointReturned + "\n\n");


        

        // Sample Logic //
        Management.updateStatus(event);
        

        

    }

}


