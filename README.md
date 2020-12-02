# medical
url to login >> http://localhost:8086/patient/v1.0/login
url to register >>  http://localhost:8086/patient/v1.0/regsit
url to add doctor >> http://localhost:8086/doctor/v2.0/adddoctor

sql scripts

create table Doctor
(
recid number ,
name VARCHAR(100),
specialization VARCHAR(50),
Governorate VARCHAR(50),
area VARCHAR(50),
CONSTRAINT Doctor_pk PRIMARY KEY (recid)
);

--***************************************----
create table Doctor_Available_dates
(
recid number ,
doctor_id  number,
day VARCHAR(20),
from_Time number,
to_time number,
Notes varchar(200),
CONSTRAINT Doctor_Available_dates_pk PRIMARY KEY (recid),
CONSTRAINT fk_Doctor_Available_dates
    FOREIGN KEY (doctor_id)
    REFERENCES Doctor(recid)
);
--****************************************---
create table patient
(
 recid number,
 name varchar(100),
 user_name varchar(50),
 password varchar(100),
 phone varchar(20),
 email varchar(50),
 CONSTRAINT user_pk PRIMARY KEY (recid)
);

--**********************************----
create table appointment
(
recid number,
doctor_id number,
patient_id number,
appointment_date date,
appointment_time number,
status varchar(20),
CONSTRAINT appointment_pk PRIMARY KEY (recid),
CONSTRAINT fk_Doctor_appointment
    FOREIGN KEY (doctor_id)
    REFERENCES Doctor(recid),
CONSTRAINT fk_Doctor_patient
    FOREIGN KEY (doctor_id)
    REFERENCES patient(recid)  
);
