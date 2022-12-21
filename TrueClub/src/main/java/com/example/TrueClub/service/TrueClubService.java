package com.example.TrueClub.service;

import com.example.TrueClub.entity.TrueClubb;

import java.util.List;

public interface TrueClubService {
    String saveTrueClub(TrueClubb trueClubb);
    List<TrueClubb> findAllList();
    TrueClubb findByIdService(String id);
    String updateTrueClub(TrueClubb trueClubb);
    String deleteTrueClubById(String id);
}
