package com.zcorp.medversant.api.model;

public enum Organization {
    TIVITYHEALTH{
        @Override
        public String asString() {
            return "TivityHealth";
        }
    }, 
    UNIVERSITYOFCALIFORNIA{
        @Override
        public String asString() {
            return "UniversityOfCalifornia";
        }
    }, DWIHN{
        @Override
        public String asString() {
            return "DWIHN";
        }        
    }, SDSU{
        @Override
        public String asString() {
            return "SDSU";
        }
    };

    public abstract String asString();
}
