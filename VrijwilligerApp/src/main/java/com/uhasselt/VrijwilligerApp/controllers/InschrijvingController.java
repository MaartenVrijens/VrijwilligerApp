package com.uhasselt.VrijwilligerApp.controllers;

import com.uhasselt.VrijwilligerApp.interfaces.IInschrijvingService;
import com.uhasselt.VrijwilligerApp.models.Inschrijving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InschrijvingController {
    @Autowired
    private IInschrijvingService inschrijvingService;

    public  ResponseEntity<Inschrijving> getInschrijving(int id){
        return null;

    }
    public ResponseEntity<List<Inschrijving>> getInschrijvingenByAccount(int id){
        return null;
    }

    public ResponseEntity deleteInschrijving(int id){
        return null;
    }

    public ResponseEntity isAanwezig(long inschrijvingsId, boolean aanwezigheid){
        return null;
    }

    public ResponseEntity<List<Inschrijving>> getAanwezigheden(long inschrijvingsId){
        return null;
    }

    public double berekenNieuweScore(List<Inschrijving> aanwezigheden) {
        return 0;
    }
}
