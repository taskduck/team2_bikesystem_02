package teambikesystem.infra;

import teambikesystem.domain.*;
import teambikesystem.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationDashboardViewHandler {

    @Autowired
    private ReservationDashboardRepository reservationDashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBikeReserved_then_CREATE_1 (@Payload BikeReserved bikeReserved) {
        try {

            if (!bikeReserved.validate()) return;

            // view 객체 생성
            ReservationDashboard reservationDashboard = new ReservationDashboard();
            // view 객체에 이벤트의 Value 를 set 함
            reservationDashboard.setReserveNo(String.valueOf(bikeReserved.getReserveNo()));
            reservationDashboard.setUserId(bikeReserved.getUserId());
            reservationDashboard.setBikeId(bikeReserved.getBikeId());
            reservationDashboard.setStatus("예약시작");
            // view 레파지 토리에 save
            reservationDashboardRepository.save(reservationDashboard);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenBikeRegistrated_then_CREATE_2 (@Payload BikeRegistrated bikeRegistrated) {
        try {

            if (!bikeRegistrated.validate()) return;

            // view 객체 생성
            ReservationDashboard reservationDashboard = new ReservationDashboard();
            // view 객체에 이벤트의 Value 를 set 함
            reservationDashboard.setColor(bikeRegistrated.getColor());
            // view 레파지 토리에 save
            reservationDashboardRepository.save(reservationDashboard);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




}

