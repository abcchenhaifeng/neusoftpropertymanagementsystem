package cn.yichen.PropertyManagement03.baseinfo.model;

public class Building {
    private Integer buildingno;

    private Integer areano;

    private String bcode;

    private String baddress;

    private Integer buildingtypeno;

    private String direction;

    private Long totalhome;

    private Long totalhouse;

    public Integer getBuildingno() {
        return buildingno;
    }

    public void setBuildingno(Integer buildingno) {
        this.buildingno = buildingno;
    }

    public Integer getAreano() {
        return areano;
    }

    public void setAreano(Integer areano) {
        this.areano = areano;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode == null ? null : bcode.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public Integer getBuildingtypeno() {
        return buildingtypeno;
    }

    public void setBuildingtypeno(Integer buildingtypeno) {
        this.buildingtypeno = buildingtypeno;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Long getTotalhome() {
        return totalhome;
    }

    public void setTotalhome(Long totalhome) {
        this.totalhome = totalhome;
    }

    public Long getTotalhouse() {
        return totalhouse;
    }

    public void setTotalhouse(Long totalhouse) {
        this.totalhouse = totalhouse;
    }
}