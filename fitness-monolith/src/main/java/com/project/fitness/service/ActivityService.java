package com.project.fitness.service;

import com.project.fitness.dto.ActivityRequest;
import com.project.fitness.dto.ActivityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ActivityService
{
    private final ActivityService activityService;

    public ActivityResponse trackActivity(ActivityRequest request)
    {
        activityRepository.save(activity);
    }
}
