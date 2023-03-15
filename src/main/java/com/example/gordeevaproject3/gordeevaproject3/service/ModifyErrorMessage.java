package com.example.gordeevaproject3.gordeevaproject3.service;

import com.example.gordeevaproject3.gordeevaproject3.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")

public class ModifyErrorMessage implements MyModifyService{

    @Override
    public Response modify (Response response) {
        response.setErrorMessage("Что-то сломалось");
        return response;
    }
}

