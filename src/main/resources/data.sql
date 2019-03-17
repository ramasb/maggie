insert into MEMBERS(MEMBER_ID, FULL_NAME, JOIN_DATE, EXPIRY_DATE) VALUES(1, 'Bhupeshraj', PARSEDATETIME('1-Feb-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), PARSEDATETIME('1-Feb-2020 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'));
    
insert into MEMBERS(MEMBER_ID,FULL_NAME, JOIN_DATE, EXPIRY_DATE) VALUES(2, 'Yogeshwar', PARSEDATETIME('1-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), PARSEDATETIME('1-Mar-2020 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'));
    

insert into SCHEDULES(SCHEDULE_ID, MEMBER_ID, SCHEDULE_NAME, SCHEDULED_DATE, SCHEDULE_STATUS) VALUES(1, 1, 'Kick Boxing', PARSEDATETIME('1-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), 'COMPLETED');
    
insert into SCHEDULES(SCHEDULE_ID, MEMBER_ID, SCHEDULE_NAME, SCHEDULED_DATE, SCHEDULE_STATUS) VALUES(2, 1, 'Kick Boxing', PARSEDATETIME('20-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), 'SCHEDULED');
    
insert into SCHEDULES(SCHEDULE_ID, MEMBER_ID, SCHEDULE_NAME, SCHEDULED_DATE, SCHEDULE_STATUS) VALUES(3, 2, 'Static Cycling', PARSEDATETIME('5-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), 'COMPLETED');

insert into SCHEDULES(SCHEDULE_ID, MEMBER_ID, SCHEDULE_NAME, SCHEDULED_DATE, SCHEDULE_STATUS) VALUES(4, 2, 'Body Sculpting', PARSEDATETIME('10-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), 'COMPLETED');
    
insert into SCHEDULES(SCHEDULE_ID, MEMBER_ID, SCHEDULE_NAME, SCHEDULED_DATE, SCHEDULE_STATUS) VALUES(5, 2, 'Kick Boxing', PARSEDATETIME('30-Mar-2019 10:00:00',
    'd-MMM-yyyy HH:mm:ss', 'en', 'GMT'), 'SCHEDULED');