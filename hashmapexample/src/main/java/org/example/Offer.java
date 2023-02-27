package org.example;

public class Offer {
    private String percentage;
    private String startDate;
    private String endDate;

    public Offer(String percentage, String startDate, String endDate) {
        this.percentage = percentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "percentage='" + percentage + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
