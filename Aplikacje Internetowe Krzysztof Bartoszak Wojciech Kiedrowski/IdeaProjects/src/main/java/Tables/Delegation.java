package Tables;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Delegation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "dateTimeStart", nullable=false)
    private Date dateTimeStart;
    @Column(name = "dateTimeStop", nullable=false)
    private Date dateTimeStop;
    @Column(name = "travelDietAmount", columnDefinition = "double default 30")
    private double travelDietAmount;
    @Column(name = "breakfastNumber", columnDefinition = "integer default 30")
    private int breakfastNumber;
    @Column(name = "dinnerNumber", columnDefinition = "integer default 0")
    private int dinnerNumber;
    @Column(name = "supperNumber", columnDefinition = "integer default 0")
    private int supperNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "transportType")
    private TransportType transportType;
    @Column(name = "ticketPrice")
    private double ticketPrice;
    @Column(name = "autoCapacity")
    private Enum autoCapacity;
    @Column(name = "km")
    private double km;
    @Column(name = "accomodationPrice")
    private double accomodationPrice;
    @Column(name = "otherTicketsPrice")
    private double otherTicketsPrice;
    @Column(name = "otherOutlayDesc")
    private String otherOutlayDesc;
    @Column(name = "otherOutlayPrice")
    private double otherOutlayPrice;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(Date dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public Date getDateTimeStop() {
        return dateTimeStop;
    }

    public void setDateTimeStop(Date dateTimeStop) {
        this.dateTimeStop = dateTimeStop;
    }

    public double getTravelDietAmount() {
        return travelDietAmount;
    }

    public void setTravelDietAmount(double travelDietAmount) {
        this.travelDietAmount = travelDietAmount;
    }

    public int getBreakfastNumber() {
        return breakfastNumber;
    }

    public void setBreakfastNumber(int breakfastNumber) {
        this.breakfastNumber = breakfastNumber;
    }

    public int getDinnerNumber() {
        return dinnerNumber;
    }

    public void setDinnerNumber(int dinnerNumber) {
        this.dinnerNumber = dinnerNumber;
    }

    public int getSupperNumber() {
        return supperNumber;
    }

    public void setSupperNumber(int supperNumber) {
        this.supperNumber = supperNumber;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Enum getAutoCapacity() {
        return autoCapacity;
    }

    public void setAutoCapacity(Enum autoCapacity) {
        this.autoCapacity = autoCapacity;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getAccomodationPrice() {
        return accomodationPrice;
    }

    public void setAccomodationPrice(double accomodationPrice) {
        this.accomodationPrice = accomodationPrice;
    }

    public double getOtherTicketsPrice() {
        return otherTicketsPrice;
    }

    public void setOtherTicketsPrice(double otherTicketsPrice) {
        this.otherTicketsPrice = otherTicketsPrice;
    }

    public String getOtherOutlayDesc() {
        return otherOutlayDesc;
    }

    public void setOtherOutlayDesc(String otherOutlayDesc) {
        this.otherOutlayDesc = otherOutlayDesc;
    }

    public double getOtherOutlayPrice() {
        return otherOutlayPrice;
    }

    public void setOtherOutlayPrice(double otherOutlayPrice) {
        this.otherOutlayPrice = otherOutlayPrice;
    }
}
