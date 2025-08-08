package 设计模式.职责链模式;

public class LeaveRequest {

    private String name;
    private int days;
    private String reason;

    public LeaveRequest() {
    }

    public LeaveRequest(String name, int days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getReason() {
        return reason;
    }

}