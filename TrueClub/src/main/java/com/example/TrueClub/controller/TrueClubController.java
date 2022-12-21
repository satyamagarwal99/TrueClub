package com.example.TrueClub.controller;

import com.example.TrueClub.entity.TrueClubb;
import com.example.TrueClub.service.TrueClubService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TrueClubController {
    private final TrueClubService trueClubService;

    //insert new record in database
    @PostMapping(value = "/save")
    public ResponseEntity<String> saveEntity(@RequestBody TrueClubb trueClubb) {
        return ResponseEntity.ok(trueClubService.saveTrueClub(trueClubb));
    }

    //Get the record based on given id
    @GetMapping(value = "/id/{id}")
    public ResponseEntity<TrueClubb> getTrueClubbById(@PathVariable("id")String id) {
        return ResponseEntity.ok(trueClubService.findByIdService(id));
    }

    //update the exsisting record
    @PutMapping(value = "/update")
    public String updateTrueClub(@RequestBody TrueClubb trueClubb) {
        return trueClubService.updateTrueClub(trueClubb);
    }

    // Delete the record based on give id
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteStocksByProductNumber(@PathVariable String id) {
        return ResponseEntity.ok(trueClubService.deleteTrueClubById(id));
    }

    //Get all records
    @GetMapping(value = "/")
    public List<TrueClubb> getAllList() {
        return trueClubService.findAllList();
    }
}
