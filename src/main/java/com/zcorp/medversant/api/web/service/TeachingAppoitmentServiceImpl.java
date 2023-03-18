package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.TeachingAppointment;
import com.zcorp.medversant.api.repository.TeachingAppointmentRepository;
@Service
public class TeachingAppoitmentServiceImpl implements TeachingAppointmentService {

	@Autowired
	private TeachingAppointmentRepository teachingAppointmentRepository;
	@Override
	public TeachingAppointment AddTeachingAppoitment(TeachingAppointment teachingAppointment) {
		// TODO Auto-generated method stub
		return teachingAppointmentRepository.save(teachingAppointment);
	}

}
