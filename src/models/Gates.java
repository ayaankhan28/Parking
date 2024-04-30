package models;

public class Gates {
    private int gateNumber;
    private OperatorCus operator;
    private GateStatus gateStatus;
    private GatesType gateType;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public OperatorCus getOperator() {
        return operator;
    }

    public void setOperator(OperatorCus operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GatesType getGateType() {
        return gateType;
    }

    public void setGateType(GatesType gateType) {
        this.gateType = gateType;
    }
}