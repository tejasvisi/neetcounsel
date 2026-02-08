package com.newpackage.neetcounsel.dtos;

import java.util.List;


import com.newpackage.neetcounsel.models.Aktu;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public  class AktuRequest {
    private List<Aktu> nirf;
    private List<Aktu> placement;
    private List<Aktu> recommended;
    String userId;
    String fileName;
    public List<Aktu> getNirf() {
        return nirf;
    }

    public void setNirf(List<Aktu> nirf) {
        this.nirf = nirf;
    }

    public List<Aktu> getPlacement() {
        return placement;
    }

    public void setPlacement(List<Aktu> placement) {
        this.placement = placement;
    }

    public List<Aktu> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<Aktu> recommended) {
        this.recommended = recommended;
    }
}
