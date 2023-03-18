package com.zcorp.medversant.api.web;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zcorp.medversant.api.model.Disclosure;
import com.zcorp.medversant.api.model.Education;
import com.zcorp.medversant.api.model.HealthCareFacility;
import com.zcorp.medversant.api.model.HealthPlans;
import com.zcorp.medversant.api.model.License;
import com.zcorp.medversant.api.model.OthersIdsCertificate;
import com.zcorp.medversant.api.model.PersonalInformation;
import com.zcorp.medversant.api.model.PracticeInfoCoveringCollegues;
import com.zcorp.medversant.api.model.PracticeInfoCredentialContact;
import com.zcorp.medversant.api.model.PracticeInfoPracticeLocation;
import com.zcorp.medversant.api.model.PracticeInfoUniqueCircu;
import com.zcorp.medversant.api.model.Provider;
import com.zcorp.medversant.api.model.Registration;
import com.zcorp.medversant.api.model.RegistrationIDs;
import com.zcorp.medversant.api.model.Specialties;
import com.zcorp.medversant.api.model.TeachingAppointment;
import com.zcorp.medversant.api.model.Training;
import com.zcorp.medversant.api.model.WorkHistoryEmployement;
import com.zcorp.medversant.api.model.WorkHistoryEmploymentGap;
import com.zcorp.medversant.api.model.WorkHistoryProfessionalOragnization;
import com.zcorp.medversant.api.model.WorkkHistoryProfessionalRefrence;
import com.zcorp.medversant.api.repository.PracticeInfoCredentialContactReposirty;
import com.zcorp.medversant.api.web.response.UserResponse;
import com.zcorp.medversant.api.web.service.DisclosureService;
import com.zcorp.medversant.api.web.service.EducationService;
import com.zcorp.medversant.api.web.service.HealthCareFaciltyService;
import com.zcorp.medversant.api.web.service.HealthPlanService;
import com.zcorp.medversant.api.web.service.LicenseService;
import com.zcorp.medversant.api.web.service.OthersIdsCertificateService;
import com.zcorp.medversant.api.web.service.PersonalInfoService;
import com.zcorp.medversant.api.web.service.PracticeInfoCoveringColleguesService;
import com.zcorp.medversant.api.web.service.PracticeInfoCredentialContactService;
import com.zcorp.medversant.api.web.service.PracticeInfoPracticeLocationService;
import com.zcorp.medversant.api.web.service.PracticeInfoUniqueCircuService;
import com.zcorp.medversant.api.web.service.ProviderService;
import com.zcorp.medversant.api.web.service.RegistrationIdsService;
import com.zcorp.medversant.api.web.service.SpecialistService;
import com.zcorp.medversant.api.web.service.TeachingAppointmentService;
import com.zcorp.medversant.api.web.service.TrainingService;
import com.zcorp.medversant.api.web.service.WorkHistoryEmployeementService;
import com.zcorp.medversant.api.web.service.WorkHistoryEmploymentGapService;
import com.zcorp.medversant.api.web.service.WorkHistoryProfessionalOragnizationService;
import com.zcorp.medversant.api.web.service.WorkkHistoryProfessionalRefrenceService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProviderController {
    
    private final ProviderService providerService; 
    private final PersonalInfoService personalInfoService;
    private final RegistrationIdsService registrationIDsService;
    private final LicenseService licenseService;
    private final OthersIdsCertificateService othersIdsCertificateService;
    private final HealthPlanService healthPlanService;
    private final SpecialistService specialistService;
    private final EducationService educationService;
    private final TrainingService trainingService;
    private final TeachingAppointmentService teachingAppointmentService;
    private final HealthCareFaciltyService careFaciltyService;
    private final WorkHistoryEmployeementService employeementService;
    private final WorkHistoryEmploymentGapService employmentGapService;
    private final WorkkHistoryProfessionalRefrenceService historyProfessionalRefrenceService;
    private final WorkHistoryProfessionalOragnizationService historyProfessionalOragnizationService;
    private final PracticeInfoCredentialContactService credentialContactService;
    private final PracticeInfoPracticeLocationService infoPracticeLocationService;
    private final PracticeInfoCoveringColleguesService practiceInfoCoveringColleguesService;
    private final PracticeInfoUniqueCircuService practiceInfoUniqueCircuService;
    private final DisclosureService disclosureService;

    public ProviderController(final ProviderService providerService, PersonalInfoService
    		personalInfoService, RegistrationIdsService registrationIDsService,
    		LicenseService licenseService, OthersIdsCertificateService 
    		othersIdsCertificateService,HealthPlanService healthPlanService ,SpecialistService specialistService
    		,EducationService educationService,TrainingService trainingService,
    		TeachingAppointmentService teachingAppointmentService,HealthCareFaciltyService careFaciltyService,
    		WorkHistoryEmployeementService employeementService,WorkHistoryEmploymentGapService employmentGapService,
    		WorkkHistoryProfessionalRefrenceService historyProfessionalRefrenceService,
    		WorkHistoryProfessionalOragnizationService historyProfessionalOragnizationService,
    		PracticeInfoCredentialContactService credentialContactService,
    		PracticeInfoPracticeLocationService infoPracticeLocationService,
    		PracticeInfoCoveringColleguesService practiceInfoCoveringColleguesService,
    		PracticeInfoUniqueCircuService practiceInfoUniqueCircuService
    		,DisclosureService disclosureService) {
        this.providerService = providerService;
        this.personalInfoService = personalInfoService;
        this.registrationIDsService = registrationIDsService;
        this.licenseService = licenseService;
        this.othersIdsCertificateService=othersIdsCertificateService;
        this.healthPlanService=healthPlanService;
        this.specialistService=specialistService;
        this.educationService=educationService;
        this.trainingService=trainingService;
        this.teachingAppointmentService=teachingAppointmentService;
        this.careFaciltyService=careFaciltyService;
        this.employeementService=employeementService;
        this.employmentGapService=employmentGapService;
        this.historyProfessionalRefrenceService=historyProfessionalRefrenceService;
        this.historyProfessionalOragnizationService=historyProfessionalOragnizationService;
        this.credentialContactService=credentialContactService;
        this.infoPracticeLocationService=infoPracticeLocationService;
        this.practiceInfoCoveringColleguesService=practiceInfoCoveringColleguesService;
        this.practiceInfoUniqueCircuService=practiceInfoUniqueCircuService;
        this.disclosureService=disclosureService;

    }   

    /*  
     * Find all providers 
     */
    @GetMapping("/provider")
    @Transactional
    public List<Provider> index() {
        return providerService.findAll();
    }
    
    @GetMapping("/personalinfo")
    @Transactional
    public List<PersonalInformation> index1() {
        return personalInfoService.findAll();
    }
    
 
    /*
     * Add/Create provider
     */
    @PostMapping(value = "/provider/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addProvider(@Valid @RequestBody Provider provider) throws Throwable{
        UserResponse response = new UserResponse();
        response.setStatus(true);
        response.setMessage("Provider store successfully");
        try {
            providerService.createProvider(provider);
            return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setStatus(false);
            response.setMessage("Provider store error" +" " +e);
            return new ResponseEntity<UserResponse>(response, HttpStatus.BAD_REQUEST);
        }
    }

    /*
     * Add/Create Personal Information
     */
    @PostMapping(value = "/provider/personal-info/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addPersonalInformation(@Valid @RequestBody PersonalInformation personalInfo) throws Throwable {
        UserResponse response = new UserResponse(); 
        response.setStatus(true);
        response.setMessage("Personal information store successfully");
        try {
            personalInfoService.addPersonalInformation(personalInfo);
            return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
        }catch (Exception e) {
            response.setStatus(false);
            response.setMessage("Personal information store failed. " +e);
            return new ResponseEntity<UserResponse>(response, HttpStatus.BAD_REQUEST);
        }
    }

    /*
     * Add/Create Registration IDs
     */
    @PostMapping(value = "/provider/registration-ids/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addRegistrationIds(@Valid @RequestBody RegistrationIDs registrationIDs) throws Throwable {
        UserResponse response = new UserResponse(); 
        response.setStatus(true); 
        response.setMessage("Registration IDs store successfully"); 
        try {
            registrationIDsService.addRegistrationIDs(registrationIDs);
            return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setStatus(false);
            response.setMessage("Registration IDs store failed. " +e);
            return new ResponseEntity<UserResponse>(response, HttpStatus.BAD_REQUEST);
        }
    }

    /*
     * Add/Create License
     */
    @PostMapping(value = "/provider/license/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addLicense(@Valid @RequestBody License license) throws Throwable {
        UserResponse response = new UserResponse();
        response.setStatus(true);
        response.setMessage("License store successfully");
        try {
            licenseService.addLicense(license);
            return new ResponseEntity<UserResponse>(response, HttpStatus.OK); 
        }catch(Exception e) {
            response.setStatus(false);
            response.setMessage("License store failed. " +e);
            return new ResponseEntity<UserResponse>(response, HttpStatus.BAD_REQUEST);
        }
    } 

    /*
     * Get all states
     */
    /*
     * Add/create OtherIdsCertificate
     * */
    @PostMapping(value = "/provider/certificate/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addOtherIdsCertificates(@Valid @RequestBody OthersIdsCertificate othersIdsCertificate) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Other IDs Certificate Store Successfully");
    	try {
    		othersIdsCertificateService.addOtherIdsCertificate(othersIdsCertificate);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Other IDs Certificate Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/healthplan/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addHealthPlan(@Valid @RequestBody HealthPlans healthPlans) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Health Plan  Store Successfully");
    	try {
    		healthPlanService.addHealthPlan(healthPlans);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Health Plan Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/specialist/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addSpecialist(@Valid @RequestBody Specialties specialties) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Specialist Store Successfully");
    	try {
    		specialistService.addHealthPlan(specialties);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Specialist Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    
    @PostMapping(value = "/provider/education/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addEducation(@Valid @RequestBody Education education) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Education Store Successfully");
    	try {
    		educationService.addEducation(education);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Education Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/training/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addTraining(@Valid @RequestBody Training training) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Training Store Successfully");
    	try {
    		trainingService.addTraining(training);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Training Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    
    @PostMapping(value = "/provider/teaching/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addTeqaching(@Valid @RequestBody TeachingAppointment teachingAppointment) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Teaching Appoitment Store Successfully");
    	try {
    		teachingAppointmentService.AddTeachingAppoitment(teachingAppointment);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Teaching Appoitment Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/healthcare/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addHealthCareFacility(@Valid @RequestBody HealthCareFacility healthCareFacility) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Health Care Facility Store Successfully");
    	try {
    		careFaciltyService.addHealthCareFacility(healthCareFacility);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Health Care Facility Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/workHistory-employeement/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addEmployemt(@Valid @RequestBody WorkHistoryEmployement workHistoryEmployement) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Employeement Store Successfully");
    	try {
    		employeementService.addEmployeement(workHistoryEmployement);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Employeement Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/workHistory-employmentgap/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addEmployemt(@Valid @RequestBody WorkHistoryEmploymentGap workHistoryEmploymentGap) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Employeement Gap Store Successfully");
    	try {
    		employmentGapService.addEmployment(workHistoryEmploymentGap);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Employeement Gap Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/workHistory-professionalRef/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addProfessionalRefrence(@Valid @RequestBody WorkkHistoryProfessionalRefrence historyProfessionalRefrence) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Professional Refrence Store Successfully");
    	try {
    		historyProfessionalRefrenceService.addProfessionalRefrence(historyProfessionalRefrence);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Professional Refrence Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/workHistory-professionalorgnization/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addProfessionalOrg(@Valid @RequestBody WorkHistoryProfessionalOragnization historyProfessionalOragnization) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Professional Orgnization Store Successfully");
    	try {
    		historyProfessionalOragnizationService.addProfessionalOragnization(historyProfessionalOragnization);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Professional Orgnization Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    ///Prectice information start
    
    @PostMapping(value = "/provider/practiceInfo-credenatialContact/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addCredenatialContact(@Valid @RequestBody PracticeInfoCredentialContact practiceInfoCredentialContact) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Credenatial Contact Store Successfully");
    	try {
    		credentialContactService.addCredentialContact(practiceInfoCredentialContact);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Credenatial Contact Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/practiceInfo-practiceLocation/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addPracticeLocation(@Valid @RequestBody PracticeInfoPracticeLocation infoPracticeLocation) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Practice Location Store Successfully");
    	try {
    		infoPracticeLocationService.addPracticeLocation(infoPracticeLocation);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Practice Location Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/practiceInfo-coveringColl/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addCoveringColl(@Valid @RequestBody PracticeInfoCoveringCollegues practiceInfoCoveringCollegues) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Covering Collegues Store Successfully");
    	try {
    		practiceInfoCoveringColleguesService.addCoveringCollegues(practiceInfoCoveringCollegues);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Covering Collegues Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/practiceInfo-uniqueCircu/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addUUniqueCircu(@Valid @RequestBody PracticeInfoUniqueCircu practiceInfoUniqueCircu) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Unique Circumstances Store Successfully");
    	try {
    		practiceInfoUniqueCircuService.addUniqueCircu(practiceInfoUniqueCircu);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Unique Circumstances Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    @PostMapping(value = "/provider/disclosure/add", consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity<UserResponse> addDisclosure(@Valid @RequestBody Disclosure disclosure) throws Throwable{
    	UserResponse response =new UserResponse();
    	response.setStatus(true);
    	response.setMessage("Disclosure Store Successfully");
    	try {
    		disclosureService.addDisclosure(disclosure);
    		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    	}catch(Exception e) {
    		response.setStatus(false);
    		response.setMessage("Disclosure Store Faild");
    		return new ResponseEntity<UserResponse>(response,HttpStatus.BAD_REQUEST);
    	}
    }
    
    
    @RequestMapping(value="/states")
    public List<String> allStates() {
        List<String> states = providerService.getStates();
        return states;
    }
}
