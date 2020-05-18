package Tables;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Delegation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "desc")
    private String desc;
    @Column(name = "dTS", nullable=false)
    private Date dTS;
    @Column(name = "dTStop", nullable=false)
    private Date dTStop;
    @Column(name = "tDA", columnDefinition = "double default 30")
    private double tDA;
    @Column(name = "bN", columnDefinition = "integer default 30")
    private int bN;
    @Column(name = "dN", columnDefinition = "integer default 0")
    private int dN;
    @Column(name = "sN", columnDefinition = "integer default 0")
    private int sN;
    @Enumerated(EnumType.STRING)
    @Column(name = "tT")
    private TransportType tT;
    @Column(name = "tP")
    private double tP;
    @Column(name = "aC")
    private Enum aC;
    @Column(name = "km")
    private double km;
    @Column(name = "aP")
    private double aP;
    @Column(name = "oTP")
    private double oTP;
    @Column(name = "oOD")
    private String oOD;
    @Column(name = "oOP")
    private double oOP;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user;

    public Delegation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public Date getDateTimeStart() {
        return dTS;
    }

    public void setDateTimeStart(Date dTS) {
        this.dTS = dTS;
    }

    public Date getDateTimeStop() {
        return dTStop;
    }

    public void setDateTimeStop(Date dTStop) {
        this.dTStop = dTStop;
    }

    public double getTravelDietAmount() {
        return tDA;
    }

    public void setTravelDietAmount(double tDA) {
        this.tDA = tDA;
    }

    public int getBreakfastNumber() {
        return bN;
    }

    public void setBreakfastNumber(int bN) {
        this.bN = bN;
    }

    public int getDinnerNumber() {
        return dN;
    }

    public void setDinnerNumber(int dN) {
        this.dN = dN;
    }

    public int getSupperNumber() {
        return sN;
    }

    public void setSupperNumber(int sN) {
        this.sN = sN;
    }

    public TransportType getTransportType() {
        return tT;
    }

    public void setTransportType(TransportType tT) {
        this.tT = tT;
    }

    public double getTicketPrice() {
        return tP;
    }

    public void setTicketPrice(double tP) {
        this.tP = tP;
    }

    public Enum getAutoCapacity() {
        return aC;
    }

    public void setAutoCapacity(Enum aC) {
        this.aC = aC;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getAccomodationPrice() {
        return aP;
    }

    public void setAccomodationPrice(double aP) {
        this.aP = aP;
    }

    public double getOtherTicketsPrice() {
        return oTP;
    }

    public void setOtherTicketsPrice(double oTP) {
        this.oTP = oTP;
    }

    public String getOtherOutlayDesc() {
        return oOD;
    }

    public void setOtherOutlayDesc(String oOD) {
        this.oOD = oOD;
    }

    public double getOtherOutlayPrice() {
        return oOP;
    }

    public void setOtherOutlayPrice(double oOP) {
        this.oOP = oOP;
    }
}
