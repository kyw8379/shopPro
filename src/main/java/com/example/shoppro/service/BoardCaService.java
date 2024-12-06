package com.example.shoppro.service;


import com.example.shoppro.repository.BoardCaRepository;
import com.example.shoppro.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class BoardCaService {

    private final CategoryRepository categoryRepository;
    private final BoardCaRepository boardCaRepository;







}
