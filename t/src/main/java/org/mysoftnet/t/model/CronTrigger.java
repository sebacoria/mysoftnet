
package org.mysoftnet.t.model;

import javax.persistence.*;

/**
 * Java model for the Force.com CronTrigger object.
 *
 * For this class, the following operations are available
 * via Force.com JPA:
 *
 *     Create : false
 *     Read   : true
 *     Update : false
 *     Delete : false
 *
 * This class was auto-generated. It is considered owned
 * by the Force.com database.
 *
 * @author mysoftnet (sebastian.a.coria@gmail.com)
 **/
@javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
@Table(name="CronTrigger")
@Entity(name="CronTrigger")
@com.force.sdk.jpa.annotation.CustomObject(readOnlySchema=true)
public class CronTrigger extends com.force.sdk.jpa.model.BaseForceObject {

    public static final String KEY_PREFIX = "08e";


    protected java.util.Calendar nextFireTime;
    protected java.util.Calendar previousFireTime;
    protected String state;
    protected java.util.Calendar startTime;
    protected java.util.Calendar endTime;
    protected String cronExpression;
    protected TimeZoneSidKeyEnum timeZoneSidKey;
    protected User ownerId;
    protected User lastModifiedBy;
    protected User createdBy;
    protected java.util.Calendar createdDate;
    protected int timesTriggered;
    

    public java.util.Calendar getNextFireTime() {
        return this.nextFireTime;
    }
    
    public void setNextFireTime(java.util.Calendar nextFireTime) {
        this.nextFireTime = nextFireTime;
    }
    
    public java.util.Calendar getPreviousFireTime() {
        return this.previousFireTime;
    }
    
    public void setPreviousFireTime(java.util.Calendar previousFireTime) {
        this.previousFireTime = previousFireTime;
    }
    
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public java.util.Calendar getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }
    
    public java.util.Calendar getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }
    
    public String getCronExpression() {
        return this.cronExpression;
    }
    
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
    
    @Enumerated(value=EnumType.STRING)
    public TimeZoneSidKeyEnum getTimeZoneSidKey() {
        return this.timeZoneSidKey;
    }
    
    public void setTimeZoneSidKey(TimeZoneSidKeyEnum timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    public User getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="LastModifiedById")
    public User getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    @ManyToOne
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CreatedById")
    public User getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    public int getTimesTriggered() {
        return this.timesTriggered;
    }
    
    public void setTimesTriggered(int timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
    
    








    /**
     * Java model for the TimeZoneSidKey picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    @javax.annotation.Generated(value="com.force.sdk.codegen.ForceJPAClassGenerator")
    public enum TimeZoneSidKeyEnum implements com.force.sdk.jpa.model.PicklistValueEnum {

        PACIFIC_KIRITIMATI(true,false,"(GMT+14:00) Line Islands Time (Pacific/Kiritimati)","Pacific/Kiritimati"),
        PACIFIC_ENDERBURY(true,false,"(GMT+13:00) Phoenix Islands Time (Pacific/Enderbury)","Pacific/Enderbury"),
        PACIFIC_TONGATAPU(true,false,"(GMT+13:00) Tonga Time (Pacific/Tongatapu)","Pacific/Tongatapu"),
        PACIFIC_CHATHAM(true,false,"(GMT+12:45) Chatham Standard Time (Pacific/Chatham)","Pacific/Chatham"),
        ASIA_KAMCHATKA(true,false,"(GMT+12:00) Magadan Time (Asia/Kamchatka)","Asia/Kamchatka"),
        PACIFIC_AUCKLAND(true,false,"(GMT+12:00) New Zealand Standard Time (Pacific/Auckland)","Pacific/Auckland"),
        PACIFIC_FIJI(true,false,"(GMT+12:00) Fiji Time (Pacific/Fiji)","Pacific/Fiji"),
        PACIFIC_NORFOLK(true,false,"(GMT+11:30) Norfolk Islands Time (Pacific/Norfolk)","Pacific/Norfolk"),
        PACIFIC_GUADALCANAL(true,false,"(GMT+11:00) Solomon Islands Time (Pacific/Guadalcanal)","Pacific/Guadalcanal"),
        AUSTRALIA_LORD_HOWE(true,false,"(GMT+10:30) Lord Howe Standard Time (Australia/Lord_Howe)","Australia/Lord_Howe"),
        AUSTRALIA_BRISBANE(true,false,"(GMT+10:00) Australian Eastern Standard Time (Australia/Brisbane)","Australia/Brisbane"),
        AUSTRALIA_SYDNEY(true,false,"(GMT+10:00) Australian Eastern Standard Time (Australia/Sydney)","Australia/Sydney"),
        AUSTRALIA_ADELAIDE(true,false,"(GMT+09:30) Australian Central Standard Time (Australia/Adelaide)","Australia/Adelaide"),
        AUSTRALIA_DARWIN(true,false,"(GMT+09:30) Australian Central Standard Time (Australia/Darwin)","Australia/Darwin"),
        ASIA_SEOUL(true,false,"(GMT+09:00) Korean Standard Time (Asia/Seoul)","Asia/Seoul"),
        ASIA_TOKYO(true,false,"(GMT+09:00) Japan Standard Time (Asia/Tokyo)","Asia/Tokyo"),
        ASIA_HONG_KONG(true,false,"(GMT+08:00) Hong Kong Time (Asia/Hong_Kong)","Asia/Hong_Kong"),
        ASIA_KUALA_LUMPUR(true,false,"(GMT+08:00) Malaysia Time (Asia/Kuala_Lumpur)","Asia/Kuala_Lumpur"),
        ASIA_MANILA(true,false,"(GMT+08:00) Philippine Time (Asia/Manila)","Asia/Manila"),
        ASIA_SHANGHAI(true,false,"(GMT+08:00) China Standard Time (Asia/Shanghai)","Asia/Shanghai"),
        ASIA_SINGAPORE(true,false,"(GMT+08:00) Singapore Standard Time (Asia/Singapore)","Asia/Singapore"),
        ASIA_TAIPEI(true,false,"(GMT+08:00) Taipei Standard Time (Asia/Taipei)","Asia/Taipei"),
        AUSTRALIA_PERTH(true,false,"(GMT+08:00) Australian Western Standard Time (Australia/Perth)","Australia/Perth"),
        ASIA_BANGKOK(true,false,"(GMT+07:00) Indochina Time (Asia/Bangkok)","Asia/Bangkok"),
        ASIA_JAKARTA(true,false,"(GMT+07:00) Western Indonesia Time (Asia/Jakarta)","Asia/Jakarta"),
        ASIA_SAIGON(true,false,"(GMT+07:00) Indochina Time (Asia/Saigon)","Asia/Saigon"),
        ASIA_RANGOON(true,false,"(GMT+06:30) Myanmar Time (Asia/Rangoon)","Asia/Rangoon"),
        ASIA_DACCA(true,false,"(GMT+06:00) Bangladesh Time (Asia/Dacca)","Asia/Dacca"),
        ASIA_YEKATERINBURG(true,false,"(GMT+06:00) Yekaterinburg Time (Asia/Yekaterinburg)","Asia/Yekaterinburg"),
        ASIA_KATMANDU(true,false,"(GMT+05:45) Nepal Time (Asia/Katmandu)","Asia/Katmandu"),
        ASIA_CALCUTTA(true,false,"(GMT+05:30) India Standard Time (Asia/Calcutta)","Asia/Calcutta"),
        ASIA_COLOMBO(true,false,"(GMT+05:30) India Standard Time (Asia/Colombo)","Asia/Colombo"),
        ASIA_KARACHI(true,false,"(GMT+05:00) Pakistan Time (Asia/Karachi)","Asia/Karachi"),
        ASIA_TASHKENT(true,false,"(GMT+05:00) Uzbekistan Time (Asia/Tashkent)","Asia/Tashkent"),
        ASIA_KABUL(true,false,"(GMT+04:30) Afghanistan Time (Asia/Kabul)","Asia/Kabul"),
        ASIA_TEHRAN(true,false,"(GMT+04:30) Iran Daylight Time (Asia/Tehran)","Asia/Tehran"),
        ASIA_DUBAI(true,false,"(GMT+04:00) Gulf Standard Time (Asia/Dubai)","Asia/Dubai"),
        ASIA_TBILISI(true,false,"(GMT+04:00) Georgia Time (Asia/Tbilisi)","Asia/Tbilisi"),
        EUROPE_MOSCOW(true,false,"(GMT+04:00) Moscow Standard Time (Europe/Moscow)","Europe/Moscow"),
        AFRICA_NAIROBI(true,false,"(GMT+03:00) East Africa Time (Africa/Nairobi)","Africa/Nairobi"),
        ASIA_BAGHDAD(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Baghdad)","Asia/Baghdad"),
        ASIA_JERUSALEM(true,false,"(GMT+03:00) Israel Daylight Time (Asia/Jerusalem)","Asia/Jerusalem"),
        ASIA_KUWAIT(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Kuwait)","Asia/Kuwait"),
        ASIA_RIYADH(true,false,"(GMT+03:00) Arabian Standard Time (Asia/Riyadh)","Asia/Riyadh"),
        EUROPE_ATHENS(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Athens)","Europe/Athens"),
        EUROPE_BUCHAREST(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Bucharest)","Europe/Bucharest"),
        EUROPE_HELSINKI(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Helsinki)","Europe/Helsinki"),
        EUROPE_ISTANBUL(true,false,"(GMT+03:00) Eastern European Summer Time (Europe/Istanbul)","Europe/Istanbul"),
        EUROPE_MINSK(true,false,"(GMT+03:00) Further-Eastern European Time (Europe/Minsk)","Europe/Minsk"),
        AFRICA_CAIRO(true,false,"(GMT+02:00) Eastern European Time (Africa/Cairo)","Africa/Cairo"),
        AFRICA_JOHANNESBURG(true,false,"(GMT+02:00) South Africa Standard Time (Africa/Johannesburg)","Africa/Johannesburg"),
        EUROPE_AMSTERDAM(true,false,"(GMT+02:00) Central European Summer Time (Europe/Amsterdam)","Europe/Amsterdam"),
        EUROPE_BERLIN(true,false,"(GMT+02:00) Central European Summer Time (Europe/Berlin)","Europe/Berlin"),
        EUROPE_BRUSSELS(true,false,"(GMT+02:00) Central European Summer Time (Europe/Brussels)","Europe/Brussels"),
        EUROPE_PARIS(true,false,"(GMT+02:00) Central European Summer Time (Europe/Paris)","Europe/Paris"),
        EUROPE_PRAGUE(true,false,"(GMT+02:00) Central European Summer Time (Europe/Prague)","Europe/Prague"),
        EUROPE_ROME(true,false,"(GMT+02:00) Central European Summer Time (Europe/Rome)","Europe/Rome"),
        AFRICA_ALGIERS(true,false,"(GMT+01:00) Central European Time (Africa/Algiers)","Africa/Algiers"),
        EUROPE_DUBLIN(true,false,"(GMT+01:00) Irish Summer Time (Europe/Dublin)","Europe/Dublin"),
        EUROPE_LISBON(true,false,"(GMT+01:00) Western European Summer Time (Europe/Lisbon)","Europe/Lisbon"),
        EUROPE_LONDON(true,false,"(GMT+01:00) British Summer Time (Europe/London)","Europe/London"),
        GMT(true,false,"(GMT+00:00) Greenwich Mean Time (GMT)","GMT"),
        ATLANTIC_CAPE_VERDE(true,false,"(GMT-01:00) Cape Verde Time (Atlantic/Cape_Verde)","Atlantic/Cape_Verde"),
        ATLANTIC_SOUTH_GEORGIA(true,false,"(GMT-02:00) South Georgia Time (Atlantic/South_Georgia)","Atlantic/South_Georgia"),
        AMERICA_ST_JOHNS(true,false,"(GMT-02:30) Newfoundland Daylight Time (America/St_Johns)","America/St_Johns"),
        AMERICA_BUENOS_AIRES(true,false,"(GMT-03:00) Argentina Time (America/Buenos_Aires)","America/Buenos_Aires"),
        AMERICA_HALIFAX(true,false,"(GMT-03:00) Atlantic Daylight Time (America/Halifax)","America/Halifax"),
        AMERICA_SAO_PAULO(true,false,"(GMT-03:00) Brasilia Time (America/Sao_Paulo)","America/Sao_Paulo"),
        ATLANTIC_BERMUDA(true,false,"(GMT-03:00) Atlantic Daylight Time (Atlantic/Bermuda)","Atlantic/Bermuda"),
        AMERICA_INDIANAPOLIS(true,false,"(GMT-04:00) Eastern Daylight Time (America/Indianapolis)","America/Indianapolis"),
        AMERICA_NEW_YORK(true,false,"(GMT-04:00) Eastern Daylight Time (America/New_York)","America/New_York"),
        AMERICA_PUERTO_RICO(true,false,"(GMT-04:00) Atlantic Standard Time (America/Puerto_Rico)","America/Puerto_Rico"),
        AMERICA_SANTIAGO(true,false,"(GMT-04:00) Chile Time (America/Santiago)","America/Santiago"),
        AMERICA_CARACAS(true,false,"(GMT-04:30) Venezuela Time (America/Caracas)","America/Caracas"),
        AMERICA_BOGOTA(true,false,"(GMT-05:00) Colombia Time (America/Bogota)","America/Bogota"),
        AMERICA_CHICAGO(true,false,"(GMT-05:00) Central Daylight Time (America/Chicago)","America/Chicago"),
        AMERICA_LIMA(true,false,"(GMT-05:00) Peru Time (America/Lima)","America/Lima"),
        AMERICA_MEXICO_CITY(true,false,"(GMT-05:00) Central Daylight Time (America/Mexico_City)","America/Mexico_City"),
        AMERICA_PANAMA(true,false,"(GMT-05:00) Eastern Standard Time (America/Panama)","America/Panama"),
        AMERICA_DENVER(true,false,"(GMT-06:00) Mountain Daylight Time (America/Denver)","America/Denver"),
        AMERICA_EL_SALVADOR(true,false,"(GMT-06:00) Central Standard Time (America/El_Salvador)","America/El_Salvador"),
        AMERICA_LOS_ANGELES(true,false,"(GMT-07:00) Pacific Daylight Time (America/Los_Angeles)","America/Los_Angeles"),
        AMERICA_PHOENIX(true,false,"(GMT-07:00) Mountain Standard Time (America/Phoenix)","America/Phoenix"),
        AMERICA_TIJUANA(true,false,"(GMT-07:00) Pacific Daylight Time (America/Tijuana)","America/Tijuana"),
        AMERICA_ANCHORAGE(true,false,"(GMT-08:00) Alaska Daylight Time (America/Anchorage)","America/Anchorage"),
        PACIFIC_HONOLULU(true,false,"(GMT-10:00) Hawaii-Aleutian Standard Time (Pacific/Honolulu)","Pacific/Honolulu"),
        PACIFIC_NIUE(true,false,"(GMT-11:00) Niue Time (Pacific/Niue)","Pacific/Niue"),
        PACIFIC_PAGO_PAGO(true,false,"(GMT-11:00) Samoa Standard Time (Pacific/Pago_Pago)","Pacific/Pago_Pago"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TimeZoneSidKeyEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean isActive() { return this.isActive; }

        @Override
        public boolean isDefaultValue() { return this.isDefaultValue; }

        @Override
        public String label() { return this.label; }

        @Override
        public String value() { return this.value; }

        public static TimeZoneSidKeyEnum fromValue(String value) {
            if (value == null) return null;

            for (TimeZoneSidKeyEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    






}