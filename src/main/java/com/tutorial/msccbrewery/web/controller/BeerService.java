package com.tutorial.msccbrewery.web.controller;

import com.tutorial.msccbrewery.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
