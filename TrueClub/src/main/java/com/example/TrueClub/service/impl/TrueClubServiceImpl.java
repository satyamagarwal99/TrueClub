package com.example.TrueClub.service.impl;

import com.example.TrueClub.entity.TrueClubb;
import com.example.TrueClub.repository.TrueClubRepository;
import com.example.TrueClub.service.TrueClubService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TrueClubServiceImpl implements TrueClubService {
    private final TrueClubRepository trueClubRepository;

    @Override
    public String saveTrueClub(TrueClubb trueClubb) {
        trueClubRepository.save(trueClubb);
        return "Your Data has saved";
    }

    @Override
    public List<TrueClubb> findAllList() {
        return trueClubRepository.findAll();
    }

    @Override
    public TrueClubb findByIdService(String id) {
        TrueClubb trueClubb = trueClubRepository.findById(id).get();
        return trueClubb;
    }

    @Override
    public String updateTrueClub(TrueClubb trueClubb) {
        trueClubRepository.save(trueClubb);
        return "Your Update has been made";
    }

    @Override
    public String deleteTrueClubById(String id) {
        id = findByIdService(id).getId();
        return "Stocks Deleted corresponding to student";
    }
}
