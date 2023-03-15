package com.example.gordeevaproject3.gordeevaproject3.service;

import com.example.gordeevaproject3.gordeevaproject3.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("id1")

public class ModifyUid implements MyModifyService{
    @Override
    public Response modify (Response response) {
        response.setUid("New Uid");
        return response;
    }
}
