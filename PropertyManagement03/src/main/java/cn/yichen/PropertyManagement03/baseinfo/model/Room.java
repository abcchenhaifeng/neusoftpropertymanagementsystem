package cn.yichen.PropertyManagement03.baseinfo.model;

public class Room {
    private Integer roomno;

    private Integer housetypeno;

    private Integer buildingno;

    private String departmentcode;

    private String floor;

    private String roomcode;

    private Double buildingarea;

    private Double feearea;

    private String roomstatus;

    private String roomtype;

    public Integer getRoomno() {
        return roomno;
    }

    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }

    public Integer getHousetypeno() {
        return housetypeno;
    }

    public void setHousetypeno(Integer housetypeno) {
        this.housetypeno = housetypeno;
    }

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getRoomcode() {
        return roomcode;
    }

    public void setRoomcode(String roomcode) {
        this.roomcode = roomcode == null ? null : roomcode.trim();
    }

    public Double getBuildingarea() {
        return buildingarea;
    }

    public void setBuildingarea(Double buildingarea) {
        this.buildingarea = buildingarea;
    }

    public Double getFeearea() {
        return feearea;
    }

    public void setFeearea(Double feearea) {
        this.feearea = feearea;
    }

    public String getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(String roomstatus) {
        this.roomstatus = roomstatus == null ? null : roomstatus.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }
}